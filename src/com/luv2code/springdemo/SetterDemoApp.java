package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load config xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		VoleyballCoach theCoach = context.getBean("myVoleyballCoach", VoleyballCoach.class);
		// call methods
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		// call our new methods for literal injection
		
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		// close the context
		context.close();

	}

}
