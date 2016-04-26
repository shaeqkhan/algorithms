package com.trees;

public class BSTNode<T extends Comparable<?>> {
	
	protected T key;
	protected BSTNode<T> left, right;
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
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
		BSTNode other = (BSTNode) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}

	public BSTNode() {
		super();
	}
	
	public BSTNode(T key) {
		super();
		this.key = key;
	}

	public BSTNode(T key, BSTNode<T> left, BSTNode<T> right) {
		super();
		this.key = key;
		this.left = left;
		this.right = right;
	}
		
}
