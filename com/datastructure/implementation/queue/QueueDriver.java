package com.datastructure.implementation.queue;

public class QueueDriver {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(14);
		q.add(30);
		q.add(43);
		
		System.out.println("size : "+q.size());
		System.out.println("is queue empty : "+(q.isEmpty()?"Yes":"No"));
		System.out.println("topmost element : "+q.peek());
		System.out.println("remove the element : "+q.poll());
		System.out.print("elements : ");
		while(!q.isEmpty()) {
			System.out.print(q.poll()+" ");
		}
		System.out.println("\nsize : "+q.size());
		System.out.println("is queue empty : "+(q.isEmpty()?"Yes":"No"));
		System.out.println("topmost element : "+q.peek());
		System.out.println("remove the element : "+q.poll());
	}

}
