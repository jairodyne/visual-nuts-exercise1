package com.visualnuts.exercise1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrintNumberService {

	@Autowired
	private GetTextService getTextService;
	
	private static final int MAX_NUMBER = 100;


	public void start(Integer finalNumber) {
		finalNumber = validationNumber(finalNumber);
		
		for (int i = 1; i < finalNumber+1; i++) {
			String str = getTextService.getText(i); 
			System.out.println(str);
		}
	}
	
	/**
	 * Validation not specified about Messages, Exceptions, etc...
	 * @param number
	 * @return
	 */
	private Integer validationNumber(Integer number) {
		return number == null || number < 1 ? MAX_NUMBER : number;
	}

}
