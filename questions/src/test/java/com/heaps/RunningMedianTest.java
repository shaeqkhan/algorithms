package com.heaps;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RunningMedianTest {
	
	RunningMedian runningMedian;
	
	@Before
	public void setup() {
		runningMedian = new RunningMedian();
	}
	
	@Test
	public void test() {
		int[] numbers = {12, 4, 5, 3, 8, 7};
		double[] medians = runningMedian.getMedians(numbers);
		double[] expectedMedians = {12.0, 8.0, 5.0, 4.5, 5.0, 6.0};
		Assert.assertArrayEquals(expectedMedians, medians, 0.01);
	}

}
