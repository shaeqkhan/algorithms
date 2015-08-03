package com.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerOfTwoTest {

	@Test
	public void test() {
		assertFalse(PowerOfTwo.isPowerOfTwo(0));
	}
	
	@Test
	public void test1() {
		assertTrue(PowerOfTwo.isPowerOfTwo(1));
	}
	
	@Test
	public void test2() {
		assertTrue(PowerOfTwo.isPowerOfTwo(2));
	}
	
	@Test
	public void test3() {
		assertFalse(PowerOfTwo.isPowerOfTwo(3));
	}
	
	@Test
	public void test4() {
		assertTrue(PowerOfTwo.isPowerOfTwo(64));
	}
	
	@Test
	public void test5() {
		assertFalse(PowerOfTwo.isPowerOfTwo(100));
	}
	
}
