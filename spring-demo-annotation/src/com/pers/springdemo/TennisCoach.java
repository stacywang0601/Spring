package com.pers.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// bean id
@Component
public class TennisCoach implements Coach {
	@Autowired
	private FortuneService	fortuneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	/*
	 * // define a setter method
	 * @Autowired
	 * public void doSomeCrazyStuff(FortuneService thefortuneService) {
	 * System.out.println(">> TennisCoach: inside doSomeCrazyStuff method");
	 * fortuneService = thefortuneService;
	 * }
	 */

	/*
	 * @Autowired
	 * public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService;
	 * }
	 */
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
