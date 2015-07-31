package com.questions;

/*
 * Checks whether a given number is a Palindrome or not
 * 
 * Eg. 12221 is a palindrome because its the same when reversed
 * 	   12345 is not a palindrome because when reversed it's not the same as the original number   
 */

public class Palindrome {
	
	/*
	 * @param number  as a primitive data type int
	 * @return true if it is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(int number) {
		
		int reverse = 0;
		int n = number;
		
		while(n != 0) {
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}
		
		return number == reverse;
		
	}
	
	/*
	 * @param number  as a String
	 * @return true if it is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(String number) {
		
		return number.equals(StringReverse.reverse(number));
		
	}
	
}
