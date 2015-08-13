package com.questions;

import com.datastructures.LinkedList;

public class LinkedListCenter {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		
		LinkedList.Node head = linkedList.head();
		linkedList.add(new LinkedList.Node("A"));
		linkedList.add(new LinkedList.Node("B"));
		linkedList.add(new LinkedList.Node("C"));
		linkedList.add(new LinkedList.Node("D"));
		linkedList.add(new LinkedList.Node("E"));
		linkedList.add(new LinkedList.Node("F"));
		linkedList.add(new LinkedList.Node("G"));
		linkedList.add(new LinkedList.Node("H"));
		linkedList.add(new LinkedList.Node("I"));
		
		LinkedList.Node current = head;
		LinkedList.Node middle = head;
		
		System.out.println("MIDDLE: " + middle);
		System.out.println("CURRENT: " + current);
		System.out.println("");
		
		int length = 0;
		
		/* 
		 * Two pointers on the list, one pointer moves twice as 
		 * fast as the other pointer.
		 */
		
		while(current.next() != null) {
			length++;
			if(length % 2 == 0) {
				middle = middle.next();
			}
			current = current.next();
			System.out.println("MIDDLE: " + middle);
			System.out.println("CURRENT: " + current);
		}
		
		if(length % 2 == 1)
			middle = middle.next();
		
		System.out.println(" ");
		System.out.println("Length : " + length);
		System.out.println("Middle : " + middle);
		
	}

}
