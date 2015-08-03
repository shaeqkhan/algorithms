package com.questions;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class VendingMachineTest {
	
	//no input, no selection
	@Test
	public void test1() {
		Change expected = new Change(0,0,0,0);
		
		BigDecimal input = new BigDecimal("0.00");
		BigDecimal cost = new BigDecimal("0.00");
		Change received = VendingMachine.calculate(input, cost);
		
		assertTrue(expected.equals(received));
	}
	
	//machine in wait state, input is less than cost of product
	@Test
	public void test2() {
		
		BigDecimal input = new BigDecimal("0.50");
		BigDecimal cost = new BigDecimal("1.00");
		Change received = VendingMachine.calculate(input, cost);
		
		assertNull(received);
	}
	
	//input same as cost of item
	@Test
	public void test3() {
		Change expected = new Change(0,0,0,0);
		
		BigDecimal input = new BigDecimal("1.00");
		BigDecimal cost = new BigDecimal("1.00");
		Change received = VendingMachine.calculate(input, cost);
		
		assertTrue(expected.equals(received));
	}
	
	//quarters return
	@Test
	public void test4() {
		Change expected = new Change(3,0,0,0);
		
		BigDecimal input = new BigDecimal("1.00");
		BigDecimal cost = new BigDecimal("0.25");
		Change received = VendingMachine.calculate(input, cost);
		
		assertTrue(expected.equals(received));
	}
	
	//dime return
	@Test
	public void test5() {
		Change expected = new Change(0,2,0,0);
		
		BigDecimal input = new BigDecimal("1.00");
		BigDecimal cost = new BigDecimal("0.80");
		Change received = VendingMachine.calculate(input, cost);
		
		assertTrue(expected.equals(received));
	}
	
	//nickel return
	@Test
	public void test6() {
		Change expected = new Change(0,0,1,1);
		
		BigDecimal input = new BigDecimal("0.10");
		BigDecimal cost = new BigDecimal("0.04");
		Change received = VendingMachine.calculate(input, cost);
		
		assertTrue(expected.equals(received));
	}
	
	//pennies return
	@Test
	public void test7() {
		Change expected = new Change(0,0,0,4);
		
		BigDecimal input = new BigDecimal("0.10");
		BigDecimal cost = new BigDecimal("0.06");
		Change received = VendingMachine.calculate(input, cost);
		
		assertTrue(expected.equals(received));
	}
	
	@Test
	public void test8() {
		Change expected = new Change(3,1,1,4);
		
		BigDecimal input = new BigDecimal("1.00");
		BigDecimal cost = new BigDecimal("0.06");
		Change received = VendingMachine.calculate(input, cost);
		
		assertTrue(expected.equals(received));
	}
}
