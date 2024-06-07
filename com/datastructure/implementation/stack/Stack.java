package com.datastructure.implementation.stack;

public class Stack {
	private Node node;
	private int count;
	
	public void push(Object ele) {
		if(node==null) {
			node=new Node(ele);
			count++;
			return;
		}
		node=new Node(ele,node);
		count++;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public int size() {
		return count;
	}
	public Object peek() {
		if(isEmpty()) return "No element found";
		return node.ele;
	}
	public Object pop() {
		if(isEmpty()) return "No element found";
		Object ele=node.ele;
		node=node.next;
		count--;
		return ele;
	}
}
