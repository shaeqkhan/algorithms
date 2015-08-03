package com.algorithms.searchsort;

import com.helper.ArraysUtil;

/*
 * Bubble Sort
 * 
 * Repeatedly swap the adjacent elements if they are in the wrong order
 * Space complexity : O(1)
 * Time complexity : O(n^2)
 */

public class BubbleSort {
	
	/*
	 * This method sorts the array iteratively
	 * 
	 * @param A     an integer array
	 * @param size  number of elements in the array
	 */
	public static int[] apply(int[] A, int size) {
						
		for(int i = 0; i < size - 1; i++) {
			
			boolean isSwapped = false;
			
			for(int j = 0; j < size-i-1; j++) {
				
				if(A[j] > A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
					isSwapped = true;
				}
			}
			
			ArraysUtil.print(A);
			
			if(!isSwapped)
				break;
		}
		
		return A;
		
	}
	
}
