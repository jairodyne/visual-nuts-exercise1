package com.visualnuts.exercise1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.visualnuts.exercise1.utils.Exercise1Utils;

@Component
public class GetTextService {

	@Autowired
	private Exercise1Utils exercise1Utils;

	public String getText(Integer number) {
		if (Boolean.TRUE.equals(exercise1Utils.isDivisibleByBoth(number))) {
			return "Visual Nuts";
		}
		
		if (Boolean.TRUE.equals(exercise1Utils.isDivisibleBy5(number))) {
			return "Nuts";
		}
		
		if (Boolean.TRUE.equals(exercise1Utils.isDivisibleBy3(number))) {
			return "Visual";
		}

		return number.toString();
	}

}
