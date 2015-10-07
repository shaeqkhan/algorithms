package com.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
	
	private List<E> pool;
	
	public Stack() {
		pool = new ArrayList<E>();
	}
	
	public void clear() {
		pool.clear();
	}
	
	public boolean isEmpty() {
		return pool.isEmpty();
	}
	
	public int size() {
		return pool.size();
	}
	
	public void push(E element) {
		pool.add(element);
	}
	
	public E pop() {
		
		if(pool.size() < 1)
			return null;
		
		E top = pool.get(pool.size() - 1);
		pool.remove(top);
		return top;
	}
	
	public E peek() {
		
		if(pool.size() < 1)
			return null;
		
		return pool.get(pool.size() - 1);
	}
	
	public int search(E element) {
		int index = pool.indexOf(element);
		return index - 1;
	}
	
	public String toString() {
		String result = "";
		for(E e : pool) {
			result += e.toString() + " ";
		}
		return result;
	}
}
