package com.questions;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {

	@Test
	public void test() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.byCopy(arr, 3);
		int[] expected = {5,6,7,1,2,3,4};
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void test1() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.byCopy(arr, 0);		
		Assert.assertArrayEquals(arr, result);
	}
	
	@Test
	public void test2() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.byCopy(arr, 7);		
		Assert.assertArrayEquals(arr, result);
	}
	
	@Test
	public void test3() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.byCopy(arr, 9);
		int[] expected = {6,7,1,2,3,4,5};
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void test4() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.byCopy(arr, 99);
		int[] expected = {7,1,2,3,4,5,6};
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void test5() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.bubbleRotate(arr, 3);
		int[] expected = {5,6,7,1,2,3,4};
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void test6() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.bubbleRotate(arr, 0);		
		Assert.assertArrayEquals(arr, result);
	}
	
	@Test
	public void test7() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.bubbleRotate(arr, 7);		
		Assert.assertArrayEquals(arr, result);
	}
	
	@Test
	public void test8() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.bubbleRotate(arr, 9);
		int[] expected = {6,7,1,2,3,4,5};
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void test9() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.bubbleRotate(arr, 99);
		int[] expected = {7,1,2,3,4,5,6};
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void test10() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.dynamic(arr, 3);
		int[] expected = {5,6,7,1,2,3,4};
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void test11() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.dynamic(arr, 0);		
		Assert.assertArrayEquals(arr, result);
	}
	
	@Test
	public void test12() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.dynamic(arr, 7);		
		Assert.assertArrayEquals(arr, result);
	}
	
	@Test
	public void test13() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.dynamic(arr, 9);
		int[] expected = {6,7,1,2,3,4,5};
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test
	public void test14() {
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = RotateArray.dynamic(arr, 99);
		int[] expected = {7,1,2,3,4,5,6};
		Assert.assertArrayEquals(expected, result);
	}

}
