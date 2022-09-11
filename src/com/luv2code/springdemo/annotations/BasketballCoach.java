package com.luv2code.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component("myCoach")
// if we dont give the bean id for component. default bean id will be basketballCoach
@Component
public class BasketballCoach implements Coach {	
	// field injection, create default const for fortune service
	// and inject it to class
	
	// bu componentte hangi fortuneservice'e(hangi spesifik bean'e) gideceğini söylemezsek hata alırız çünkü 3 tane fortuneservice'i implement eden bean var
	// bu yüzden Qualifier ile hangisine autowire edeceğimizi seçebiliriz
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*// constructor injection
	 * spring will scan for a component that implements fortunservice interface
	// bu örnekte HappyFortuneService bulunur ve BasketballCoach sınıfımıza inject edilir.
	@Autowired
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	
	/*
	// setter injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setter func setFortuneService BasketballCoach");
		this.fortuneService = fortuneService;
	}
	// default const
	public BasketballCoach() {
		System.out.println("default const BasketballCoach");
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "GO DUNK MA**";
	}
	@Override
	public String getDailyFortune() {	
		return fortuneService.getFortune();
	}

}
