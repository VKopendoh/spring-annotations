package com.vkopendoh.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
	
		//read spring conf file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from container
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);		
		
		//call method from bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close
		context.close();
	}

}
