package com.ecom.cart_service.model;

import java.time.Instant;
import java.util.List;

public class CartResponseDto {

    private Long id;
    private Integer userId;
    private Instant createdAt;
    private List<CartItemDto> items;
    
    public CartResponseDto() {
	}
    
    public CartResponseDto(Long id, Integer userId, List<CartItemDto> items) {
		this.id = id;
		this.userId = userId;
		//this.createdAt = createdAt;
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public List<CartItemDto> getItems() {
		return items;
	}

	public void setItems(List<CartItemDto> items) {
		this.items = items;
	}
}
