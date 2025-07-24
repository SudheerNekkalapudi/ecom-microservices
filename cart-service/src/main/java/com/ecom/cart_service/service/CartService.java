package com.ecom.cart_service.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.cart_service.client.ProductClient;
import com.ecom.cart_service.entity.Cart;
import com.ecom.cart_service.entity.CartItem;
import com.ecom.cart_service.model.CartRequestDto;
import com.ecom.cart_service.model.ProductDto;
import com.ecom.cart_service.repository.CartRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CartService {

    @Autowired
    private CartRepository cartRepository;
    
    @Autowired
    private ProductClient productClient;
    
    public String getProductName(String id) {
    	ProductDto product = productClient.getProductByName(id);
    	return product != null ? product.getName() : "Product not found";
    }

    @CircuitBreaker(name = "productServiceCircuitBreaker", fallbackMethod = "fallbackGetProductByName")
    public Cart createCart(CartRequestDto requestDto) {
        Cart cart = new Cart();
        cart.setUserId(requestDto.getUserId());     
        
        List<CartItem> items = requestDto.getItems().stream().map(dto -> {
        	ProductDto product = productClient.getProductByName(dto.getproductName());
            CartItem item = new CartItem();
            item.setProductId(product.getId());
            item.setQuantity(dto.getQuantity());
            item.setCart(cart);
            return item;
        }).collect(Collectors.toList());

        cart.setItems(items);

        return cartRepository.save(cart);
    }

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public Optional<Cart> getCartById(Long id) {
        return cartRepository.findById(id);
    }
    public ProductDto fallbackGetProductByName(String name, Throwable t) {
        System.out.println("Fallback triggered: " + t.getMessage());
        return new ProductDto(); // default or empty
    }
}

