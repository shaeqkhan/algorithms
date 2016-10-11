package com.questions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnagramsTest {
	
	Anagrams anagrams;
	
	@Before
	public void setUp() {
		anagrams = new Anagrams();
	}
	
	@Test
	public void test1() {
		final String a = "cde";
		final String b = "abc";
		System.out.println("test1");
		assertEquals(4, anagrams.calculate(a, b));
	}
	
	@Test
	public void test2() {
		final String a = "bacdc";
		final String b = "dcbac";
		System.out.println("test2");
		assertEquals(0, anagrams.calculate(a, b));
	}
	
	@Test
	public void test3() {
		final String a = "bacdc";
		final String b = "dcbad";
		System.out.println("test3");
		assertEquals(2, anagrams.calculate(a, b));
	}
	
	@Test
	public void test4() {
		final String a = "fcrxzwscanmligyxyvym";
		final String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		System.out.println("test4");
		assertEquals(30, anagrams.calculate(a, b));
	}

}