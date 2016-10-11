/*
 * Two strings are considered to be anagrams of each other if the first strings letters can be rearranged to form the second string. 
 * In other words, both strings must contain the same exact letters in the same exact frequency 
 * For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 * 
 * Given two strings, a and b, that may or may not be of the same length, determine the minimum number of character deletions required 
 * to make  and  anagrams. Any characters can be deleted from either of the strings.
 * 
 * Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.
 */
		

package com.questions;

import java.util.HashMap;

public class Anagrams {
    
	public int calculate(String first, String second) {
        
		HashMap<Character, Integer> charCounterMap = new HashMap<Character, Integer>();
		
		/* loop over each character in the string and store in a hash map with a count 
		 * of number of times it appears in the string
		 * 		
		 * eg. first = "bacdc"
		 * 			
		 * Hash Map
		 * 			Character	Count
		 * 				b		  1
		 * 				a		  1
		 * 				c		  2
		 * 				d		  1
		 */
        for(char c : first.toCharArray()) {
        	int count = 1;
            if(charCounterMap.containsKey(c)) {
            	count = charCounterMap.get(c);
            	count++;
            	// when count is updated, remove the entry and add it with updated count
            	charCounterMap.remove(c); 
            }
            charCounterMap.put(c, count);
        }
        print(charCounterMap);
        
        /*
         * loop over each character in the second string and store the characters in 
         * the same hash map. Decrement the count since the character exists in complement 
         * and makes the two strings anagrams.
         * 
         * eg. second = "dcbad"
         * 
         * Hash Map
		 * 			Character	Count
		 * 				b		  0
		 * 				a		  0
		 * 				c		  1
		 * 				d		  -1
         */
        for(char c : second.toCharArray()) {
        	int count = -1;
            if(charCounterMap.containsKey(c)) {
            	count = charCounterMap.get(c);
            	count--;
            	// when count is updated, remove the entry and add it with updated count
            	charCounterMap.remove(c);
            }
            charCounterMap.put(c, count);
        }
        print(charCounterMap);
        
        int charRemoved = 0;
        for(Integer i : charCounterMap.values()) {
        	if(i != 0) {
               charRemoved += Math.abs(i); 
            }
        }
        
        return charRemoved;
    }

	private void print(HashMap<Character, Integer> charCounterMap2) {
		
		for(Character key : charCounterMap2.keySet()) {
			System.out.println(key + " " + charCounterMap2.get(key));
		}
		System.out.println("\n");
		
	}

}