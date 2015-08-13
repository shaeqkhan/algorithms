package com.algorithms.searchsort;

/*
 * Find k closest elements to a given value
 * 
 * 1. Use binary search to find the crossover point in O(log n) time
 * 2. Compare elements on both sides of cross over points to print
 *    k closest elements in O(k) time
 */

public class KClosestElements {
	
	/*
	 * This method finds the k closest elements to the targetNumber
	 * 
	 * @param A             an integer array
	 * @param k             is the required number of closest elements to targetNumber
	 * @param targetNumber  is the number being searched for
	 * @param length        is the number of elements in the array 
	 * @return A			an integer array containing the k closest numbers
	 */
	public static int[] find(int[] A, int k, int targetNumber, int length) {
		
		int crossOverIndex = BinarySearch.apply(A, targetNumber, 0, length-1);
		
		int count = 0;
		int i = crossOverIndex - 1;
		int j = crossOverIndex + 1;
		int[] closestNumbers = new int[k];
		
		while(count < k && i >= 0 && j < length - 1) {
			
			if(A[crossOverIndex] - A[i] < A[j] - A[crossOverIndex]) {
				closestNumbers[count] = A[i]; System.out.print(A[i] + " ");
				i--;
			}
			
			else {
				closestNumbers[count] = A[j]; System.out.print(A[j] + " ");
				j++;
			}
			count++;
		
		}
		
		return closestNumbers;
	}	
}
