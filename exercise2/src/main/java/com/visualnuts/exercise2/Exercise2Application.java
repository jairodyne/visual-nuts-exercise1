package com.visualnuts.exercise2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Exercise2Application  {

	public static void main(String[] args) {
		
		/**
		 * BTW : The "JSON" data provided in the exercise 2 is "not valid".
		 * But, fixing it ... here we go.
		 */
        List<Country> data = List.of(
            new Country("US", List.of("en")),
            new Country("BE", List.of("nl", "fr", "de")),
            new Country("NL", List.of("nl", "fy")),
            new Country("DE", List.of("de")),
            new Country("ES", List.of("es"))
        );
        
        // - returns the number of countries in the world
        System.out.println("Number of countries in the world : " + data.size());


        // - finds the country with the most official languages where they officially speak German (de)
        String countryWithMostGermanLanguages = data.stream()
                .filter(c -> c.getLanguages().contains("de"))
                .max(Comparator.comparingInt(c -> c.getLanguages().size()))
                .map(Country::getCountry)
                .orElse("none");
        System.out.println("The Country with the most official languages, where they officially speak German : " + countryWithMostGermanLanguages);

        // - that counts all official languages spoken in the listed countries
        Long totalLanguages = data.stream()
                .map(Country::getLanguages)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println("Total of all official languages spoken in the listed countries : " + totalLanguages);

        // - to find the country with the highest number of official languages
        String countryWithMostLanguages = data.stream()
                .max(Comparator.comparingInt(c -> c.getLanguages().size()))
                .map(Country::getCountry)
                .orElse("none");
        System.out.println("The Country with the highest number of official languages : " + countryWithMostLanguages);

        // - to find the most common official language(s) of all countries
        Map<String, Long> languageCounts = data.stream()
                .map(Country::getLanguages)
                .flatMap(List::stream)
                .collect(Collectors.groupingBy(l -> l, Collectors.counting()));
        String mostCommonLanguages = languageCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("none");
        System.out.println("The most common official language(s): " + mostCommonLanguages);
		
	}

	
    static class Country {
        private String country;
        private List<String> languages;

        public Country(String country, List<String> languages) {
            this.country = country;
            this.languages = languages;
        }

        public String getCountry() {
            return country;
        }

        public List<String> getLanguages() {
            return languages;
        }
    }

}
