package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {
		// load config xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		//check if they are the same
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("are coachs same : "+result);
		
		System.out.println("Coach referance address        :" + theCoach);
		System.out.println("Alpha coach referance address  :" + alphaCoach);
		
		// close the context
		context.close();

	}

}
