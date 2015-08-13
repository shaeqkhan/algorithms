package com.datastructures;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GraphTest {

	Graph graph;
	
	@Before
	public void init() {
		
		graph = new Graph();
		
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		
		graph.addEdge("A", "D", 2);
		graph.addEdge("A", "B", 1);
		graph.addEdge("A", "C", 4);
		graph.addEdge("B", "D", 3);
		
		System.out.println(graph.toString());
	
	}
	
	@After
	public void finish() {
		graph = new Graph();
	}
	
	@Test
	public void test() {
		List<Edge> edges = graph.getSortedEdges();
		for(Edge edge : edges)
			System.out.println(edge.toString());
	}
	
	@Test
	public void test1() {
		Edge edge = new Edge(new Vertex("C"), new Vertex("D"), 20);
		graph.addEdge(edge);
		List<Edge> edges = graph.getSortedEdges();
		for(Edge e : edges)
			System.out.println(e.toString());
	}
	
	@Test
	public void test2() {
		Edge edge = new Edge(new Vertex("A"), new Vertex("D"), 2);
		graph.removeEdge(edge);
		List<Edge> edges = graph.getSortedEdges();
		for(Edge e : edges)
			System.out.println(e.toString());
	}
	
	@Test
	public void test3() {
		assertTrue(graph.isCyclic());
		System.out.println(graph.toString());
	}

}
