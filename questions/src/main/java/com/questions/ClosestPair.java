package com.questions;

/*
 * Find the closest pair from two sorted arrays.
 * 
 * Given two sorted arrays and a number, find the pair whose sum
 * is closest to target and the pair has an element from each array.
 * 
 * Algorithm
 * 
 *  1. Initialize a variable difference as infinite (stores the difference between the 
 *  pair and x), we need to find the minimum difference
 *  
 *  2. Initialize two index variables left and right in the given sorted array
 *  	- Initialize first to left most index in array 1 
 *  	- Initialize second to right most index in array 2
 *  
 *  3. Loop while left < A.length and right >= 0
 *  	- If abs( A[left] + B[right] - target) < difference,
 *  		then update difference and results
 *  	- If A[left] + B[right] < target, increment left
 *  	- Else increment right 
 */

public class ClosestPair {
	
	/*
	 * Finds a pair of number from each array whose sum is closest to a target number
	 * 
	 * @param A[]     non-negative integer array, sorted in ascending or descending order
	 * @param B[]     non-negative integer array, sorted in ascending or descending order
	 * @param target  to find a pair with sum closest to this number
	 * @return pair   integer array with the two numbers closest to the target
	 */
	public static int[] find(int[] A, int[] B, int target) {
		
		//step 1
		int difference = Integer.MAX_VALUE;
		
		//variables to store index of pair found
		int indexA = 0, indexB = 0;
		
		//step 2
		int left = 0, right = B.length - 1;
		
		//step 3
		while(left < A.length && right >= 0) {
			
			int elementsDifference = Math.abs(A[left] + B[right] - target);
			
			if(elementsDifference < difference) {				
				indexA = left;
				indexB = right;
				difference = elementsDifference;				
			}
			
			if(A[left] + B[right] < target)
				left++;
			else
				right--;
		}
		
		System.out.println("PAIR : " + A[indexA] + " , " + B[indexB]);
		
		int[] pair = {A[indexA], B[indexB]};
		return pair;
		
	}
	
}
