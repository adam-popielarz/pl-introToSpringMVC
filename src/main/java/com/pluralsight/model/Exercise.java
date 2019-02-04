package com.pluralsight.model;

import javax.validation.constraints.NotNull;

public class Exercise {
	
	@NotNull
	private String activity;

	private int minutes;

	public String getActivity() {
		return activity;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	
}
