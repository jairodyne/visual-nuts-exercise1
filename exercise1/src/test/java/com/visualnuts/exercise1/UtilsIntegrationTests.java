package com.visualnuts.exercise1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.visualnuts.exercise1.utils.Exercise1Utils;

@SpringBootTest
class UtilsIntegrationTests {

	@Autowired
	private Exercise1Utils exercise1Utils;
	
	@Test
	void isDivisibleBy3Works() {
		Boolean result = null;
		Integer numberDivisibleBy3 = 33;
		
		result = exercise1Utils.isDivisibleBy3(numberDivisibleBy3);
		
		assertThat(result).isNotNull();
		assertThat(result).isTrue();
	}

	@Test
	void mustFailDivisibleBy3_WhenNotMultipleOf3() {
		Boolean result = null;
		Integer numberNotDivisibleBy3 = 10;
		
		result = exercise1Utils.isDivisibleBy3(numberNotDivisibleBy3);
		
		assertThat(result).isNotNull();
		assertThat(result).isFalse();
	}
	
	@Test
	void isDivisibleBy5Works() {
		Boolean result = null;
		Integer numberDivisibleBy5 = 50;
		
		result = exercise1Utils.isDivisibleBy5(numberDivisibleBy5);
		
		assertThat(result).isNotNull();
		assertThat(result).isTrue();
	}
	
	@Test
	void mustFailDivisibleBy5_WhenNotMultipleOf5() {
		Boolean result = null;
		Integer numberNotDivisibleBy5 = 11;
		
		result = exercise1Utils.isDivisibleBy5(numberNotDivisibleBy5);
		
		assertThat(result).isNotNull();
		assertThat(result).isFalse();
	}
	
	@Test
	void isDivisibleByBothWorks() {
		Boolean result = null;
		Integer numberDivisibleByBoth = 15;
		
		result = exercise1Utils.isDivisibleByBoth(numberDivisibleByBoth);
		
		assertThat(result).isNotNull();
		assertThat(result).isTrue();
	}
	
	@Test
	void mustFailDivisibleBy5_WhenNotMultipleOfBoth() {
		Boolean result = null;
		Integer numberDivisibleByBoth = 12;
		
		result = exercise1Utils.isDivisibleByBoth(numberDivisibleByBoth);
		
		assertThat(result).isNotNull();
		assertThat(result).isFalse();
	}
	
}
