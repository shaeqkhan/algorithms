package com.questions;

/*
 * Finds the reverse of a given string 
 * 
 * Eg. Hello -> olleH
 */

public class StringReverse {
	
	/*
	 * Finds the reverse of a string iteratively using a String Builder
	 * 
	 * @param input    string to be reversed
	 * @return result  reversed string or empty string if the input is an empty string
	 * @throws         NullPointerException if the input string is null
	 */
	public static String reverse(String input) throws NullPointerException{
		
		if(input == null)
			throw new NullPointerException();
		
		if(input.equals(""))
			return "";
		
		char[] inputArray = input.toCharArray();
		StringBuilder reverse = new StringBuilder();
		for(int i = inputArray.length-1; i >= 0; i--) {
			reverse.append(inputArray[i]);
		}
		return reverse.toString();
	}	
	
	/*
	 * Finds the reverse of a string recursively
	 * 
	 * reverse("Hello")
	 * (reverse("ello")) + "H"
	 * (reverse("llo") + "e") + "H"
	 * ((reverse("lo") + "l") + "e") + "H"
	 * ((((reverse("o")) + "l") + "l") + "e") + "H"
	 * (((("o") + "l") + "l") + "e") + "H"
	 * "olleH"
	 * 
	 * @param input    string to be reversed
	 * @return result  reversed string or empty string if the input is an empty string
	 * @throws         NullPointerException if the input string is null
 	 *
	 */
	public static String reverseRecursive(String input) throws NullPointerException{
		
		if(input == null)
			throw new NullPointerException();
		
		if(input.equals(""))
			return "";
		
		if(input.length() < 2)
			return input;
		
		return reverseRecursive(input.substring(1)) + input.charAt(0);
	}
	
}
