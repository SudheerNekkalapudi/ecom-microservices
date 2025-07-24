package com.ecom.product_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.product_service.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	// Custom query methods can be defined here if needed
	// For example, find products by category, price range, etc.
	Optional<Product> findByName(String name);

}
