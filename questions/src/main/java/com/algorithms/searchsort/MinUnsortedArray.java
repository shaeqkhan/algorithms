package com.algorithms.searchsort;

import com.helper.ArraysUtil;

/*
 * Find the Minimum length Unsorted Subarray, sorting which makes the complete
 * array sorted
 * 
 * 1. Scan from left to right and find the first such element which is smaller
 * than the next element
 * 
 * 2. Scan from right to left and find the first such element which is bigger
 * than the next element.
 * 
 * 3. Find the min and max values in arr[start...end]
 * 
 * 4. Find first element in arr[0...start-1] greater than min, change start to
 * index of this element.
 * 
 * 5. Find last element in arr[end+1...n-1] smaller than max, change end to 
 * index of this element.
 */

public class MinUnsortedArray {
	
	/*
	 * See class description
	 * 
	 * @param A  an integer array
	 * @param n  number of elements in the array
	 * @return   size of the unsorted subarray
	 */
	public static int find(int[] A, int n) {
		
		//step 1
		int start;
		for(start = 0; start < n - 1; start++) {
			if(A[start] > A[start + 1])
				break;
		}
		System.out.println("STEP 1 : start : " + start);
		
		//array completely sorted
		if(start == n-1)
			return 0;
		
		//step 2
		int end;
		for(end = n - 1; end > 0; end--) {
			if(A[end-1] > A[end])
				break;
		}
		System.out.println("STEP 2 : end : " + end);
		
		//array completely sorted
		if(end == 0)
			return 0;
		
		//step 3
		int max = A[start], min = A[start];
		for(int i = start + 1; i <= end; i++) {
			if(max < A[i])
				max = A[i];
			if(min > A[i])
				min = A[i];
		}
		System.out.println("STEP 3 : MAX : " + max + " MIN : " + min);
		
		//step 4
		for(int i = 0; i < start; i++) {
			if(A[i] > min) {
				start = i; 
				break;
			}				
		}
		
		//step 5
		for(int i = n - 1; i >= end + 1; i--) {
			if(A[i] < max) {
				end = i; 
				break;
			}				
		}
		
		System.out.println("STEP 5 : start : " + start + " end : " + end);
		
		ArraysUtil.print(A,start,end);
		
		return end - start;
	}
	
}
