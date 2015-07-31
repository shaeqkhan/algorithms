package com.questions;

import org.junit.Assert;
import org.junit.Test;

public class ClosestPairTest {

	@Test
	public void test() {
		int[] A = {1,4,5,7};
		int[] B = {10,20,30,40};
		int target = 32;
		
		int[] expected = {1,30};
		Assert.assertArrayEquals(expected, ClosestPair.find(A, B, target));
		
	}
	
	@Test
	public void test1() {
		int[] A = {1,4,5,7};
		int[] B = {10,20,30,40};
		int target = 50;
		
		int[] expected = {7,40};
		Assert.assertArrayEquals(expected, ClosestPair.find(A, B, target));
	}
	
	@Test
	public void test2() {
		int[] A = {1,4,5,7};
		int[] B = {10,20,30,40};
		int target = 38;
		
		int[] expected = {7,30};
		Assert.assertArrayEquals(expected, ClosestPair.find(A, B, target));
	}
	
	@Test
	public void test3() {
		int[] A = {1,4,5,7};
		int[] B = {10,20,30,40};
		int target = 0;
		
		int[] expected = {1,10};
		Assert.assertArrayEquals(expected, ClosestPair.find(A, B, target));
	}

}
