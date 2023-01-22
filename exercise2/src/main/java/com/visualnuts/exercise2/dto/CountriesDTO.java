package com.visualnuts.exercise2.dto;

import java.util.ArrayList;
import java.util.List;

public class CountriesDTO {

	private String country;
	private List<String> languages = new ArrayList<String>();

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	
}
