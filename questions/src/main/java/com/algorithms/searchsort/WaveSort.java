package com.algorithms.searchsort;

import com.helper.ArraysUtil;

/*
 * Wave Sort Algorithm
 * 
 * 1. Sort the array in ascending or descending order
 * 2. Select the elements on even indices and swap them with the element on
 * the index + 1 position
 */
public class WaveSort {
	
	public static int[] apply(int[] A) {
		
		//step 1
		A = MergeSort.apply(A, 0, A.length-1);
		ArraysUtil.print(A);
		
		//step 2
		for(int i = 0; i < A.length - 1; i+=2) {
			int temp = A[i];
			A[i] = A[i + 1];
			A[i + 1] = temp;
		}
		
		ArraysUtil.print(A);
		return A;
		
	}
	
}
