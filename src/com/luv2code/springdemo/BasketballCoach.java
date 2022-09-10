package com.luv2code.springdemo;

public class BasketballCoach implements Coach {
	
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	// define a private field for the dependency injection
	private FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "GO DUUUUUUUUUUNKKKKKKKKKKKKKK";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Jump jump"+fortuneService.getFortune();
	}
	
}
