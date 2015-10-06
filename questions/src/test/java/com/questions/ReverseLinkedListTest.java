package com.questions;

import junit.framework.Assert;

import org.junit.Test;

import com.datastructures.LinkedList;
import com.datastructures.LinkedList.Node;
import com.helper.LinkedListUtil;

public class ReverseLinkedListTest {
		
	@Test
	public void testListSizeOne() {
		LinkedList list = new LinkedList();
		LinkedList reversedList = ReverseLinkedList.apply(list);
		Assert.assertEquals(list.head().toString(), reversedList.head().toString());
	}
	
	@Test
	public void testListSizeTwo() {
		LinkedList list = new LinkedList();
		list.add(new Node("A"));		
		Assert.assertEquals("LinkedList : head -> A", LinkedListUtil.print(list));
		
		LinkedList reversedList = ReverseLinkedList.apply(list);
		Assert.assertEquals("LinkedList : A -> head", LinkedListUtil.print(reversedList));
	}
	
	@Test
	public void testListSizeN() {
		LinkedList list = new LinkedList();
		list.add(new Node("A"));
		list.add(new Node("B"));
		list.add(new Node("C"));
		list.add(new Node("D"));
		list.add(new Node("E"));
		Assert.assertEquals("LinkedList : head -> A -> B -> C -> D -> E", LinkedListUtil.print(list));
		
		LinkedList reversedList = ReverseLinkedList.apply(list);
		Assert.assertEquals("LinkedList : E -> D -> C -> B -> A -> head", LinkedListUtil.print(reversedList));
	}

}
