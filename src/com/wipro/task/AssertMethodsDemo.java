package com.wipro.task;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class AssertMethodsDemo {

	public int[] arrSort(int arr[]) {

		Arrays.sort(arr);
		return arr;
	}

	public boolean stringIsEqual(String a, String b) {
		if (a == b)
			return true;
		return false;
	}

	public String isNull() {
		return null;
	}

}
