package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	// define a private field for the dependency injection
	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public TrackCoach() {
		
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "RUN FORREST RUN";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it " + fortuneService.getFortune();
	}

}
