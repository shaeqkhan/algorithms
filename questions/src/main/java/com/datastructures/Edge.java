package com.datastructures;

public class Edge implements Comparable<Edge>{
	
	private Vertex vertexA;
	private Vertex vertexB;
	private int weight;
	
	public Edge(Vertex vertexA, Vertex vertexB, int weight) {
		super();
		this.vertexA = vertexA;
		this.vertexB = vertexB;
		this.weight = weight;
	}

	public Vertex getVertexA() {
		return vertexA;
	}

	public Vertex getVertexB() {
		return vertexB;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Edge [vertexA=" + vertexA.toString() + ", vertexB=" + vertexB.toString()
				+ ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vertexA == null) ? 0 : vertexA.hashCode());
		result = prime * result + ((vertexB == null) ? 0 : vertexB.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if (vertexA == null) {
			if (other.vertexA != null)
				return false;
		} else if (!vertexA.equals(other.vertexA))
			return false;
		if (vertexB == null) {
			if (other.vertexB != null)
				return false;
		} else if (!vertexB.equals(other.vertexB))
			return false;
		return true;
	}

	public int compareTo(Edge edge) {

		if(this.weight == edge.getWeight())
			return 0;
		else if(this.weight < edge.getWeight())
			return -1;
		
		return 1;
		
	}
	
}
