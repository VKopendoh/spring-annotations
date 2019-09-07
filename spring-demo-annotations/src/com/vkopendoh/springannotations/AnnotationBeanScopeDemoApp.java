package com.vkopendoh.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
	
		//load spring conf file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retriev bean
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//Beans are same?
		boolean res = (theCoach == alphaCoach);
		
		System.out.println("\n Point to the same object: "+ res);
		
		System.out.println("\n Memory location for theCoach: " + theCoach);
		
		System.out.println("\n Memory location for alphaCoach: " + alphaCoach);
		
		context.close();
	}

}
