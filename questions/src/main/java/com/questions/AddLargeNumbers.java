package com.questions;

import com.datastructures.Stack;

/*
 * Adding large numbers using stacks
 */
public class AddLargeNumbers {
	
	public static Stack<String> add(Stack<String> stack1, Stack<String> stack2) {
		
		Stack<String> result = new Stack<String>();
		
		//pick the size of the bigger stack
		int size = (stack1.size() > stack2.size()) ? stack1.size() : stack2.size();
		int counter = size;
			
		int carryOver = 0;
		
		while(counter > 0) {
					
			//pop an element from the stack, if the stack is empty consider the number as 0 
			int num1 = (stack1.peek() == null) ? 0 : Integer.valueOf(stack1.pop()).intValue(); 
			int num2 = (stack2.peek() == null) ? 0 : Integer.valueOf(stack2.pop()).intValue(); 
			
			//add the numbers with any carry over left from previous add operation
			int sum = num1 + num2 + carryOver; 
			
			//if the sum is double digits, take the number in the ones place and push it on the 
			//stack and use the number in the tens place as carry over for the next operation
			if(sum > 9) {
				int remainder = sum % 10; 
				String remainderStr = remainder + "";
				result.push(remainderStr);				
				carryOver = sum / 10;				
			}
			else {
				String sumStr = sum + "";
				result.push(sumStr);
				carryOver = 0;
			}
			
			counter--;
		}
		
		//in case the last addition results in a carry over, push this digit to the stack too
		if(carryOver > 0) {
			result.push(carryOver + "");
		}
						
		return result;
		
	}
	
	public static Stack<String> convertStringToStack(String number) {
		
		Stack<String> stack = new Stack<String>();
		for(int i = 0; i < number.length(); i++) {
			stack.push(Character.toString(number.charAt(i)));
		}
		System.out.println("Stack : " + stack.toString());
		
		return stack;
	
	}
	
}
