package com.spring.demo;

public class CricketCoach implements Coach {
	
	//define a private field for the service
	private FortuneService fortuneService;
	
	//add new fields for email address and team
	private String emailAddress;
	
	private String team;
	
	
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}


	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	

	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("CricketCoach: inside setter method-setEmailAddress");
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method-setTeam");
		this.team = team;
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method-setFortuneService");
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
