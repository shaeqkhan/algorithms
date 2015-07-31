package com.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringReverseTest {

	@Test
	public void testIterative() {
		String input = "This is a String";
		String reverse = "gnirtS a si sihT";
		assertEquals(StringReverse.reverse(input), reverse);
	}
	
	@Test
	public void testRecursive() {
		String input = "This is a String";
		String reverse = "gnirtS a si sihT";
		assertEquals(StringReverse.reverseRecursive(input), reverse);
	}
	
	@Test
	public void testIterative1() {
		String input = "Shaeq Pervez Khan";
		String reverse = "nahK zevreP qeahS";
		assertEquals(StringReverse.reverse(input), reverse);
	}
	
	@Test
	public void testRecursive1() {
		String input = "Shaeq Pervez Khan";
		String reverse = "nahK zevreP qeahS";
		assertEquals(StringReverse.reverseRecursive(input), reverse);
	}
	
	@Test(expected = NullPointerException.class)
	public void testNullIterative() {
		StringReverse.reverse(null);
	}
	
	@Test(expected = NullPointerException.class)
	public void testNullRecursive() {
		StringReverse.reverseRecursive(null);
	}
	
	@Test
	public void testEmtyStringIterative() {
		String input = "";
		String reverse = "";
		assertEquals(StringReverse.reverse(input), reverse);
	}
	
	@Test
	public void testEmtyStringRecursive() {
		String input = "";
		String reverse = "";
		assertEquals(StringReverse.reverseRecursive(input), reverse);
	}

}
