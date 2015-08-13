package com.algorithms.greedy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.datastructures.Graph;

public class KruskalsAlgorithmTest {
	
//	@Test
	public void test() {
		
		Graph originalGraph = new Graph();
		originalGraph.addVertex("A");
		originalGraph.addVertex("B");
		originalGraph.addVertex("C");
		originalGraph.addVertex("D");
		
		originalGraph.addEdge("A", "D", 2);
		originalGraph.addEdge("A", "B", 1);
		originalGraph.addEdge("A", "C", 4);
		originalGraph.addEdge("B", "D", 3);
		
		KruskalsAlgorithm kruskalsAlgorithm = new KruskalsAlgorithm(originalGraph);
		
		Graph kruskalsGraph = kruskalsAlgorithm.apply();
		System.out.println(kruskalsGraph);
	}
	
	@Test
	public void test1() {
		
		Graph originalGraph = new Graph();
		
		originalGraph.addVertex("A");
		originalGraph.addVertex("B");
		originalGraph.addVertex("C");
		originalGraph.addVertex("D");
		originalGraph.addVertex("E");
		originalGraph.addVertex("F");
		originalGraph.addVertex("G");
		originalGraph.addVertex("H");
		originalGraph.addVertex("I");
		
		originalGraph.addEdge("A", "B", 4);
		originalGraph.addEdge("A", "H", 8);
		originalGraph.addEdge("B", "C", 8);
		originalGraph.addEdge("B", "H", 11);
		originalGraph.addEdge("C", "D", 7);
		originalGraph.addEdge("C", "F", 4);
		originalGraph.addEdge("C", "I", 2);
		originalGraph.addEdge("D", "E", 9);
		originalGraph.addEdge("D", "F", 14);
		originalGraph.addEdge("E", "F", 10);
		originalGraph.addEdge("F", "G", 2);
		originalGraph.addEdge("G", "I", 6);
		originalGraph.addEdge("G", "H", 1);
		originalGraph.addEdge("H", "I", 7);
		
		KruskalsAlgorithm kruskalsAlgorithm = new KruskalsAlgorithm(originalGraph);
		
		Graph kruskalsGraph = kruskalsAlgorithm.apply();
		System.out.println(kruskalsGraph);
	}

}
