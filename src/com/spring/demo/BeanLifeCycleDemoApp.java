package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context =new 
				ClassPathXmlApplicationContext("beanLifeCycleScopeApplicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach =context.getBean("myCoach",Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkOut());
		
		
		//call new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		//close the context
        context.close();
	}

}
