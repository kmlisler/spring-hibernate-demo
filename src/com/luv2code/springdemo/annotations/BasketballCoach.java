package com.luv2code.springdemo.annotations;

import org.springframework.stereotype.Component;

// @Component("myCoach")
// if we dont give the bean id for component. default bean id will be basketballCoach
@Component
public class BasketballCoach implements Coach {	
	@Override
	public String getDailyWorkout() {
		return "GO DUNK MA**";
	}

}
