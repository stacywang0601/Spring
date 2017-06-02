package com.pers.springdemo;

import org.springframework.stereotype.Component;

// bean id
@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
}
