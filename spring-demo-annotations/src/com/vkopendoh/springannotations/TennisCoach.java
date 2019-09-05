package com.vkopendoh.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {	
		return "Practice with tennis coach";
	}
	
	@Override
	public String getDailyFortune() {	
		return fortuneService.getFortune();
	}
}
