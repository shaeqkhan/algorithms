package com.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void test() {
		assertTrue(Palindrome.isPalindrome(12221));
	}
	
	@Test
	public void test1() {
		assertTrue(Palindrome.isPalindrome("12221"));
	}
	
	@Test
	public void test2() {
		assertFalse(Palindrome.isPalindrome(123456));
	}
	
	@Test
	public void test3() {
		assertFalse(Palindrome.isPalindrome("123456"));
	}
	
	@Test
	public void testZero() {
		assertTrue(Palindrome.isPalindrome(0));
	}
	
	@Test
	public void testZeroString() {
		assertTrue(Palindrome.isPalindrome("0"));
	}
	
	@Test
	public void testSingleDigitNumber() {
		assertTrue(Palindrome.isPalindrome(3));
	}
	
	@Test
	public void testSingleDigitNumberAsString() {
		assertTrue(Palindrome.isPalindrome("3"));
	}

}
