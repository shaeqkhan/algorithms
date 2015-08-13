package com.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Also called a union-find data structure or merge-find set
 * 
 * Keeps track of a set of elements partitioned into a number of disjoint 
 * non overlapping subsets. Supports two useful operations -
 * 
 * 	1. Find : determine which subset a particular element is in. Typically returns an 
 * 		item from the set that serves as its "representative". By comparing results from 
 * 		two find operations, we can determine whether two elements are in the same subset
 * 
 * 	2. Union : join two subsets into a single subset
 */

public class DisjointSet {
	
	// (representative, set)
	private List<Map<String, Set<String>>> disjointSet;
	
	public DisjointSet() {
		
		disjointSet = new ArrayList<Map<String, Set<String>>>();
	
	}
	
	/*
	 * Adding a new element to the Disjoint Set,
	 * a new set is created where this element is the sole member and
	 * is also the representative 
	 * 
	 * @param element  to add to the disjoint set
	 */
	public void createSet(String element) {
		
		Set<String> set = new HashSet<String>();
		set.add(element);
		
		Map<String, Set<String>> map = new HashMap<String, Set<String>>();		
		map.put(element, set);
		
		disjointSet.add(map);
	
	}
	
	/*
	 * Finding an element in the Disjoint Set
	 * 
	 * @param element  to be searched
	 * @return key     the representative of the set in which the element is found 
	 */
	public String find(String element) {
		
		for(int i = 0; i < disjointSet.size(); i++) {			
			for(String key : disjointSet.get(i).keySet()) {				
				Set<String> set = disjointSet.get(i).get(key);				
				if(set.contains(element))
					return key;
			}		
		}
		
		return null;
		
	}
	
	/*
	 * Merging two sets and selecting a new representative for the set
	 * 
	 * @param first  element selected
	 * @param second element selected
	 */
	public void union(String first, String second) {
		
		String firstRepresentative = find(first);
		String secondRepresentative = find(second);
		
		Set<String> firstSet = null;
		Set<String> secondSet = null;
		
		//look for the sets containing the first and second elements 
		for(int i = 0; i < disjointSet.size(); i++) {
			Map<String, Set<String>> map = disjointSet.get(i);
			if(map.containsKey(firstRepresentative)) {
				firstSet = map.get(firstRepresentative);
			}
			if(map.containsKey(secondRepresentative)) {
				secondSet = map.get(secondRepresentative);
			}
		}
		
		if(firstSet != null && secondSet != null) {
			
			//merge the two sets
			firstSet.addAll(secondSet);
			
			//select a representative and delete the set already merged 
			for(int i = 0; i < disjointSet.size(); i++) {
				Map<String, Set<String>> map = disjointSet.get(i);
				if(map.containsKey(firstRepresentative)) {
					map.put(firstRepresentative, firstSet);
				}
				else if(map.containsKey(secondRepresentative)) {
					map.remove(secondRepresentative);
					disjointSet.remove(i);
				}
			}
		}		
	}
	
	public int getSize() {
		return disjointSet.size();
	}
	
	public List<Map<String, Set<String>>> getDisjoinSets() {
		return disjointSet;
	}

	@Override
	public String toString() {
		
		String result = "";
		
		for(Map<String, Set<String>> map : disjointSet) {
			for(String key : map.keySet()) {
				result += "[key: " + key + "] values [ ";				
				for(String s : map.get(key))
					result += s + " ";
				result += " ]";
			}
		}
		
		return result;
	}
	
}
