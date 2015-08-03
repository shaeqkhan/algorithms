package com.questions;

/*
 * Check if a number is a power of two using the bit shift operator
 * 
 * Eg. 4 in binary format "0000 0000 0000 0000 0000 0000 0000 0100"
 *    -4 in binary format "1111 1111 1111 1111 1111 1111 1111 1100"
 * 	   and 4 & -4         "0000 0000 0000 0000 0000 0000 0000 0100"
 * 
 * 	  33 in binary format "0000 0000 0000 0000 0000 0000 0010 0001"
 * 	 -33 in binary format "1111 1111 1111 1111 1111 1111 1101 1111"
 *    and 33 & -33        "0000 0000 0000 0000 0000 0000 0000 0001"
 */

public class PowerOfTwo {
	
	/*
	 * @param number  to check as a power of two
	 * @return true if the number is a power of two, false otherwise
	 */
	public static boolean isPowerOfTwo(int number) {
		
		//zero is not a power of two
		if(number == 0)
			return false;
		
		if((number & -number) == number)
			return true;
		
		return false;
	}
	
}
