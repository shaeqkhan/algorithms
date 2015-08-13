package com.algorithms.searchsort;

import org.junit.Assert;
import org.junit.Test;

import com.algorithms.searchsort.WaveSort;

public class WaveSortTest {

	@Test
	public void test() {
		int[] A = {10,5,6,3,2,20,100,80};
		int[] waveA = {3,2,6,5,20,10,100,80};
		Assert.assertArrayEquals(WaveSort.apply(A), waveA);
	}
	
	@Test
	public void testEmptyArray() {
		int[] A = {};
		int[] waveA = {};
		Assert.assertArrayEquals(WaveSort.apply(A), waveA);
	}
	
	@Test
	public void testSizeOne() {
		int[] A = {1};
		int[] waveA = {1};
		Assert.assertArrayEquals(WaveSort.apply(A), waveA);
	}

}
