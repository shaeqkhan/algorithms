package com.algorithms.searchsort;

import com.helper.ArraysUtil;

/*
 * MergeSort Algorithm
 * 
 * if(right > left)
 * 1. Find mid point to divide array into two halves m = (l+r)/2
 * 2. Call mergeSort for first half - mergeSort(arr,f,m)
 * 3. Call mergeSort for second half - mergeSort(arr,m+1,l)
 * 4. Merge the two halves sorted in step 2,3 - merge(arr,l,m,r)
 * 
 * Worst case time complexity O(n * log n)
 * Worst case space O(n)
 */

public class MergeSort {
	
	/*
	 * This method uses divide and conquer technique to apply the merge sort algorithm
	 * 
	 * @param A      an integer array
	 * @param left   index of the array
	 * @param right  index of the array
	 * @return A	 an integer array sorted in increasing order
	 */
	public static int[] apply(int[] A, int left, int right) {
		
		if(left < right) {
			
			//step 1
			int mid = (left + right) / 2; System.out.println("A[MID] : " + A[mid]);
			
			//step 2
			A = apply(A,left,mid); //ArraysUtil.print(A,left,mid);
			
			//step 3
			A = apply(A,mid+1,right); //ArraysUtil.print(A,mid+1,right);
			
			//step 4
			A = merge(A,left,mid,right); ArraysUtil.print(A,left,right);
		
		}
		
		return A;
	}
	
	private static int[] merge(int[] A, int left, int mid, int right) {
		
		int sizeL = mid - left + 1;
		int sizeR = right - mid;
		
		//temp arrays to hold unsorted parts of array
		int[] arrL = new int[sizeL]; 
		int[] arrR = new int[sizeR];
		
		//copying elements to temp arrays
		for(int i = 0; i < sizeL; i++)
			arrL[i] = A[left + i];
		
		for(int i = 0; i < sizeR; i++)
			arrR[i] = A[mid + 1 + i];
		
		//merge temp arrays back into A while sorting them
		int i = 0, j = 0, k = left;
		while(i < sizeL && j < sizeR) {
			if(arrL[i] <= arrR[j]) {
				A[k] = arrL[i];
				i++;
			}
			else {
				A[k] = arrR[j];
				j++;
			}
			k++;
		}
		
		//copy left over elements into A
		while(i < sizeL) {
			A[k] = arrL[i];
			k++;
			i++;
		}
		
		while(j < sizeR) {
			A[k] = arrR[j];
			k++;
			j++;
		}
		
		return A;
				
	}
	
}
