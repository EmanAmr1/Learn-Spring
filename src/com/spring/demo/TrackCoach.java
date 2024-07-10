package com.spring.demo;

public class TrackCoach implements Coach {

	
	//define a private field for the service
	private FortuneService fortuneService;
	
	//define a constructor for dependency 
	public TrackCoach(FortuneService thefortuneService) {
		fortuneService=thefortuneService;	
	}
	
	
	@Override
	public String getDailyWorkOut() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return "just do it: " +fortuneService.getFortune();
	}

}
