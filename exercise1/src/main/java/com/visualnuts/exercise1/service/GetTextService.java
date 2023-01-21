package com.visualnuts.exercise1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.visualnuts.exercise1.utils.Utils;

@Component
public class GetTextService {

	@Autowired
	private Utils utils;

	public String getText(Integer number) {
		if (utils.isDivisibleByBoth(number)) {
			return "Visual Nuts";
		}
		
		if (utils.isDivisibleBy5(number)) {
			return "Nuts";
		}
		
		if (utils.isDivisibleBy3(number)) {
			return "Visual";
		}

		return number.toString();
	}

}
