package com.example.exception;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionsAdvice {

	@ExceptionHandler(value = ValidationException.class)
	public ResponseEntity<ExceptionResponse> violations(ValidationException e) {
		var response = new ExceptionResponse(e.getMessage(), HttpStatus.BAD_REQUEST.value());
		response.setExceptionReason(HttpStatus.BAD_REQUEST.getReasonPhrase());
		
		response.setDetails(e.getViolations().stream().map(v -> v.getMessage()).collect(Collectors.toSet()));
		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.BAD_REQUEST);
	}
}
