package com.algorithms.searchsort;

import com.helper.ArraysUtil;

/*
 * Binary Insertion Sort is an improvement on the normal insertion sort
 * 
 * Use binary search to reduce the number comparisons in normal insertion sort
 * This algorithm uses binary search to find the proper location to insert the
 * selected item at each iteration
 * 
 * Time complexity  : O(n^2) because of the series of swaps required for each insertion
 * Space complexity : O(1)
 */

public class BinaryInsertionSort {
	
	/*
	 * @param A  an integer array
	 * @return   an integer array sorted in ascending order
	 */
	public static int[] apply(int[] A) {
		
		for(int i = 1; i < A.length; i++) {
			int current = A[i];
			int j = i - 1;
			int location = BinarySearch.apply(A, current, 0, j); System.out.println("LOCATION : " + location);
			
			while(j >= location) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = current;
			ArraysUtil.print(A);
		}
		
		return A;
	}
	
}
