package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context =new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach c =context.getBean("myCoach",Coach.class);
		
		
		//call methods on bean
		System.out.println(c.getDailyWorkOut());
		
		
		//call new method for fortune
		System.out.println(c.getDailyFortune());
		
		//close the context
          context.close();
	}

}
