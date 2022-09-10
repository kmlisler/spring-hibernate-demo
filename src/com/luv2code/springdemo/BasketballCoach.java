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
		return "Jump jump" + fortuneService.getFortune();
	}
	// create bean init method
	public void doMyStartUpStuff() {
		System.out.println("Bean startup stuff worked");
	}
	// create bean destroy method
	public void doMyCleanUpStuff() {
		System.out.println("Bean destroy stuff worked");
	}

}
