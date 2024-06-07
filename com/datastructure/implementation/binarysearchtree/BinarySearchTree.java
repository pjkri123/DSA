package com.datastructure.implementation.binarysearchtree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinarySearchTree {
	private Node root;
	private int count;
	
//	size
	public int size() {
		return count;
	}
	
//	isEmpty
	public boolean isEmpty() {
		return count==0;
	}
	
//	add element
	public boolean add(int val) {
		root=add(root,val);
		if(root==null) return false;
		return true;
	}
	private Node add(Node n, int val) {
		if(n==null) {
			n=new Node(val);
			count++;
			return n;
		}
		if(val<n.val) n.left=add(n.left, val);
		else if(val>n.val) n.right=add(n.right, val);
		return n;
	}
	
//	search the element
	public boolean search(int val) {
		if(search(root,val)==null) return false;
		if(search(root,val).val==val) return true;
		return false;
	}
	private Node search(Node n, int val) {
		if(n==null || n.val==val) return n;
		if(val<n.val) return search(n.left,val);
		return search(n.right,val);
	}
	
//	remove the element
	public boolean remove(int val) {
		root=remove(root,val);
		if(root==null) return false;
		count--;
		return true;
	}
	private Node remove(Node n, int val) {
		if(n==null) return n;
		if(val<n.val) n.left=remove(n.left,val);
		else if(val>n.val) n.right=remove(n.right,val);
		else {
			if(n.left==null) return n.right;
			else if(n.right==null) return n.left;
			n.val=minValue(n.right);
			n.right=remove(n.right,n.val);
		}
		return n;
	}
	private int minValue(Node n) {
		int min=n.val;
		while(n.left!=null) {
			min=n.left.val;
			n=n.left;
		}
		return min;
	}
	
//	preOrder
	public void preOrder() {
		preOrder(root);
	}
	private void preOrder(Node n) {
		if(n==null) return;
		System.out.print(n.val+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	
//	inOrder
	public void inOrder() {
		inOrder(root);
	}
	private void inOrder(Node n) {
		if(n==null) return;
		inOrder(n.left);
		System.out.print(n.val+" ");
		inOrder(n.right);
	}
	
//	postOrder
	public void postOrder() {
		postOrder(root);
	}
	private void postOrder(Node n) {
		if(n==null) return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.val+" ");
	}
	
//	levelwise printing
	public void levelOrder() {
		int x=1;
		Queue q=new ArrayDeque();
		q.add(root);
		while(!q.isEmpty()) {
			Node n= (Node) q.poll();
			System.out.print(n.val);
			if(x++<count) System.out.print("->");
			if(n.left!=null) q.add(n.left);
			if(n.right!=null) q.add(n.right);
		}
	}
	
//	print in tree form
	public void print2D() {
		print2D(root);
	}
	private void print2D(Node n) {
		print2D(n,0);
	}
	private void print2D(Node n, int level) {
		if(n==null) return;
		level+=5;
		print2D(n.right,level);
		for(int i=5;i<level;i++) System.out.print(" ");
		System.out.println("|-->"+n.val);
		print2D(n.left,level);
	}
}
