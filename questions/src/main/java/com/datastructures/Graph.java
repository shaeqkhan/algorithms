package com.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Graph {
	
	private List<Vertex> vertices;
	private List<Edge> edges;
	
	public Graph() {
		vertices = new ArrayList<Vertex>();
		edges = new ArrayList<Edge>();
	}
	
	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}
	
	public List<Vertex> getVertices() {
		return vertices;
	}
	
	public boolean addVertex(String vertexName) {
		
		Vertex vertex = new Vertex(vertexName);
		
		if(vertices.contains(vertex))
			return false;
		
		vertices.add(vertex);
		return true;
	
	}
	
	//allows only one edge between two vertices
	public boolean addEdge(String vertex1, String vertex2, int weight) {
		
		Vertex v1 = new Vertex(vertex1);
		Vertex v2 = new Vertex(vertex2);
		
		Edge edge = new Edge(v1, v2, weight);
		
		if(edges.contains(edge))
			return false;
		
		edges.add(edge);
		return true;
		
	}
	
	public boolean addEdge(Edge edge) {
		return addEdge(edge.getVertexA().getName(), edge.getVertexB().getName(), edge.getWeight());
	}
	
	public boolean removeEdge(Edge edge) {
		return edges.remove(edge);
	}
	
	public List<Edge> getSortedEdges() {
		Collections.sort(edges);
		return edges;
	}
	
	public boolean isCyclic() {
		
		DisjointSet disjointSet = new DisjointSet();
		
		for(Vertex vertex : vertices) {
			disjointSet.createSet(vertex.getName());
		}
		
		for(Edge edge : edges) {
			
			String vertexA = disjointSet.find(edge.getVertexA().getName());
			String vertexB = disjointSet.find(edge.getVertexB().getName());
			
			if(vertexA.equals(vertexB))
				return true;
			else
				disjointSet.union(vertexA, vertexB);
		}
		
		return false;
	}
	
	public int getNumVertices() {
		return vertices.size();
	}
	
	public int getNumEdges() {
		return edges.size();
	}
	
	public String toString() {
		
		String graph = "\nGRAPH : \n";
		
		for(int i = 0; i < vertices.size(); i++)
			graph += vertices.get(i).toString() + "\n";
		
		for(int i = 0; i < edges.size(); i++)
			graph += edges.get(i).toString() + "\n";
		
		return graph;
		
	}
	
}
