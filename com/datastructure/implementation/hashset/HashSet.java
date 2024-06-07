package com.datastructure.implementation.hashset;

public class HashSet {
	private Node[] a=new Node[10];
	private int count=0;
	
	public int size() {
		return count;
	}
	public boolean isEmpty() {
		return count==0;
	}
	public boolean add(Object ele) {
		int index=Math.abs(ele.hashCode()%a.length);
		if(a[index]==null) {
			a[index]=new Node(ele);
			count++;
			return true;
		}
		Node temp=null;
		Node curr=a[index];
		while(curr!=null) {
			if(curr.ele.equals(ele)) {
				return false;
			}
			temp=curr;
			curr=curr.next;
		}
		temp.next=new Node(ele);
		count++;
		return true;
	}
	public String toString() {
		String str="[";
		int x=1;
		for(int i=0;i<a.length;i++) {
			Node curr=a[i];
			while(curr!=null) {
				if(x++<count)
					str+=curr.ele+", ";
				else str+=curr.ele;
				curr=curr.next;
			}
		}
		str+=']';
		return str;
	}
	public boolean contains(Object ele) {
		int index=Math.abs(ele.hashCode()%a.length);
		Node curr=a[index];
		while(curr!=null) {
			if(curr.ele.equals(ele)) return true;
			curr=curr.next;
		}
		return false;
	}
	public boolean remove(Object ele) {
		int index=Math.abs(ele.hashCode()%a.length);
		Node prev=null;
		Node curr=a[index];
		while(curr!=null) {
			if(curr.ele.equals(ele)) {
				if(prev==null) {
					a[index]=a[index].next;
					count--;
					return true;
				}
				prev.next=prev.next.next;
				count--;
				return true;
			}
			prev=curr;
			curr=curr.next;
		}
		return false;
	}
}
