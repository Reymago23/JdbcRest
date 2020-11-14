package com.example;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;

public class Person {

	  @Id
	  private long id;
	  
	  @NotEmpty(message = "firstName Must not be empty")
	  private String firstName;
	  
	  @NotEmpty(message = "lastName Must not be empty")
	  private String lastName;

	  public String getFirstName() {
	    return firstName;
	  }

	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }

	  public String getLastName() {
	    return lastName;
	  }

	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }
}
