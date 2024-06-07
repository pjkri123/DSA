package com.datastructure.implementation.binarysearchtree;

public class BSTDriver {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.add(10);
		bst.add(20);
		bst.add(5);
		bst.add(8);
		bst.add(40);
		bst.add(30);
		bst.add(15);

		if(bst.isEmpty()) System.out.println("bst is not empty.");
		System.out.println("size : "+bst.size());
		
		System.out.println("is the element present ? : "+(bst.search(53)?"Yes":"No"));
		
		System.out.println("\nBefore removing the element");
		
		System.out.print("preOrder: ");
		bst.preOrder();
		
		System.out.print("\ninOrder : ");
		bst.inOrder();
		
		System.out.print("\npostOrder : ");
		bst.postOrder();
		
		System.out.print("\nlevelOrder : ");
		bst.levelOrder();
		
		System.out.println("\n\nprinting in tree form");
		bst.print2D();
		
		System.out.println("\n\nis the element removed ? : "+(bst.remove(10)?"Yes":"No"));
		
		System.out.println("\nAfter removing the element");
		
		System.out.println("\nsize : "+bst.size());
		
		System.out.print("preOrder: ");
		bst.preOrder();
		
		System.out.print("\ninOrder : ");
		bst.inOrder();
		
		System.out.print("\npostOrder : ");
		bst.postOrder();
		
		System.out.print("\nlevelOrder : ");
		bst.levelOrder();
		
		System.out.println("\n\nprinting in tree form");
		bst.print2D();
		
	}

}
