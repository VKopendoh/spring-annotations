package com.vkopendoh.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SoccerJavaConfigDemoApp {

	public static void main(String[] args) {
	
		//read spring conf file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		AnnotationConfigApplicationContext logger = 
				new AnnotationConfigApplicationContext(MyLoggerConfig.class);
		
		//get the bean from container
		SoccerCoach theCoach = context.getBean("soccerCoach", SoccerCoach.class);		
		
		//call method from bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail());
		
		System.out.println(theCoach.getTeam());
		
		//close
		context.close();
		logger.close();
	}

}
