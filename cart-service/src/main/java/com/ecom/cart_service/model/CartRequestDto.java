package com.ecom.cart_service.model;

import java.util.List;

public class CartRequestDto {

    private Integer userId;
    private List<CartItemDto> items;
    
    public CartRequestDto() {
    	
    }
    public CartRequestDto(Integer userId, List<CartItemDto> items) {
		this.userId = userId;
		this.items = items;
	}
    
    public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<CartItemDto> getItems() {
		return items;
	}

	public void setItems(List<CartItemDto> items) {
		this.items = items;
	}
}
