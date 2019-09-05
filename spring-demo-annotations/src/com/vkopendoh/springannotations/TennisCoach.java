package com.vkopendoh.springannotations;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Override
	public String getDailyWorkout() {	
		return "Practice with tennis coach";
	}
}
