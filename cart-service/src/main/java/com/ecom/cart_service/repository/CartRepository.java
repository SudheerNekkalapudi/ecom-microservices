package com.ecom.cart_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.cart_service.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

}
