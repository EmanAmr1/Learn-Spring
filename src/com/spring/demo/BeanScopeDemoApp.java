package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context =new 
				ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach =context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach =context.getBean("myCoach",Coach.class);
		
		//check if they are the same 
		
		boolean result = (theCoach==alphaCoach);
		
		//print out the results
		System.out.println("\npointing to the same object ? " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		//close the context
        context.close();
		

	}

}
