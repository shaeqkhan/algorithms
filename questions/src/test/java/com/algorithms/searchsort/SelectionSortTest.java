package com.algorithms.searchsort;

import org.junit.Assert;
import org.junit.Test;

import com.algorithms.searchsort.SelectionSort;

public class SelectionSortTest {

	@Test
	public void test() {
		int[] A = {64,25,12,22,11};
		int[] sortedA = {11,12,22,25,64};
		Assert.assertArrayEquals(SelectionSort.apply(A), sortedA);
	}
	
	@Test
	public void testEmptyArray() {
		int[] A = {};
		int[] sortedA = {};
		Assert.assertArrayEquals(SelectionSort.apply(A), sortedA);
	}
	
	@Test
	public void testSizeOne() {
		int[] A = {1};
		int[] sortedA = {1};
		Assert.assertArrayEquals(SelectionSort.apply(A), sortedA);
	}

}