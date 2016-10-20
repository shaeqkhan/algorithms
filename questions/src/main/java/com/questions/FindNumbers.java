/*
 * Print all positive integer solutions to the equation a^3 + b^3 = c^3 + d^3
 * where a,b,c,d are integers between 1 and 1000
 */

package com.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindNumbers {
	
	public static void calculate() {
		
		Map<Integer, Pair> map = new HashMap<Integer, Pair>();
		
		for(int c = 1; c < 1000; c++) {
			for(int d = 1; d < 1000; d++) {
				int result = (int) (Math.pow(c, 3) + Math.pow(d, 3));
				map.put(result, new Pair(c,d));
			}
		}
		
		for(int key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
	}
	
	public static void main(String[] args) {
		calculate();
	}
	
}
