package com.algorithms.greedy;

import java.util.List;

import com.datastructures.Edge;
import com.datastructures.Graph;

/*
 * Kruskals Algorithm
 * 
 * A Minimum Spanning Tree MST has V - 1 edges 
 * where V is the number of vertices in the graph
 * 
 * Time complexity O(ElogE) or O(ElogV)
 * Sorting of edges take O(ElogE)
 * find and union operations take O(logV)
 * Overall complexity O(ElogE + ElogV)
 */

public class KruskalsAlgorithm {
	
	private Graph originalGraph;
	private Graph kruskalsGraph;
	
	public KruskalsAlgorithm(Graph originalGraph) {
		
		this.originalGraph = originalGraph;
		kruskalsGraph = new Graph();
		
	}
	
	public Graph apply() {
		
		if(originalGraph != null && kruskalsGraph != null) {
			
			kruskalsGraph.setVertices(originalGraph.getVertices());
			List<Edge> sortedEdges = originalGraph.getSortedEdges();
			
			int count = 0, index = 0;
			
			while(count < kruskalsGraph.getNumVertices() && index < sortedEdges.size()) {
				
				Edge edge = sortedEdges.get(index);
				boolean isAdded = kruskalsGraph.addEdge(edge);
				
				if(kruskalsGraph.isCyclic() && isAdded)
					kruskalsGraph.removeEdge(edge);
				else
					count++;
				
				index++;
				System.out.println(kruskalsGraph.toString());
			}
			
		}
		
		if(kruskalsGraph.getNumEdges() == kruskalsGraph.getNumVertices() - 1)
			return kruskalsGraph;
		
		return null;
	}
	
	public Graph getKruskalsGraph() {
		return kruskalsGraph;
	}
	
}
