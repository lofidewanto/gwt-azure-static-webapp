/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
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
