package com.luv2code.springdemo;

public class VoleyballCoach implements Coach {
	



	private FortuneService fortuneService;
	
	// add new fields for literal value injection
	private String emailAddress;
	private String team;
	
	public VoleyballCoach() {
		System.out.println("voleyball coach inside no-args const ");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("voleyball coach set forune services ");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice service for 30 minutes each day";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("voleyball coach set email adres ");
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("voleyball coach set team ");
		this.team = team;
	}

}
