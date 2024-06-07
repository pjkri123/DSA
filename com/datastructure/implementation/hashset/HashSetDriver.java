package com.datastructure.implementation.hashset;

public class HashSetDriver {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(30);h.add(40);h.add(50);h.add(60);h.add(24);h.add(70);h.add(27);
		h.add(53);h.add(13);h.add(21);h.add(22);h.add(23);
		System.out.println(h.isEmpty());
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains(29));
		System.out.println(h.remove(23));
		System.out.println(h);
	}
}
