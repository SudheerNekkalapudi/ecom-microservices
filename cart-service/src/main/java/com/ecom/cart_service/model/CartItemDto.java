package com.ecom.cart_service.model;

public class CartItemDto {
    private String productName;
    private Integer quantity;
    
    public CartItemDto() {
	}
    public CartItemDto(String productName, Integer quantity) {
		this.productName = productName;
		this.quantity = quantity;
	}

	public String getproductName() {
		return productName;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
