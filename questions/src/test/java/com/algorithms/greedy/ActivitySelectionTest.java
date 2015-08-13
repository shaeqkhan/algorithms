package com.algorithms.greedy;

import org.junit.Test;

public class ActivitySelectionTest {

	@Test
	public void test() {
		int[] start = {5, 5, 3, 1, 0, 8};
		int[] finish = {9, 7, 4, 2, 6, 9};
		ActivitySelection.find(start, finish);
	}

}
 