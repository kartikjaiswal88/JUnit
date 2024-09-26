package com.wipro.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestCheckPresence {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		DailyTasks taskTest = new DailyTasks();
		boolean output = taskTest.checkPresence("Kartik", "Kartik");

		assertTrue(output); // Passed when output is True
//		assertFalse(output); // Passed when output is False
	}

}
