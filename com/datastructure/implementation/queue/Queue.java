package com.datastructure.implementation.queue;

public class Queue {
	private Node head;
	private Node tail;
	private int count;
	//in this adding first removing first
	public void add(Object ele) {
		Node n=new Node(ele);
		if(head==null) {
			head=n;
			tail=head;
			count++;
			return;
		}
		tail.next=n;
		tail=tail.next;
		count++;
	}
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public Object peek() {
		if(isEmpty()) return "No element found";
		return head.ele;
	}
	public Object poll() {
		if(isEmpty()) return "No element found";
		Object ele=head.ele;
		head=head.next;
		count--;
		return ele;
	}
}
