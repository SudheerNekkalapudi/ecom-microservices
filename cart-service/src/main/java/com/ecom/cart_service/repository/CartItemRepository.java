package com.ecom.cart_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.cart_service.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long>{

}
