package com.luv2code.springdemo;

public class VoleyballCoach implements Coach {
	

	private FortuneService fortuneService;
	
	public VoleyballCoach() {
		System.out.println("voleyball coach inside no-args const ");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("voleyball coach inside setter ");
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

}
