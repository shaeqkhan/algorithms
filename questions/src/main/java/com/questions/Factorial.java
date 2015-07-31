package com.questions;

/*
 * Finds the factorial of a given number.
 * 
 * Eg. n! = 1 * 2 * ... * n-1 * n
 *     5! = 1 * 2 * 3 * 4 * 5 = 120
 */
public class Factorial {
	
	/*
	 * This method uses an iterative approach to calculate the factorial
	 * 
	 * @param number  for which the factorial is calculated
	 * @return result
	 */
	public static int iterative(int number) {
		
		int result = number;
		
		for(int i = number; i > 1; i--)
			result *= (i-1);
		
		return result;
	}
	
	/*
	 * This method uses a recursive approach to calculate the factorial
	 * 
	 * Call stack structure
	 * -> factorial(5) 
 	 * 		-> factorial(4)
     *			-> factorial(3)
     * 				-> factorial(2)
     *   				-> factorial(1)
     *     					-> factorial(0) 
     *     					<- 1
     *   				<- 1 = 1 * 1 
     * 				<- 2 = 2 * 1
     *			<- 6 = 3 * 2
  	 *		<- 24 = 4 * 6
	 * <- 120 = 5 * 24 
	 * 
	 * @param  number  for which the factorial is calculated
	 * @return result
	 */
	public static int recursive(int number) {
		
		if(number == 1)
			return 1;
		
		return number * recursive(number-1);
	}
	
	/*
	 * This method uses tail recursion to calculate the factorial
	 * 
	 * Call stack structure
	 * -> fact(5, 1) 
  	 *		-> fact(4, 5)  
     *			-> fact(3, 20)
     * 				-> fact(2, 60)
     *   				-> fact(1, 120)
     *     					-> fact(0, 120)  
     *     					<- 120  
     *   				<- 120
     * 				<- 120
     *			<- 120
  	 *		<- 120
	 * <- 120
	 * 
	 * @param  number  for which the factorial is calculated
	 * @return result
	 */
	public static int tailRecursion(int number) {
		return fact(number,1);
	}
	
	private static int fact(int number, int result) {
		
		if(number == 0)
			return result;
		else
			return fact(number - 1, number * result);
	
	}
}
