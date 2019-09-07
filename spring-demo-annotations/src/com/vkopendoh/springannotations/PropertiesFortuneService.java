package com.vkopendoh.springannotations;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesFortuneService implements FortuneService {
	@Value("${foo.fortunes}")
	private String fortunesStr;
		
	@Override
	public String getFortune() {
		String[] fortunes = fortunesStr.split(":");
		Random random = new Random();	
		int index = random.nextInt(fortunes.length);		
		return fortunes[index];
	}

}
