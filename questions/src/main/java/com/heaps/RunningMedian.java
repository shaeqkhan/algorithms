/*
 * The median of a dataset of integers is the midpoint value of the dataset for which an equal number of integers 
 * are less than and greater than the value. To find the median, you must first sort your dataset of integers in 
 * non-decreasing order, then:
 * 		
 * 		- If your dataset contains an odd number of elements, the median is the middle element of the sorted sample. 
 * 		  In the sorted dataset {1,2,3}, 2 is the median.
 * 		- If your dataset contains an even number of elements, the median is the average of the two middle elements 
 * 		  of the sorted sample. In the sorted dataset {1,2,3,4}, 2.5 is the median.
 * 
 * Given an input stream of integers, you must perform the following task for each integer:
 * 		1. Add the integer to a running list of integers.
 * 		2. Find the median of the updated list (i.e., for the first element through the  element). 
 * 		3. Print the list's updated median on a new line. The printed value must be a double-precision number scaled 
 * 		   to decimal place
 * 
 * Sample input: 12 4 5 3 8 7
 * 
 * Sample output: 12.0 8.0 5.0 4.5 5.0 6.0
 * 
 * list = {12}, median = 12.0
 * list = {12,4} -> {4,12}, median = (12 + 4)/2 = 8.0
 * list = {12,4,5} -> {4,5,12}, median = 5.0
 * list = {12,4,5,3} -> {3,4,5,12}, median = (4 + 5)/2 = 4.5
 * list = {12,4,5,3,8} -> {3,4,5,8,12}, median = 5.0
 * list = {12,4,5,3,8,7} -> {3,4,5,7,8,12}, median = (5 + 7)/2 = 6.0
 * 
 */

package com.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RunningMedian {
	
	/*
	 * We can use heaps to solve this because the elements don't need to be ordered
	 * We need to determine which side of the median does the element lie because to 
	 * calculate the median we need the top most element of the min heap and max heap or
	 * we need the top element of the bigger heap i.e. the middle element 
	 */
	
	//step 1 - create two heaps
	//min heap for numbers greater than the median
	PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
	
	//max heap for numbers less than the median, change natural ordering of integers
	PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>( new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return -1 * a.compareTo(b);
			}
	});
			
	public double[] getMedians(int[] numbers) {
		
		double[] medians = new double[numbers.length];
		
		for(int i = 0; i < numbers.length; i++) {
			
			int number = numbers[i];
			
			//step 2 - for each number, add it to a heap
			heapify(number); 
			
			//step 3 - rebalance the heap
			//difference of # of elements in the heaps -> {0,1}
			rebalance(); 
			
			//step 4 - use the heaps to calculate the new median 
			medians[i] = calculateUpdatedMedian(); 
			
		}
		return medians;
		
	}

	private double calculateUpdatedMedian() {
		
		double median = 0.0;
		
		if(maxHeap.size() > minHeap.size()) {
			median = (double) maxHeap.peek();
		}
		else if(maxHeap.size() < minHeap.size()) {
			median = (double) minHeap.peek();
		}
		else {
			median = (double)(maxHeap.peek() + minHeap.peek())/2;
		}
		System.out.println("Median : " + median);
		return median;
	}

	private void rebalance() {
		
		while(maxHeap.size() - minHeap.size() > 1) {
			minHeap.add(maxHeap.poll());
		}
		
		while(minHeap.size() - maxHeap.size() > 1) {
			maxHeap.add(minHeap.poll());
		}
		
		System.out.println("Rebalance : ");
		printHeap();
		
	}

	private void heapify(int number) {
		
		if(minHeap.size() == 0 || number < maxHeap.peek()) {
			maxHeap.add(number);
		}
		else {
			minHeap.add(number);
		}
		System.out.println("\nheapify : " + number);
		printHeap();
		
	}
	
	private void printHeap() {		
		System.out.println("MaxHeap : " + maxHeap.toString());
		System.out.println("MinHeap : " + minHeap.toString());		
	}
	
}
