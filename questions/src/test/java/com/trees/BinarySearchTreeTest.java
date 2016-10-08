package com.trees;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
	
	static private BinarySearchTree tree;
	
	@Before
	public void init() {
		tree = new BinarySearchTree();
		tree.insert(15);
		tree.insert(4);
		tree.insert(20);
		tree.insert(17);
		tree.insert(19);
		tree.insert(8);
		tree.insert(6);
		tree.insert(5);
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		tree.insert(9);
		tree.insert(11);
		tree.insert(12);
	}
		
	@Test
	public void testBinarySearchTreePrinter() {
		System.out.println("\nTree"); 
		BinarySearchTreePrinter.printNode(tree.root);
	}
	
	@Test
	public void testBreadthFirstTraversal() {
		System.out.println("\n\nBreadth-First Traversal");
        tree.breadthFirst();
	}
	
	@Test
	public void testPreOrderTraversal() {
		System.out.println("\n\nDepth-First Traversal, Pre-Order");
        tree.preOrder();
	}
	
	@Test
	public void testInOrderTraversal() {
		System.out.println("\n\nDepth-First Traversal, In-Order");
        tree.inOrder();
	}
	
	@Test
	public void testPostOrderTraversal() {
		System.out.println("\n\nDepth-First Traversal, Post-Order");
        tree.postOrder();
	}
	
	@Test
	public void testDeleteLeafCompleteSubtree() {
		System.out.println("\n\nDelete Leaf: 7");
        tree.delete(7);        
        BinarySearchTreePrinter.printNode(tree.root);
	}
	
	@Test
	public void testDeleteLeafPartialSubtreeLeftIsNull() {
		System.out.println("\n\nDelete Leaf: 19");
        tree.delete(19);        
        BinarySearchTreePrinter.printNode(tree.root);
	}
	
	@Test
	public void testDeleteLeafPartialSubtreeRightIsNull() {
		System.out.println("\n\nDelete Leaf: 5");
        tree.delete(5);        
        BinarySearchTreePrinter.printNode(tree.root);
	}
	
	@Test
	public void testDeleteRoot() {
		System.out.println("\n\nDelete Root : 15");
        tree.delete(15);        
        BinarySearchTreePrinter.printNode(tree.root);
	}
	
	@Test
	public void testDeleteNodeWithLeftSubtree() {
		System.out.println("\n\nDelete Node : 20");
        tree.delete(20);        
        BinarySearchTreePrinter.printNode(tree.root);
	}
	
	@Test
	public void testDeleteNodeWithLeftNode() {
		System.out.println("\n\nDelete Node : 6");
        tree.delete(6);        
        BinarySearchTreePrinter.printNode(tree.root);
	}
	
	@Test
	public void testDeleteNodeWithSubtrees() {
		System.out.println("\n\nDelete Node : 4");
        tree.delete(4);        
        BinarySearchTreePrinter.printNode(tree.root);
	}
	
	@Test
	public void testDeleteNodeWithRightSubtree() {
		System.out.println("\n\nDelete Node : 9");
        tree.delete(9);        
        BinarySearchTreePrinter.printNode(tree.root);
	}
	
	@Test
	public void testIsBSTValid() {
		System.out.println("Is BST Valid?");
		BinarySearchTreePrinter.printNode(tree.root);
		assertTrue(tree.isBSTValid());
	}
}
