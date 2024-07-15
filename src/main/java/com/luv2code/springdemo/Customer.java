package com.luv2code.springdemo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
public class Customer {
	
	@NotNull( message="is required")
	@Size(min=1 , message="is required")
	private String firstName;
	private String lastName;
	
	@NotNull( message="is required")
	@Min(value=0 ,message="must be greater than or equal zero" )
	@Max(value=10 ,message="must be less than or equal ten" )
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}" , message="only 5 chars/digits")
	private String postalCode;
	
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

	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	
	
}
