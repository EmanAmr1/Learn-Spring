package com.spring.demo;

public class BaseBallCoach implements Coach {
	
	
	//define a private field for the service
	private FortuneService fortuneService;
	
	//define a constructor for dependency 
	public BaseBallCoach(FortuneService thefortuneService) {
		fortuneService=thefortuneService;	
	}
	

	@Override
	public String getDailyWorkOut() {	
			return "spending 30 min in batting practice";
				
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
	

}
