package com.luv2code.springdemo.validation;

import javax.Validation.ConstraintValidator;

public class courseCodeConstraintValidator implements ConstraintValidator <CourseCode,String>{

	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isvalid(String theCode, 
			ConstraintValidatorContext theConstraintValidatorContext)
	{
		boolean result = theCode.startsWith(coursePrefix);
		return result;
		
		if(theCode != null) {
			result=theCode.startsWith(coursePrefix);
		}else {
			result= true;
		}
	}
	
	
}
