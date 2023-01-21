package com.visualnuts.exercise1.utils;

import org.springframework.stereotype.Component;

@Component
public class Utils {
	
	public Boolean isDivisibleBy3 (Integer number) {
		return number % 3 == 0 ? true : false;
	}

	public Boolean isDivisibleBy5 (Integer number) {
		return number % 5 == 0 ? true : false;
	}
	
	public Boolean isDivisibleByBoth (Integer number) {
		return isDivisibleBy3(number) && isDivisibleBy5(number) ? true : false;
	}
	
}
