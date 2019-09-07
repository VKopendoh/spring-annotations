package com.vkopendoh.springannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {
	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public SwimCoach() {
		System.out.println(">> SwimCoach inside my default constructor");
	}
	
	//define my init method
	@PostConstruct
	 public void doStartup() {
		 System.out.println(">> SwimCoach: inside doStartup");
	 }
	 
	 //define my destroy method
	@PreDestroy
	public void doCleanup() {
		System.out.println(">> SwimCoach inside my doCleanup()");
	}
	
	
	@Override
	public String getDailyWorkout() {		
		return "Train with all your team: " + team + " and mail your coach in any time: " + email;
	}

	@Override
	public String getDailyFortune() {	
		return fortuneService.getFortune();
	}

}
