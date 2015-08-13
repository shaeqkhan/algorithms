package com.questions;

import com.datastructures.LinkedList;
import com.datastructures.LinkedList.Node;

public class LinkedListLoop {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		
		Node head = linkedList.head();
		linkedList.add(new Node("A"));
		LinkedList.Node B = new Node("B");
		linkedList.add(B);
		linkedList.add(new Node("C"));
		linkedList.add(new Node("D"));
		Node last = new Node("E");
		last.setNext(B);
		linkedList.add(last);
		
		System.out.println(hasLoop(head));		
		
	}
	
	/* Floyd's cycle finding algorithm, tortoise and hare algorithm
	 * Have 2 references to the list and move them at different speeds.
	 * Move one forward by 1 and the other by 2 nodes.
	 * If the linked list has a loop they will definitely meet.
	 */
	public static boolean hasLoop(Node first) {
		
		if(first == null)
			return false;
		
		Node slow = first, fast = first;
		
		while(true) {
			
			System.out.println("SLOW : " + slow);
			System.out.println("FAST : " + fast);
			
			slow = slow.next();
			
			if(fast.next() != null)
				fast = fast.next().next();
			else
				return false;
			
			if(slow == null || fast == null)
				return false;
			
			if(slow == fast)
				return true;
		}
	}
}
