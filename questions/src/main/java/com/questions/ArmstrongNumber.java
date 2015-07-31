package com.questions;

/*
 * An Armstrong number is the same as the sum of the third power of its each digit.
 * Eg. 371 -> 3^3 + 7^3 + 1^3 = 371
 */

public final class ArmstrongNumber {
	
	/*
	 * Checks whether the number passed in is an Armstrong number.
	 * 
	 * @param number  to be checked, negatives are converted to their absolute values
	 * @return true if the number is an Armstrong number, false otherwise
	 */
	public static boolean isValid(int number) {
		
		if(number < 0)
			number = Math.abs(number);
		
		int temp = number;
		int sum = 0;
		
		do {
			
			int lastDigit = temp % 10;
			sum += Math.pow(lastDigit, 3);
			temp = temp/10;	
			System.out.println(temp + " " + lastDigit);
		
		} while(temp != 0);
		
		boolean isArmstrong = false;
		
		if(number == sum)
			isArmstrong = true;
		
		return isArmstrong;
	}
	
}
