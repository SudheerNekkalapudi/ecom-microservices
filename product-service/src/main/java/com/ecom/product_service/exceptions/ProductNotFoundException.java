package com.ecom.product_service.exceptions;

public class ProductNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(Long id) {
		super("Product not found with ID: " + id);
	}

	public ProductNotFoundException(String message) {
		super(message);
	}
	

}
