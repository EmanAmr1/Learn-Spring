package com.spring.demo;

public class CricketCoach implements Coach {
	
	//define a private field for the service
	private FortuneService fortuneService;
	
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}


	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "practice fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
