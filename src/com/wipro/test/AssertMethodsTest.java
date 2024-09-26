package com.wipro.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.task.AssertMethodsDemo;

class AssertMethodsTest {

	AssertMethodsDemo check = new AssertMethodsDemo();

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	// Check whether two arrays are equal or not
	void arrayTest() {
		int[] output = check.arrSort(new int[] { 2, 5, 7 });

		assertArrayEquals("Info about executed Test Case", new int[] { 2, 5, 7 }, output);
	}

	@Test
	// Check two objects are same or not
	void equalTest() {
		boolean output = check.stringIsEqual("KartikJ", "Kartik");

//		assertEquals(true,output);
//		assertSame(true,output);
		assertNotSame(true, output);
	}

	@Test
	// Check value is null or not
	void nullTest() {
		String expected = check.isNull();
		assertNull(null, expected);
//		assertNotNull(expected);
	}

	@Test
	// Conditional Tests
	void conditionTest() {
		assertTrue(20 > 4);
	}

	@Test
	// Matcher Tests
	void matchTest() {
		assertThat("123", CoreMatchers.is("123"));
	}

	@Test
	// When we actually want to fail the test
	void alwaysFail() {
//		fail("Intentionally Failed");
	}

}
