package com.datastructures;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DisjointSetTest {
	
	public DisjointSet disjointSet;
	
	@Before
	public void init() {
		disjointSet = new DisjointSet();
		disjointSet.createSet("1");
		disjointSet.createSet("2");
		disjointSet.createSet("3");
		disjointSet.createSet("4");
		disjointSet.createSet("5");
	}
	
	@After
	public void finish() {
		disjointSet = null;
	}
	
	@Test
	public void test1() {
		assertNotNull(disjointSet);
	}
	
	@Test
	public void test2() {		
		assertEquals(5, disjointSet.getSize());		
	}
	
	@Test
	public void test3() {		
		assertEquals("1", disjointSet.find("1"));		
	}
	
	@Test
	public void test4() {		
		assertEquals("2", disjointSet.find("2"));	
	}
	
	@Test
	public void test5() {		
		assertEquals("3", disjointSet.find("3"));	
	}
	
	@Test
	public void test6() {		
		assertEquals("4", disjointSet.find("4"));	
	}
	
	@Test
	public void test7() {		
		assertEquals("5", disjointSet.find("5"));	
	}
	
	//simple union
	@Test
	public void test8() {
		disjointSet.union("1","3");
		disjointSet.union("2","5");		
		assertEquals(3, disjointSet.getSize());
		
		System.out.println("\n test8");
		System.out.println(disjointSet.find("1"));
		System.out.println(disjointSet.find("2"));
		System.out.println(disjointSet.find("3"));
		System.out.println(disjointSet.find("4"));
		System.out.println(disjointSet.find("5"));
	}
	
	@Test
	public void test9() {
		disjointSet.union("1","3");
		assertEquals("1", disjointSet.find("3"));
	}
	
	//union without using representative
	@Test
	public void test10() {
		disjointSet.union("1", "2");
		disjointSet.union("2", "3");
		disjointSet.union("3", "5");
		assertEquals(2, disjointSet.getSize());
		
		System.out.println("\n test9");
		System.out.println(disjointSet.find("1"));
		System.out.println(disjointSet.find("2"));
		System.out.println(disjointSet.find("3"));
		System.out.println(disjointSet.find("4"));
		System.out.println(disjointSet.find("5"));
	}
	
	@Test
	public void test11() {
		disjointSet.union("1", "2");
		disjointSet.union("2", "3");
		disjointSet.union("3", "5");
		assertEquals("1", disjointSet.find("2"));
		assertEquals("1", disjointSet.find("3"));
		assertEquals("1", disjointSet.find("5"));
	}
	
	@Test
	public void test12() {
		disjointSet.union("1", "2");
		disjointSet.union("2", "3");
		disjointSet.union("3", "5");
		disjointSet.union("5", "4");
		assertEquals(1, disjointSet.getSize());
		
		System.out.println("\n test10");
		System.out.println(disjointSet.find("1"));
		System.out.println(disjointSet.find("2"));
		System.out.println(disjointSet.find("3"));
		System.out.println(disjointSet.find("4"));
		System.out.println(disjointSet.find("5"));
	}
	
	@Test
	public void test13() {
		disjointSet.union("1", "2");
		disjointSet.union("2", "3");
		disjointSet.union("3", "5");
		disjointSet.union("5", "4");
		assertEquals("1", disjointSet.find("2"));
		assertEquals("1", disjointSet.find("3"));
		assertEquals("1", disjointSet.find("4"));
		assertEquals("1", disjointSet.find("5"));
	}	
	
}
