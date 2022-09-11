package com.luv2code.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp2 {

	public static void main(String[] args) {

		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		// get the bean from spring container
		Coach theCoach = context.getBean("basketballCoach",Coach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close context
		context.close();

	}

}
