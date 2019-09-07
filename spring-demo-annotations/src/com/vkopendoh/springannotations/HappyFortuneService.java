package com.vkopendoh.springannotations;

import org.springframework.stereotype.Component;

@Component("myFortune")
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {	
		return "It's your lucky day!";
	}

}
