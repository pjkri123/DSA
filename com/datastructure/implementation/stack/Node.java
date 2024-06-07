package com.datastructure.implementation.stack;

public class Node {
	Object ele;
	Node next;
	Node(Object ele) {
		this.ele=ele;
	}
	Node(Object ele, Node next) {
		this.ele=ele;
		this.next=next;
	}
}
