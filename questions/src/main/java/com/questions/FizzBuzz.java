package com.questions;

/*
 * Prints "fizz" when number is divisible by 3
 * Prints "buzz" when number is divisible by 5
 * Prints "fizzbuzz" when number is divisible by 3 and 5
 * Prints the number otherwise
 */
public class FizzBuzz {
	
	public static String[] apply(int[] A, int n) {
		
		String[] result = new String[n];
		for(int i = 0; i < n; i++) {
			
			if(A[i] % 3 == 0 && A[i] % 5 == 0) {
				result[i] = "fizzbuzz";
			}
			else if(A[i] % 3 == 0) {
				result[i] = "fizz";
			}
			else if(A[i] % 5 == 0) {
				result[i] = "buzz";
			}
			else {
				result[i] = A[i] + "";
			}
			
			System.out.println(result[i]);			
		}
		
		return result;
		
	}
	
}
