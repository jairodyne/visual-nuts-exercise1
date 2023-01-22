package com.visualnuts.exercise2;

import java.io.File;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.visualnuts.exercise2.dto.CountriesDTO;

@SpringBootApplication
public class Exercise2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exercise2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		
		/**
		 * BTW : The JSON data provided in the exercise 2 is "not valid".
		 * But, fixing it ...
		 */
		CountriesDTO[] countries = objectMapper.readValue(new File("countries.json"), CountriesDTO[].class);
		
		System.out.println("Number of countries in the world = " + aFunction(countries));
	}
	
	public Integer aFunction(CountriesDTO[] countries) {
		
		// print customer details
		System.out.println("tamo ae...");

//		- returns the number of countries in the world
		Integer numberOfCountries = countries.length;
		
		
		
//		- finds the country with the most official languages, where they officially speak German (de).
		
//		- that counts all the official languages spoken in the listed countries.
//		- to find the country with the highest number of official languages.
//		- to find the most common official language(s), of all countries.
		
		
		
		return numberOfCountries;
	}
	

}
