package com.vkopendoh.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	//Spring use Reflections to inject a fields
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	
	
	//we can use any method for dependency injection
	
	/*
	 * @Autowired public void doSomething(FortuneService theFortuneService) {
	 * System.out.println(">> TennisCoach: inside doSomething()");
	 * this.fortuneService = theFortuneService; }
	 */
	
	//def setter
	/*
	 * @Autowired 
	 * public void setFortuneService(FortuneService theFortuneService) {
	 * System.out.println(">> TennisCoach: inside setFortuneService()");
	 * this.fortuneService = theFortuneService; }
	 */
	
	/*
	 * @Autowired 
	 * public TennisCoach(FortuneService theFortuneService) {
	 * this.fortuneService = theFortuneService; }
	 */
	
	
	
	@Override
	public String getDailyWorkout() {	
		return "Practice with tennis coach";
	}
	
	@Override
	public String getDailyFortune() {	
		return fortuneService.getFortune();
	}
}
