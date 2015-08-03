package com.questions;

/*
 * Checks whether a given number is prime or not
 */
public class PrimeNumber {
	
	/*
	 * Checks whether a given number is prime or not
	 * 
	 * @param number  to be checked 
	 * @return true if prime or 1, false otherwise 
	 */
	public static boolean isNumberPrime(int number) {
		
		if(number < 1)
			return false;
		
		if(number == 1)
			return true;
		
		if(number > 1) {
			int squareRoot = (int) Math.sqrt(number);
			for(int i = 2; i <= squareRoot; i++) {
				if(number % i == 0)
					return false;
			}
		}
		return true;
	}
	
}
