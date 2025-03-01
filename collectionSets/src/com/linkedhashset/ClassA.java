package com.linkedhashset;

import java.util.LinkedHashSet;

public class ClassA {

	public static void main(String[] args) {
		LinkedHashSet<String> linked = new LinkedHashSet();
		linked.add(new String("Naresh"));
		linked.add(new String("Naresh"));
		linked.add(new String("suresh"));
		
		
		
		System.out.println("linked size is :"+linked.size());
		
		LinkedHashSet linked1 = new LinkedHashSet();
		linked1.add("Kumar");
		linked1.add(new Integer(12));
		linked1.add(new String("ndcvac"));
		System.out.println(linked1.addAll(linked));
		
		System.out.println("linked1 size is :"+linked.size());
		
		
		for(Object obj : linked1) {
			System.out.println(obj);
		}

	}

}
