package com.questions;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PairsWithDifferenceKTest {

	@Test
	public void test() {
		List<Integer> numList = Arrays.asList(1,7,5,9,2,12,3);
		List<Pair> pairsResult = PairsWithDifferenceK.getPairs(numList, 2);
		List<Pair> expectedResult = Arrays.asList(new Pair(1,3), new Pair(3,5), new Pair(5,7), new Pair(7,9), new Pair(9,7));
		Assert.assertArrayEquals(expectedResult.toArray(), pairsResult.toArray());
	}

}
