package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		
		ClassPathXmlApplicationContext context =new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach c =context.getBean("CricketCoach",CricketCoach.class);
		
		
		//call methods on bean
		System.out.println(c.getDailyWorkOut());
		
		
		//call new method for fortune
		System.out.println(c.getDailyFortune());
		
		//close the context
          context.close();

	}

}
