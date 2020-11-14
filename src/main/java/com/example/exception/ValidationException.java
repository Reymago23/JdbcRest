package com.example.exception;

import java.util.Set;

import javax.validation.ConstraintViolation;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private Set<ConstraintViolation<Object>> violations;
	private String message;
	
	public ValidationException(Set<ConstraintViolation<Object>> violations, String message) {
		super();
		this.violations = violations;
		this.message = message;
	}

	public Set<ConstraintViolation<Object>> getViolations() {
		return violations;
	}

	public void setViolations(Set<ConstraintViolation<Object>> violations) {
		this.violations = violations;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
