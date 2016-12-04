package com.jvanhouteghem.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements CoachAnnotations {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}