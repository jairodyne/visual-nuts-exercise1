package com.visualnuts.exercise1.utils;

import org.springframework.stereotype.Component;

@Component
public class Exercise1Utils {
	
	public Boolean isDivisibleBy3 (Integer number) {
		return number % 3 == 0;
	}

	public Boolean isDivisibleBy5 (Integer number) {
		return number % 5 == 0;
	}
	
	public Boolean isDivisibleByBoth (Integer number) {
		return isDivisibleBy3(number) && isDivisibleBy5(number);
	}
	
}
