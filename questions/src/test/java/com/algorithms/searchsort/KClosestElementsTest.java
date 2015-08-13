package com.algorithms.searchsort;

import org.junit.Assert;
import org.junit.Test;

import com.algorithms.searchsort.KClosestElements;

public class KClosestElementsTest {

	@Test
	public void test() {
		int[] A = {12,16,22,30,35,39,42,45,48,50,53,55};		
		int[] closestNumbers = KClosestElements.find(A, 4, 35, A.length);
		
		int[] result = {39,30,42,45};
		Assert.assertArrayEquals(closestNumbers, result);
	}

}
