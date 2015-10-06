package com.questions;

import com.datastructures.LinkedList;
import com.datastructures.LinkedList.Node;

/*
 * Reverse a singly linked list using only one pass through the list
 */
public class ReverseLinkedList {
	
	public static LinkedList apply(LinkedList list) {
		
		//for empty list or list with one element
		if(list.head() == null || list.head().next() == null)
			return list;
		
		Node head = list.head();
		Node first = head.next();
		Node second = first.next();
		
		first.setNext(head);
		head.setNext(null);
		
		//in case of only two nodes
		if(second == null) {
			list.setHead(first);
			return list;
		}
		
		Node currentNode = second;
		Node prevNode = first;
		Node nextNode = second.next();
		
		while(currentNode != null) {
			currentNode.setNext(prevNode);
			prevNode = currentNode;
			currentNode = nextNode;
			if(nextNode != null) {
				nextNode = currentNode.next();
			}
		}
		
		list.setHead(prevNode);
		
		return list;
	}
		
}
