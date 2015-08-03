package com.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTest {

	@Test
	public void test() {
		assertFalse(PrimeNumber.isNumberPrime(0));
	}
	
	@Test
	public void test1() {
		assertTrue(PrimeNumber.isNumberPrime(1));
	}
	
	@Test
	public void test2() {
		assertFalse(PrimeNumber.isNumberPrime(-1));
	}
	
	@Test
	public void test3() {
		assertTrue(PrimeNumber.isNumberPrime(2));
	}
	
	@Test
	public void test4() {
		assertTrue(PrimeNumber.isNumberPrime(3));
	}
	
	@Test
	public void test5() {
		assertFalse(PrimeNumber.isNumberPrime(10));
	}
	
	@Test
	public void test6() {
		assertTrue(PrimeNumber.isNumberPrime(29));
	}
	
	@Test
	public void test7() {
		assertTrue(PrimeNumber.isNumberPrime(97));
	}
	
	@Test
	public void test8() {
		assertFalse(PrimeNumber.isNumberPrime(12345));
	}

}
