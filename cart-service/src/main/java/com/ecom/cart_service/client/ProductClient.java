package com.ecom.cart_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecom.cart_service.model.ProductDto;

@FeignClient(name = "product-service")
public interface ProductClient {

    @GetMapping("/api/products/{id}")
    ProductDto getProductById(@PathVariable Long id);
    
    @GetMapping("/api/products/name/{name}")
    ProductDto getProductByName(@PathVariable String name);
}
