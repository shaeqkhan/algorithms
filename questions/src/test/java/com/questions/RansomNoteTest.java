package com.questions;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RansomNoteTest {
	
	private RansomNote ransomNote;
	
	@Test
	public void test() {
		ransomNote = new RansomNote("apgo clm w lxkvg mwz elo bg elo lxkvg elo apgo apgo w elo bg",
				"elo lxkvg bg mwz clm w");		
		assertTrue(ransomNote.solve());
	}
	
	@Test
	public void test2() {
		ransomNote = new RansomNote("give me one grand today night",
				"give one grand today");		
		assertTrue(ransomNote.solve());
	}

}
