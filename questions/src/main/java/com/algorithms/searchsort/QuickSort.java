package com.algorithms.searchsort;

import com.helper.ArraysUtil;

/*
 * Quick Sort Algorithm
 * 
 * Pick the first element as a pivot and partition the array around the pivot.
 * For element x as a pivot, put x in the correct position in sorted array by
 * putting all smaller or equal elements before x and the greater elements after x.
 * 
 * Best case time complexity O(n)
 * Average case time complexity O(n * log n)
 * Worst case time complexity O(n^2)
 */

public class QuickSort {
	
	/*
	 * This method applies the divide and conquer technique for the sorting the array
	 * 
	 * @param A      an integer array
	 * @param left   index of the array
	 * @param right  index of the array
	 * @return A	 an integer array sorted in ascending order
	 */
	public static int[] apply(int[] A, int left, int right) {
		
		if(left < right) {
			int pivotIndex = partition(A, left, right); System.out.println("A[PIVOT]: " + A[pivotIndex]);
			A = apply(A, left, pivotIndex-1); 
			A = apply(A, pivotIndex+1, right); 
		}
		
		return A;
	}
	
	private static int partition(int[] A, int left, int right) {
		
		int pivot = A[left];
		ArraysUtil.print(A,left,right);
		
		while(left < right) {
			
			while(A[left] < pivot)
				left++;
			
			while(A[right] > pivot)
				right--;
			
			if(left < right)
				swap(A, left, right);
			else
				return right;
		}
		
		return right;
		
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
