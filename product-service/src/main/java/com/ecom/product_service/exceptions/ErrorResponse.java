package com.ecom.product_service.exceptions;

/**
 * ErrorResponse is a class that represents the structure of an error response
 * returned by the application when an exception occurs.
 * It contains an error code and a message describing the error.
 */
public class ErrorResponse {

    private Integer errorCode;
    private String errorMessage;
    
    public ErrorResponse(Integer errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
