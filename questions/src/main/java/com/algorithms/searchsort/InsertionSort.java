package com.algorithms.searchsort;

import com.helper.ArraysUtil;

/*
 * sorted partial result |   | unsorted data
 *     <=x  ...   >x     | x |      ...
 *     
 *     <=x | x | >x          | unsorted data
 *     
 * Efficient for small data sets.
 * Does not change the relative order of elements with equal keys
 * 
 * Space complexity : O(1)
 * Time complexity : O(n^2)
 * 
 * Efficient for data sets that are already substantially sorted,
 * the time complexity is O(nk) when each element in input is no more
 * than k places away from its sorted position.
 * 
 */

public class InsertionSort {
	
	/*
	 * This method sorts the array iteratively
	 * 
	 * @param A   an integer array
	 * @return A  a sorted integer array
	 */
	public static int[] apply(int[] A) {
		
		for(int i = 0; i < A.length; i++) {
			int current = A[i]; System.out.println("current: " + current);
			int j = i;
			while(j > 0 && A[j-1] > current) {
				A[j] = A[j-1];
				j = j - 1;		
			}
			A[j] = current;
			ArraysUtil.print(A);
		}
		
		return A;
	}
	
}
