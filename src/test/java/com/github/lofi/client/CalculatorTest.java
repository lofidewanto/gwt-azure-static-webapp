package com.github.lofi.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	private static Logger logger = Logger.getLogger(CalculatorTest.class.getName());

	private Calculator calculator;

	public CalculatorTest() {
		this.calculator = new Calculator("Test");
	}

	@Test
	public void calculateSum() {
		assertNotNull(calculator);

		Double[] values = { 12.0, 14.0 };

		double result = calculator.calculateSum(values);
		assertEquals(26.0, result);

		logger.info("Result: " + result);
	}

	@Test
	public void calculateSum_With_Empty() {
		assertNotNull(calculator);

		Double[] values = {};

		double result = calculator.calculateSum(values);
		assertEquals(0.0, result);

		logger.info("Result: " + result);
	}
	
	@Test
	public void calculateSum_With_Null() {
		assertNotNull(calculator);

		Double[] values = null;

		double result = calculator.calculateSum(values);
		assertEquals(0.0, result);

		logger.info("Result: " + result);
	}
	
}
