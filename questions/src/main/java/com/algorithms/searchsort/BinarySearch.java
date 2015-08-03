package com.algorithms.searchsort;

/*
 * Binary Search
 * 
 * The idea is to find a target in a sorted array to reduce the time complexity
 * by ignoring half the elements after each comparison (Divide & Conquer)
 * 
 * 		1. Compare target to the middle element
 * 		2. If equal, return the index of the middle element
 * 		3. If target is greater than the middle element, then target is in the 
 * 		   right half of the array. Call the method recursively for the second half
 * 		   of the array
 * 		4. If traget is smaller than the middle element, then target is in the 
 * 		   left half of the array. Call the method recursively for the first half
 * 		   of the array
 * 
 * Time complexity : T(n) = T(n/2) + c -> case 2 of the master theorem 
 * 					 O(log n)
 * Space complexity : O(1)
 * 
 */
public class BinarySearch {

	/*
	 * Recursive implementation of a search method to find the position
	 * of the target element
	 *  
	 * @param A       integer array sorted in ascending or descending order
	 * @param target  element being searched for 
	 * @param start	  index of the subarray
	 * @param end     index of the subarray
	 */
	public static int apply(int[] A, int target, int start, int end) {
		
		if(end <= start) {
			if(target > A[start])
				return start + 1;
			else
				return start;
		}
		
//		int mid = (start + end) >>> 1; //to prevent overflow
		int mid = (start + end) / 2; System.out.println("MID: " + mid);
		
		if(A[mid] == target)
			return mid;
		
		else if(A[mid] > target)
			return apply(A, target, start, mid-1);
		
		else
			return apply(A, target, mid+1, end);
	}
	
}
