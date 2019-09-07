package com.vkopendoh.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SillyCoach implements Coach {
	@Autowired
	@Qualifier("propertiesFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {	
		return "Silly coach here";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

}
