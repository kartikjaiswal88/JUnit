package com.wipro.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestSort {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		DailyTasks taskTest = new DailyTasks();
		int[] output = taskTest.sortValues(new int[] {2,6,3});
		
//		assertEquals("Kartik Jaiswal",output);
		assertArrayEquals(new int[]{2,3,6},output);
	}

}
