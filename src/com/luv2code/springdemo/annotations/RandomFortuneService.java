package com.luv2code.springdemo.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {"1randomly1","2randomly2","3randomly3"};
	
	Random myRandom = new Random();
	@Override
	public String getFortune() {
		String theFortune = data[myRandom.nextInt(data.length)];
		return theFortune;
	}

}
