package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;
import com.pluralsight.service.ExerciseService;

@Controller
public class MinutesController {

	@Autowired
	ExerciseService exerciseService;

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		System.out.println("exercise: " + exercise.getMinutes());
		System.out.println("exercise activity: " + exercise.getActivity());

		return "addMinutes";
//		return "forward:addMoreMinutes.html";
//		return "redirect:addMoreMinutes.html";
//		redirect powoduje zamknięcie poprzedniego requesta i wywołania zupełnie nowego; dane są tracone w trakcie
	}

	@GetMapping(value = "/activities")
	public @ResponseBody List<Activity> findAllActivities() {

		return exerciseService.findAllActivites();
	}

//	@RequestMapping(value = "/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise ) {
//		System.out.println("exercising: " + exercise.getMinutes());
//		
//		return "addMinutes";
//	}
}
