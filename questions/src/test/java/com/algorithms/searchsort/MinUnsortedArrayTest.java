package com.algorithms.searchsort;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithms.searchsort.MinUnsortedArray;

public class MinUnsortedArrayTest {

	@Test
	public void test() {
		int[] A = {10,12,20,30,25,40,32,31,35,50,60};
		assertEquals(5, MinUnsortedArray.find(A, A.length));
	}
	
	@Test
	public void test1() {
		int[] A = {0,1,15,25,6,7,30,40,50};
		assertEquals(3, MinUnsortedArray.find(A, A.length));
	}

}
