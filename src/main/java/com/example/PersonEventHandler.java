package com.example;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.example.exception.ValidationException;

@Component
@RepositoryEventHandler(Person.class)
public class PersonEventHandler {

	private static final Logger log = LoggerFactory.getLogger(PersonEventHandler.class);
	
	@Autowired
	private LocalValidatorFactoryBean validator;
	
	@HandleBeforeCreate
	public void handlePersonCreate(Person person) {
		log.info("Before Save: " + person.getFirstName());
		Set<ConstraintViolation<Object>> violations = validator.validate(person);
		if (violations.size() > 0) {
			throw new ValidationException(violations, "Validation errors were found.");
		}
	}
}
