/*
 * Given an array of distinct integer values, count the number of pair of integers that have a difference k.
 * 
 * Example {1,7,5,9,2,12,3} and k = 2
 * There are 4 pairs (1,3)(3,5)(5,7)(7,9)(9,7)
 * 
 * Solution does not require array to be sorted and finds the pairs in O(n) time
 */

package com.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PairsWithDifferenceK {
	
	public static List<Pair> getPairs(List<Integer> numList, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
		int index = 0;
		
		for(Integer i : numList) {
			map.put(i, index);
			index++;
		}
		
		List<Pair> pairs = new ArrayList<Pair>();
		for(Integer key : map.keySet()) {
			if(map.containsKey(key + k)) {
				pairs.add(new Pair(key, key + k));
			}
			else if(map.containsKey(key - k)) {
				pairs.add(new Pair(key, key - k));
			}
		}
		
		return pairs;
		
	}
	
}

class Pair {
	
	private int a;
	private int b;
	
	public Pair() {}
	
	public Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Pair [a=" + a + ", b=" + b + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}
	
	
	
}
