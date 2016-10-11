/*
 * A kidnapper wrote a ransom note but is worried it will be traced back to him. 
 * He found a magazine and wants to know if he can cut out whole words from it and 
 * use them to create an untraceable replica of his ransom note. The words in his 
 * note are case-sensitive and he must use whole words available in the magazine, 
 * meaning he cannot use substrings or concatenation to create the words he needs.
 * 
 * Given the words in the magazine and the words in the ransom note, 
 * 		print Yes if he can replicate his ransom note exactly using whole words from the magazine; 
 * 		otherwise, print No.
 */

package com.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RansomNote {

	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;

	public RansomNote(String magazine, String note) {
		
		magazineMap = new HashMap<String, Integer>();
		
		// split words and store in hashmap
		String[] magazineWords = magazine.split(" ");
		for (String magazineWord : magazineWords) {
			int count = 1;
			if (magazineMap.containsKey(magazineWord)) {
				count = magazineMap.get(magazineWord);
				count++;
				magazineMap.remove(magazineWord);
			}
			magazineMap.put(magazineWord, count);
		}
		
		for (String key : magazineMap.keySet()) {
			System.out.println(key + " " + magazineMap.get(key));
		}

		noteMap = new HashMap<String, Integer>();
		String[] noteWords = note.split(" ");
		for (String noteWord : noteWords) {
			int count = 1;
			if (noteMap.containsKey(noteWord)) {
				count = magazineMap.get(noteWord);
				count++;
				noteMap.remove(noteWord);
			}
			noteMap.put(noteWord, count);
		}
		
		System.out.println("\n");
		for (String key : noteMap.keySet()) {
			System.out.println(key + " " + noteMap.get(key));
		}
	}

	public boolean solve() {
		// if all entries in note are present in magazine return true,
		// else return false
		Set<String> noteWords = noteMap.keySet();
		Set<String> magazineWords = magazineMap.keySet();
		System.out.println("M containsAll N : " + magazineWords.containsAll(noteWords));
		if (magazineWords.containsAll(noteWords)) {
			for (String noteWord : noteWords) {
				if (noteMap.get(noteWord) > magazineMap.get(noteWord)) {
					return false;
				}
			}
			return true;
		}

		return false;

	}

}
