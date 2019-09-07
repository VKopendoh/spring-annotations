package com.vkopendoh.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.vkopendoh.springannotations")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	//define bean for fortune service, the methods name will be the "bean ID"
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();		
	}
	
	//def bean for soccerCoach and inject dependency
	@Bean
	public Coach soccerCoach() {
		return new SoccerCoach(sadFortuneService());
	}
	
}
