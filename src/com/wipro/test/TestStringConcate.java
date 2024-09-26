package com.wipro.test;

import com.wipro.task.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcate {

//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test
	public void testDoStringConcat() {
		DailyTasks taskTest = new DailyTasks();
		String output = taskTest.doStringConcat("Kartik", "Jaiswal");

		assertEquals("Kartik Jaiswal", output);
	}

}
