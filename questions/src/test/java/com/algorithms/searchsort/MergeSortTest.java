package com.algorithms.searchsort;

import org.junit.Assert;
import org.junit.Test;

import com.algorithms.searchsort.MergeSort;

public class MergeSortTest {

	@Test
	public void test() {
		int[] A = {3,7,4,9,5,2,6,1};
		int[] sortedA = {1,2,3,4,5,6,7,9};
		Assert.assertArrayEquals(MergeSort.apply(A,0,A.length-1), sortedA);
	}
	
	@Test
	public void testEmptyArray() {
		int[] A = {};
		int[] sortedA = {};
		Assert.assertArrayEquals(MergeSort.apply(A,0,A.length-1), sortedA);
	}
	
	@Test
	public void testSizeOne() {
		int[] A = {1};
		int[] sortedA = {1};
		Assert.assertArrayEquals(MergeSort.apply(A,0,A.length-1), sortedA);
	}

}
