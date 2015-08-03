package com.algorithms.searchsort;

import org.junit.Assert;
import org.junit.Test;

import com.algorithms.searchsort.BinaryInsertionSort;

public class BinaryInsertionSortTest {

	@Test
	public void test() {
		int[] A = {3,7,4,9,5,2,6,1};
		int[] sortedA = {1,2,3,4,5,6,7,9};
		Assert.assertArrayEquals(BinaryInsertionSort.apply(A), sortedA);
	}
	
	@Test
	public void test1() {
		int[] A = {37,23,0,17,12,72,31,46,100,88,54};
		int[] sortedA = {0,12,17,23,31,37,46,54,72,88,100};
		Assert.assertArrayEquals(BinaryInsertionSort.apply(A), sortedA);
	}

}
