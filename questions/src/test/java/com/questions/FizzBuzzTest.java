package com.questions;

import junit.framework.Assert;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		String[] result = FizzBuzz.apply(A, 20);
		String[] expected = {"1","2","fizz","4","buzz","fizz","7","8","fizz","buzz",
				"11","fizz","13","14","fizzbuzz","16","17","fizz","19","buzz"};
		
		for(int i = 0; i < 20; i++) {
			Assert.assertEquals(expected[i], result[i]);
		}
	}

}
