package com.trees;

import java.util.LinkedList;

public class BinarySearchTree {
	
	protected BSTNode<Integer> root;

	public BinarySearchTree() {
		
		super();
		root = null;
	
	}
	
	protected void visit(BSTNode<Integer> p) {
		
		System.out.print(p.key + " ");
	
	}
	
	public BSTNode<Integer> search(BinarySearchTree p, int target) {
		
		return null;
	
	}
	
	/*
	 * Visiting each node starting from the lowest(or highest) level and
	 * moving down(or up) level by level, visiting nodes on each level from
	 * left to right(or from right to left).
	 * 
	 * There are four possible ways to do breadth-first traversal
	 * 
	 * This implementation does it top-down, left-to-right
	 */
	public void breadthFirst() {
		
		BSTNode<Integer> currentNode = root;
		
		/*
		 * LinkedList implements the Queue interface to provide First In First Out (FIFO) operations -
		 * enqueue: add(E e)
		 * dequeue: remove()
		 * examine: element() 
		 */
		LinkedList<BSTNode<Integer>> queue = new LinkedList<BSTNode<Integer>>();
		
		if(currentNode != null) {
			
			queue.add(currentNode);
			
			while(!queue.isEmpty()) {
				
				currentNode = queue.remove();
				visit(currentNode);
				
				if(currentNode.left != null) {
					
					queue.add(currentNode.left);
					
				}					
				
				if(currentNode.right != null) {
					
					queue.add(currentNode.right);
				
				}
			
			}
		
		}

	}
	
	/*
	 * Depth-first traversal proceeds as far as possible to the left(or right),
	 * then backs up until the first crossroad.
	 * V - Visiting Node
	 * L - Left Subtree
	 * R - Right Subtree
	 */
	
	//VLR
	public void preOrder() {		
		
		preOrder(root);		
	
	}
	
	//LVR
	public void inOrder() {
		
		inOrder(root);
		
	}
	
	//LRV
	public void postOrder() {
		
		postOrder(root);
		
	}
	
	private void preOrder(BSTNode<Integer> node) {
		
		if(node != null) {
			
			visit(node);
			preOrder(node.left);
			preOrder(node.right);
			
		}
		
	}
		
	private void inOrder(BSTNode<Integer> node) {
		
		if(node != null) {
			
			inOrder(node.left);
			visit(node);
			inOrder(node.right);
		
		}
		
	}
	
	private void postOrder(BSTNode<Integer> node) {
		
		if(node != null) {
			
			postOrder(node.left);
			postOrder(node.right);
			visit(node);
			
		}
		
	}
		
	public void insert(int element) {
		
		BSTNode<Integer> rootCopy = root, parentNode = null;
		
		while(rootCopy != null) { //find a place for inserting new node
			
			parentNode = rootCopy;
			
			if(rootCopy.key < element) {
				
				rootCopy = rootCopy.right;
			
			}
			else {
				
				rootCopy = rootCopy.left;
				
			}				 
		
		}
		
		if(root == null) {
			
			root = new BSTNode<Integer>(element);
		
		}
		else if(parentNode.key < element) {
			
			parentNode.right = new BSTNode<Integer>(element);
		
		}
		else {
			
			parentNode.left = new BSTNode<Integer>(element);
		
		}
		
	}
	
	public void delete(int target) {
		
		BSTNode<Integer> targetNode = root, parent = root;
				
		while(targetNode != null && targetNode.key != target) {
			
			parent = targetNode;
			
			if(targetNode.key < target) {
				
				targetNode = targetNode.right;
			
			}
			else {
				
				targetNode = targetNode.left;
			
			}
		
		}
		
		if(targetNode == null) {
			
			System.out.println("Target node " + target + " not found");
		
		}
		else if(targetNode.left == null && targetNode.right == null) {
				
			deleteLeafNode(parent, targetNode);
			
		}
		else if(targetNode.left == null || targetNode.right == null) { 
				
			deleteNodeWithOneChild(parent, targetNode);
			
		}
		else {
				
			deleteByMerging(targetNode, parent, target); //node to be deleted contains subtrees
			
		}
				
	}
	
	private void deleteNodeWithOneChild(BSTNode<Integer> parent, BSTNode<Integer> targetNode) {
		
		//get non-null child of target
		BSTNode<Integer> childNode;
		
		if(targetNode.left == null) {
			
			childNode = targetNode.right;
		
		}
		else {
			
			childNode = targetNode.left;
		
		}
		
		//assign as child of parent
		if(parent.left == targetNode) {
			
			parent.left = childNode;
		
		}		
		else {
			
			parent.right = childNode;
			
		}			
	
	}
	
	private void deleteLeafNode(BSTNode<Integer> parent, BSTNode<Integer> targetNode) {
		
		if(parent.left != null && parent.left.key == targetNode.key) {
			
			parent.left = null;
		
		}
		else {
			
			parent.right = null;
		
		}
		
	}
	
	private void deleteByMerging(BSTNode<Integer> targetNode, BSTNode<Integer> parent, int target) {
						
		BSTNode<Integer> targetNodeCopy = targetNode;
		
		if(targetNodeCopy != null && targetNodeCopy.key == target) {
			
			BSTNode<Integer> temp = targetNodeCopy.left; //1. Move left
			
			while(temp.right != null) {					 //2. Then move right as far as possible
				temp = temp.right;
			}
			
			temp.right = targetNodeCopy.right;
			targetNodeCopy = targetNodeCopy.left;
									
			if(targetNode == root) {
				
				root = targetNodeCopy;
			
			}
			else if(parent.left == targetNode) {
				
				parent.left = targetNodeCopy;
			
			}
			else {
				
				parent.right = targetNodeCopy;
			
			} 
		
		}
		
	}
	
}
