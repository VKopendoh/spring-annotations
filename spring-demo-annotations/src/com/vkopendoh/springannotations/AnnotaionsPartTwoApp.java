package com.vkopendoh.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotaionsPartTwoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		 Coach myCoach = context.getBean("swimCoach", SwimCoach.class);
		 
		 System.out.println(myCoach.getDailyWorkout());
		 System.out.println(myCoach.getDailyFortune() + "\n");	
		
		 Coach propCoach = context.getBean("sillyCoach", SillyCoach.class);
		 
		 System.out.println(propCoach.getDailyWorkout());
		 System.out.println(propCoach.getDailyFortune());
		 
		
		context.close();
	}

}
