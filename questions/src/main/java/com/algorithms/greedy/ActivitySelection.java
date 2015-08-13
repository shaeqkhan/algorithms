package com.algorithms.greedy;

import com.helper.ArraysUtil;

/*
 * A mathematical optimization problem concerning the selection of non-conflicting 
 * activities to perform within a given time frame. Given a set of activities each
 * marked by a start and finish time, the problem is to select the maximum number of
 * activities that a person can only work on a single activity at a time.
 * 
 * The greedy choice is to always pick the next activity whose finish time is least
 * among the remaining activities and the start time is more than or equal to the
 * finish time of previously selected activity. We can sort the activity by their 
 * finish time so that they always consider the next activity as minimum finishing
 * activity.
 * 
 * 1. Sort activities according to their finishing time
 * 2. Select the first activity from he sorted array and print it.
 * 3. For the rest of the activities, if the start time of this activity is greater
 * than or the same as the finish time of the previously selected activity, then select 
 * this activity and print it.
 * 
 * Example
 * start[]  = { 1, 3, 0, 5, 8, 5}
 * finish[] = { 2, 4, 6, 7, 9, 9}
 * Minimum set of activities that can be executed by a single person is { 0, 1, 3, 4}
 */

public class ActivitySelection {
	
	public static void find(int[] start, int[] finish) {
		
		sort(start, finish);
		
		System.out.println("Activity indices : 0, ");
		
		int i = 0;
		for(int j = 1; j < finish.length; j++) {
			if(start[j] >= finish[i]) {
				i = j; 
				System.out.print(j + ", ");
			}
		}
		
	}
	
	private static void sort(int[] start, int[] finish) {
		
		for(int i = 0; i < finish.length; i++) {
			
			int minIndex = i;
			
			for(int j = i + 1; j < finish.length; j++) {
				if(finish[j] < finish[minIndex]) {
					minIndex = j;
				}
			}
			
			if(i != minIndex) {
				int temp = finish[minIndex];
				finish[minIndex] = finish[i];
				finish[i] = temp;
				temp = start[minIndex];
				start[minIndex] = start[i];
				start[i] = temp;
			}
			
			System.out.println("START: "); ArraysUtil.print(start);
			System.out.println("FINISH: "); ArraysUtil.print(finish);
		}
		
	}
	
}
