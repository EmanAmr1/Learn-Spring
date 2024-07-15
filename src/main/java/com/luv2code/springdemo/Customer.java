package com.luv2code.springdemo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;

public class Customer {
	
	@NotNull( message="is required")
	@Size(min=1 , message="is required")
	private String firstName;
	private String lastName;
	
	@Min(value=0 ,message="must be greater than or equal zero" )
	@Max(value=10 ,message="must be less than or equal ten" )
	private String freePasses;
	
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
	public String getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(String freePasses) {
		this.freePasses = freePasses;
	}

	
	
}
