package com.questions;

import junit.framework.Assert;

import org.junit.Test;

import com.datastructures.Stack;

public class AddLargeNumbersTest {

	@Test
	public void test1() {
		String n1 = "592"; 
		String n2 = "3784"; 
		
		Stack<String> stack1 = AddLargeNumbers.convertStringToStack(n1);
		Stack<String> stack2 = AddLargeNumbers.convertStringToStack(n2);
		
		Stack<String> result = AddLargeNumbers.add(stack1, stack2);
		
		String res = "";
		while(result.peek() != null) {
			res += result.pop();
		}
		
		System.out.println("Result : " + res);
		Assert.assertEquals("4376", res);
	}
	
	@Test
	public void test2() {
		String n1 = "8"; 
		String n2 = "9"; 
		
		Stack<String> stack1 = AddLargeNumbers.convertStringToStack(n1);
		Stack<String> stack2 = AddLargeNumbers.convertStringToStack(n2);
		
		Stack<String> result = AddLargeNumbers.add(stack1, stack2);
		
		String res = "";
		while(result.peek() != null) {
			res += result.pop();
		}
		
		System.out.println("Result : " + res);
		Assert.assertEquals("17", res);
	}
	
	@Test
	public void test3() {
		String n1 = "18274364583929273748459595684373"; 
		String n2 = "8139498165026350236"; 
		
		Stack<String> stack1 = AddLargeNumbers.convertStringToStack(n1);
		Stack<String> stack2 = AddLargeNumbers.convertStringToStack(n2);
		
		Stack<String> result = AddLargeNumbers.add(stack1, stack2);
		
		String res = "";
		while(result.peek() != null) {
			res += result.pop();
		}
		
		System.out.println("Result : " + res);
		Assert.assertEquals("11222999999999555555778886664000", res);
	}

}
