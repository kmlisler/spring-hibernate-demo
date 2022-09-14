package com.luv2code.springdemo.annotations;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Swim 100 meters for warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}