package com.algorithms.searchsort;

import static org.junit.Assert.*;

import org.junit.Test;

import com.algorithms.searchsort.BinarySearch;

public class BinarySearchTest {

	@Test
	public void test() {
		int[] A = {1,10,20,21,33,39,44};
		assertEquals(3, BinarySearch.apply(A, 21, 0, A.length-1));
	}
	
	@Test
	public void test1() {
		int[] A = {1,10,20,21,33,39,44};
		assertEquals(1, BinarySearch.apply(A, 10, 0, A.length-1));
	}
	
	@Test
	public void test2() {
		int[] A = {1,10,20,21,33,39,44};
		assertEquals(5, BinarySearch.apply(A, 39, 0, A.length-1));
	}
	
	@Test
	public void test3() {
		int[] A = {1,10,20,21,33,39,44};
		assertEquals(0, BinarySearch.apply(A, 1, 0, A.length-1));
	}
	
	@Test
	public void test4() {
		int[] A = {1,10,20,21,33,39,44};
		assertEquals(6, BinarySearch.apply(A, 44, 0, A.length-1));
	}

}
