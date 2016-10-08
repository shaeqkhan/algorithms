package com.questions;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BalancedBracketsTest {

	BalancedBrackets brackets;

	@Before
	public void setup() {
		brackets = new BalancedBrackets();
	}

	@Test
	public void test1() {
		assertTrue(brackets.isBalanced("{[()]}"));
	}

	@Test
	public void test2() {
		assertFalse(brackets.isBalanced("{[(])}"));
	}

	@Test
	public void test3() {
		assertTrue(brackets.isBalanced("{{[[(())]]}}"));
	}

	@Test
	public void test4() {
		assertFalse(brackets.isBalanced("{{((((((("));
	}

}
