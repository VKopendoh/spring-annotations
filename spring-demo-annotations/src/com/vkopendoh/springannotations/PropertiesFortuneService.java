package com.vkopendoh.springannotations;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesFortuneService implements FortuneService {
	@Value("${foo.fortunes}")
	private String fortunesStr;
	
	private String[] fortunes;
	
	@PostConstruct
	private void setupData(){
		this.fortunes = fortunesStr.split(":");
	}
		
	@Override
	public String getFortune() {		
		Random random = new Random();	
		int index = random.nextInt(fortunes.length);		
		return fortunes[index];
	}

}
