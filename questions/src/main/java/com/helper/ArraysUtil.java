package com.helper;

public class ArraysUtil {
	
	public static void print(int[] a) {		
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("\n");
	}
	
	public static void print(int[] a, int from, int to) {		
		for(int i = from; i < to; i++)
			System.out.print(a[i] + " ");
		System.out.println("\n");
	}
}
