package com.questions;

/*
 * Swapping numbers without using a temporary variable and avoiding overflow
 * 
 * A	B		A^B (A XOR B)
 * 0	0		0
 * 0	1		1
 * 1	0		1
 * 1	1		0
 */

public class SwapNumbers {
	
	public static void main(String[] args) {
		
		int a = 2; //0010
		int b = 4; //0100
		
//		int a = 2147483647; 
//		int b = 2147483600;
		
		System.out.println("a: " + a + " b: " + b);
		
		//swapping values with XOR bitwise operator
		//does not overflow when value of a and b is very big
		a = a ^ b; System.out.println("a: " + a + " b: " + b);// a=6 b=4
		b = a ^ b; System.out.println("a: " + a + " b: " + b);// a=6 b=2
		a = a ^ b; // a=4 b=2
		
		System.out.println("a: " + a + " b: " + b);
	}
	
}
