package com.datastructure.implementation.stack;

public class StackDriver {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(40);
		s.push(30);
		s.push(90);
		s.push(20);
		
		System.out.println("size : "+s.size());
		System.out.println("is stack empty : "+(s.isEmpty()?"Yes":"No"));
		System.out.println("topmost element : "+s.peek());
		System.out.print("elements : ");
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
		System.out.println("\nsize : "+s.size());
		System.out.println("is stack empty : "+(s.isEmpty()?"Yes":"No"));
		System.out.println("topmost element : "+s.peek());
		System.out.println("remove the element : "+s.pop());
	}

}
