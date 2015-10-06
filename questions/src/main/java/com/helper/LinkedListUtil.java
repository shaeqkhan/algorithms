package com.helper;

import com.datastructures.LinkedList;
import com.datastructures.LinkedList.Node;

public class LinkedListUtil {
	
	public static String print(LinkedList list) {
		
		Node current = list.head();
		String result = "LinkedList : " + current.getData();		
		
		while(current.next() != null) {
			Node next = current.next();
			result += " -> " + next.getData();
			current = next;
		}
		
		System.out.println(result);
		return result;
	}
	
}
