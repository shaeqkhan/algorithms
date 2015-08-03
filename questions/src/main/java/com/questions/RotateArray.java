package com.questions;

import com.helper.ArraysUtil;

/*
 * Rotate an array of n elements to the right by k steps
 * 
 * Eg. For n = 7, k = 3, array[1,2,3,4,5,6,7]
 *         is rotated to array[5,6,7,1,2,3,4]
 */

public class RotateArray {
	
	/* 
	 * This method rotates the array by rearranging the array by k steps
	 *  
	 * Eg. arr[1,2,3,4,5,6,7]
	 * for k = 3, copy the last 3 elements into a new array 
	 * and then copy the rest of the elements.
	 * Time: O(n)
	 * Space: O(n)
	 * 
	 * @param arr[]  integer array that is not null
	 * @param k      non zero, positive integer
	 * @return arr[] rotated by copying into a new array 
	 */
	public static int[] byCopy(int[] arr, int k) {
		
		if(k == arr.length || k == 0)
			return arr;
		
		if(k > arr.length)
			k = k % arr.length;
		
		int[] result = new int[arr.length];
		
		//copy last k elements to new array
		for(int i = 0; i < k; i++) {
			result[i] = arr[arr.length - k + i]; System.out.print(result[i] + " ");
		}
		
		//copy rest of the array to new array
		for(int i = k, j = 0; i < arr.length; i++, j++) {
			result[i] = arr[j]; System.out.print(result[i] + " ");
		}
		
		System.out.println("");
		return result;
	}
	
	
	
	/*
	 * This method rotates the array using a variation of Bubble Sort
	 * 
	 * Eg. arr[1,2,3,4,5,6,7]
	 * for k = 1, shift the last element all the way to the front
	 * Time: O(n * k)
	 * Space: O(1)
	 * 
	 * @param arr[]  integer array that is not null
	 * @param k      non zero, positive integer
	 * @return arr[] rotated in place
	 */
	public static int[] bubbleRotate(int[] arr, int k) {
		
		for(int i = 0; i < k; i++) {
			
			for(int j = arr.length-1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
			ArraysUtil.print(arr);			
		}
		
		return arr;
		
	}
	
	
	
	/*
	 * This method rotates the array using dynamic programming
	 * 
	 * Eg. for arr[1,2,3,4,5,6,7] and k = 2
	 * 		1. Divide the array in two parts for k elements from the end
	 * 			[1,2,3,4,5] [6,7]
	 * 		2. Reverse each part [5,4,3,2,1] [7,6]
	 * 		3. Reverse the entire array [6,7,1,2,3,4,5]
	 * Time: O(n)
	 * Space: O(1)
	 * 
	 * @param arr[]  integer array that is not null
	 * @param k      non zero, positive integer
	 * @return arr[] rotated in place
	 */
	public static int[] dynamic(int[] arr, int k) {
		
		if(k > arr.length)
			k = k % arr.length;
		
		int index = (arr.length - 1) - k;
		arr = reverse(arr, 0, index); ArraysUtil.print(arr);
		arr = reverse(arr, index + 1, arr.length - 1); ArraysUtil.print(arr);
		arr = reverse(arr, 0, arr.length - 1); ArraysUtil.print(arr);
		
		return arr;
	}
	
	private static int[] reverse(int[] arr, int left, int right) {
		
		if(arr.length == 1)
			return arr;
		
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		return arr;
		
	}
	
}
