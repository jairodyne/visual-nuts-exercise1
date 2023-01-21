package com.visualnuts.exercise1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.visualnuts.exercise1.service.PrintNumberService;

@Controller
public class NumberController {
	
	@Autowired
	private PrintNumberService printNumberService;
	
	@GetMapping("/number")
	@ResponseBody
	public void printStart() {
		
		printNumberService.start(null);
		
	}

}
