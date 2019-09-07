package com.vkopendoh.springannotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private String[] fortunes = {"Great luck", "Today unlucky day((", "It's just a regular day"};	
	private Random myRand = new Random();	
	
	@Override
	public String getFortune() {
		int index = myRand.nextInt(fortunes.length);
		String theFortune = fortunes[index];		
		return theFortune;
	}

}
