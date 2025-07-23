package com.ecom.product_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.product_service.entity.Product;
import com.ecom.product_service.exceptions.ProductNotFoundException;
import com.ecom.product_service.repository.ProductRepository;

@Service
public class ProductService {

	   @Autowired
	    private ProductRepository productRepository;

	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

	    public Product getProductById(Long id) {
	        return productRepository.findById(id)
	                .orElseThrow(() -> new ProductNotFoundException("Product not found"));
	    }

	    public Product createProduct(Product product) {
	        return productRepository.save(product);
	    }

	    public Product updateProduct(Long id, Product product) {
	        Product existing = getProductById(id);
	        existing.setName(product.getName());
	        existing.setDescription(product.getDescription());
	        existing.setPrice(product.getPrice());
	        existing.setStockQuantity(product.getStockQuantity());
	        existing.setCategory(product.getCategory());
	        return productRepository.save(existing);
	    }

	    public void deleteProduct(Long id) {
	        productRepository.deleteById(id);
	    }
}
