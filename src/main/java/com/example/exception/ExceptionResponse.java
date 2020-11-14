package com.example.exception;

import java.util.Set;

public class ExceptionResponse {
	private String message;
	private String exceptionReason;
	private int statusCode;
	private Set<String> details;
	
	public ExceptionResponse(String message, int statusCode) {
		super();
		this.message = message;
		this.statusCode = statusCode;
	}
	
	public String getExceptionReason() {
		return exceptionReason;
	}

	public void setExceptionReason(String exceptionReason) {
		this.exceptionReason = exceptionReason;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public Set<String> getDetails() {
		return details;
	}
	public void setDetails(Set<String> details) {
		this.details = details;
	}
}
