package com.questions;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArmstrongNumberTest {
	
	@Test
	public void testZero() {
		assertTrue(ArmstrongNumber.isValid(0));
	}
	
	@Test
	public void testValidPositive() {
		assertTrue(ArmstrongNumber.isValid(371));
	}
	
	@Test
	public void testInvalidPositive() {
		assertFalse(ArmstrongNumber.isValid(123456));
	}
	
	@Test
	public void testValidNegative() {
		assertTrue(ArmstrongNumber.isValid(-371));
	}
	
	@Test
	public void testInvalidNegative() {
		assertFalse(ArmstrongNumber.isValid(-123456));
	}
	
	@Test
	public void testMaxInt() {
		assertFalse(ArmstrongNumber.isValid(Integer.MAX_VALUE));
	}
	
	@Test
	public void testMinInt() {
		assertFalse(ArmstrongNumber.isValid(Integer.MIN_VALUE));
	}

}
