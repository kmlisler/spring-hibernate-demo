package com.luv2code.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component("myCoach")
public class BasketballCoach implements Coach {	
	@Override
	public String getDailyWorkout() {
		return "GO DUNK MA**";
	}

}
