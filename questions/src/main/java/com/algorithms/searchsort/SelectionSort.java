package com.algorithms.searchsort;

import com.helper.ArraysUtil;

/*
 * Selection Sort
 * 
 * 64 25 12 22 11 // this is the initial, starting state of the array
 * 11 25 12 22 64 // sorted sublist = {11}
 * 11 12 25 22 64 // sorted sublist = {11, 12}
 * 11 12 22 25 64 // sorted sublist = {11, 12, 22}
 * 11 12 22 25 64 // sorted sublist = {11, 12, 22, 25}
 * 11 12 22 25 64 // sorted sublist = {11, 12, 22, 25, 64}
 * 
 * Efficient for small data sets.
 * Worst case performance O(n^2)
 * Worst case time O(1)
 */

public class SelectionSort {
	
	/*
	 * Applies the algorithm in an iterative way
	 * 
	 * @param A   an integer array
	 * @return A  an integer array sorted in ascending order
	 */
	public static int[] apply(int[] A) {
		
		int minIndex;
		
		for(int i = 0; i < A.length; i++) {
			
			//assume first element is min
			minIndex = i;
			
			//test against elements after i
			for(int j = i + 1; j < A.length; j++) {
				if(A[j] < A[minIndex])
					minIndex = j; System.out.println("minIndex: " + minIndex);
			}
			
			if(minIndex != i) {
				int temp = A[i];
				A[i] = A[minIndex];
				A[minIndex] = temp;
			}
			
			ArraysUtil.print(A);
		}
		
		return A;
		
	}
	
}
