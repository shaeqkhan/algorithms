package com.questions;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * Vending machine problem
 * 
 * Given an amount entered by a customer, calculate the money returned in 
 * denominations of quarters, dimes, nickels and pennies.
 */
class VendingMachine {
	
	/*
	 * Use the BigDecimal(String) constructor to create numbers to 
	 * exact decimal places
	 */
	static final BigDecimal QUARTER = new BigDecimal("0.25");
	static final BigDecimal DIME = new BigDecimal("0.10");
	static final BigDecimal NICKEL = new BigDecimal("0.05");
	static final BigDecimal PENNY = new BigDecimal("0.01");
	
	/*
	 * This method calculates the change to be dispensed
	 * 
	 * @param input   amount put into the vending machine
	 * @param cost    of the item selected by the customer
	 * @return change in denominations of quarters, dimes, nickels and pennies,
	 * 				  no change if the input and cost are same,
	 * 				  null if the input amount is less than the cost of the selected item
	 */
	public static Change calculate(BigDecimal input, BigDecimal cost) {
		
		BigDecimal difference = input.subtract(cost); 
		difference = difference.setScale(2, RoundingMode.HALF_UP); 
		
		if(difference.doubleValue() == 0)
			return new Change(0,0,0,0);
		
		else if(difference.doubleValue() < 0)
			return null;
		
		else if(difference.doubleValue() > 0) {
			
			int numOfQuarters = 0;
			while(difference.compareTo(QUARTER) >= 0) {
				difference = difference.subtract(QUARTER); 
				difference = difference.setScale(2, RoundingMode.HALF_UP); //need to set scale again as per BigDecimal API
				//System.out.println("DIFFERENCE : " + difference + " " + difference.compareTo(QUARTER) + " numOfQuarters++");
				numOfQuarters++;
			}
						
			int numOfDimes = 0;			
			while(difference.compareTo(DIME) >= 0) {
				difference = difference.subtract(DIME); 
				difference = difference.setScale(2, RoundingMode.HALF_UP); //need to set scale again as per BigDecimal API
				//System.out.println("DIFFERENCE : " + difference + " numOfDimes++");
				numOfDimes++;
			}
			
			int numOfNickels = 0;
			while(difference.compareTo(NICKEL) >= 0) {
				difference = difference.subtract(NICKEL); 
				difference = difference.setScale(2, RoundingMode.HALF_UP); //need to set scale again as per BigDecimal API
				//System.out.println("DIFFERENCE : " + difference + " numOfNickels++");
				numOfNickels++;
			}
			
			int numOfPennies = 0;
			while(difference.compareTo(PENNY) >= 0) {
				difference = difference.subtract(PENNY); 
				difference = difference.setScale(2, RoundingMode.HALF_UP); //need to set scale again as per BigDecimal API
				//System.out.println("DIFFERENCE : " + difference + " numOfPennies++");
				numOfPennies++;
			}
			
			return new Change(numOfQuarters, numOfDimes, numOfNickels, numOfPennies);
		}
		
		else
			return null;
	}
}

/*
 * This class holds the currency denominations dispensed by the 
 * vending machine
 */
class Change {
	
	private int numOfQuarters;
	private int numOfDimes;
	private int numOfNickels;
	private int numOfPennies;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numOfDimes;
		result = prime * result + numOfNickels;
		result = prime * result + numOfPennies;
		result = prime * result + numOfQuarters;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Change other = (Change) obj;
		if (numOfDimes != other.numOfDimes)
			return false;
		if (numOfNickels != other.numOfNickels)
			return false;
		if (numOfPennies != other.numOfPennies)
			return false;
		if (numOfQuarters != other.numOfQuarters)
			return false;
		return true;
	}

	public Change() {}
	
	public Change(int numOfQuarters, int numOfDimes, int numOfNickels,
			int numOfPennies) {
		super();
		this.numOfQuarters = numOfQuarters;
		this.numOfDimes = numOfDimes;
		this.numOfNickels = numOfNickels;
		this.numOfPennies = numOfPennies;
	}
	public int getNumOfQuarters() {
		return numOfQuarters;
	}
	public int getNumOfDimes() {
		return numOfDimes;
	}
	public int getNumOfNickels() {
		return numOfNickels;
	}
	public int getNumOfPennies() {
		return numOfPennies;
	}

}