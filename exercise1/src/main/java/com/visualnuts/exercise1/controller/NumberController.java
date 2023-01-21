package com.visualnuts.exercise1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visualnuts.exercise1.service.PrintNumberService;

@RestController
@RequestMapping(value = "/number")
@Validated
public class NumberController {
	
	@Autowired
	private PrintNumberService printNumberService;
	
	@GetMapping
	public void printStart() {
		printNumberService.start(null);
	}

	@GetMapping("/{maxValue}")
	public void printStartMaxValue(@Validated @PathVariable String maxValue) {
		printNumberService.start(maxValue);
	}
	
	
}
