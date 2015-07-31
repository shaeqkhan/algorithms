package com.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void test() {
		assertEquals(24, Factorial.iterative(4));
	}
	
	@Test
	public void test1() {
		assertEquals(24, Factorial.recursive(4));
	}
	
	@Test
	public void test2() {
		assertEquals(24, Factorial.tailRecursion(4));
	}
	
	@Test
	public void test3() {
		assertEquals(3628800, Factorial.iterative(10));
	}
	
	@Test
	public void test4() {
		assertEquals(3628800, Factorial.recursive(10));
	}
	
	@Test
	public void test5() {
		assertEquals(3628800, Factorial.tailRecursion(10));
	}

}
