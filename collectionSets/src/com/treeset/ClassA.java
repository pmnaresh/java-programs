package com.treeset;

import java.util.TreeSet;



public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TreeSet tree = new TreeSet();
		 tree.add("Naresh");
		 tree.add("Suresh");
		 tree.add("Kumar");
		 tree.add("Vamsi");
		 for(Object obj:tree) {
			 System.out.println(obj);
		 }
		 
//		
//		treeset.add(new String ("One"));
//		treeset.add(new String("Two"));
//		treeset.add(new String("Three"));
//		treeset.add(new String("Four"));
		TreeSet<Student> treeset = new TreeSet<Student>();
		treeset.add(new Student(12, "Naresh", "Madanapalle"));
		treeset.add(new Student(13, "Ramu", "Angallu"));
		treeset.add(new Student(14, "Sankara", "Mulakalacheruvu"));
		treeset.add(new Student(15, "Niramala", "Kadiri"));
		treeset.add(new Student(16, "Fgdgjtd", "Kotthapeta"));
		
		
		
		for(Student obj : treeset) {
			System.out.println(obj);
		}

	}

}
