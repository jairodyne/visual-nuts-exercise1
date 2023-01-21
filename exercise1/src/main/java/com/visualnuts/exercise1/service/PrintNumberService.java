package com.visualnuts.exercise1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrintNumberService {

	@Autowired
	private GetTextService getTextService;
	
	private static final int MAX_NUMBER = 100;


	public void start(String finalNumber) {
		Integer validFinalNumber = validationNumber(finalNumber);
		for (int i = 1; i < validFinalNumber+1; i++) {
			System.out.println(getTextService.getText(i));
		}
	}
	
	/**
	 * BTW : Validation not specified about Messages, Exceptions, etc...
	 * @param number
	 * @return
	 */
	private Integer validationNumber(String number) {
		Integer intNumber = isNumeric(number) ? Integer.valueOf(number) : null;
		return intNumber == null || intNumber < 1 ? MAX_NUMBER : intNumber;
	}

    private static boolean isNumeric(String str){
        return str != null && str.matches("[0-9]+");
    }
	

}
