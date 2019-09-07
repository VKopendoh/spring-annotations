package com.vkopendoh.springannotations;

import org.springframework.beans.factory.annotation.Value;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
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

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
}
