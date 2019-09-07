package com.vkopendoh.springannotations;


public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SoccerCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {	
		return "Run with ball all day.";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

}
