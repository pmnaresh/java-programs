package com.hashsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;



public class ClassA {

	public static void main(String[] args) {
//		Set set = new HashSet();
//		
//		set.add(new String ("Naresh"));
//		set.add("suresh");
//		set.add("priya");
//		set.add("chinini");
//		set.add(new String("ramamurthy "));
//		set.add(new Student(110, "Ramaa", "Madanapalle"));
//		set.add(new Student(182, "Ram", "kadapa"));
//		
//		System.out.println(set.size());
//		
//		System.out.println(set);
//		System.out.println("**********************************");
//		
//		for(Object obj:set) {
//			System.out.println(obj);
//		}
//		
//		System.out.println("**********************************");
//		
//		Iterator itr = set.iterator();
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//			
//			
//		}
//		HashSet<Student> studentlist= new HashSet();
//		studentlist.add(new Student(123, "nari", "angallu"));
//		studentlist.add(new Student(124, "bank", "mpl"));
//		studentlist.add(new Student(125, "sbi", "bng"));
//		studentlist.add(new Student(126, "icci", "chittor"));
//		studentlist.add(new Student(127, "hdfc", "hyd"));
//		studentlist.addAll(set);
//		
//		System.out.println(studentlist.size());
//		for (Student student:studentlist) {
//			
//			if (student.getAddress().equalsIgnoreCase("madanapalle")){
//				System.out.println(student);
//				
//			}
				
//		}
//		
		HashSet<String> hash = new HashSet();
		hash.add("Naresh");
		hash.add("Naveen");
		hash.add("sulthan");
		hash.add("Mitra");
		hash.add("Dasars");
		hash.add("Billa");
		hash.add("jagga");
		hash.add(null);
		
		
	
		
		for(String str:hash) {
			System.out.println("by using enhanced for loop "+str);
		}
		System.out.println("**************");
		
		
		Iterator itr = hash.iterator();
		while(itr.hasNext()) {
			System.out.println("by using Iterator "+itr.next());
		}
		
		HashSet<Student> hash1= new HashSet();
		hash1.add(new Student(4562, "Virat", "Bangalore"));
		hash1.add(new Student(4552, "Rohit", "mumbai"));
		hash1.add(new Student(4542, "Dhoni", "chennai"));
		hash1.add(new Student(4532, "iyer", "kolkatta"));
		hash1.add(new Student(4522, "rishab", "delhi"));
		hash1.add(new Student(4512, "sanju", "rajastan"));
		
			System.out.println("*********************");
	
		HashSet hashset= new HashSet(hash);
		hashset.add("rahul");
		hashset.add("hardik");
		hashset.addAll(hash);
		hashset.addAll(hash1);
		System.out.println(hashset.size());
		
		for(Object  obj :hashset) {
			System.out.println("in the hash set "+obj);
		}
		
		System.out.println(hashset.removeAll(hash1));
		System.out.println(hashset.size());
		
		
		System.out.println("by using Splitator :"+hashset.spliterator());
		
		
		
		ArrayList<String> list=new ArrayList<String>();  
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ajay");  
          
        HashSet<String> set=new HashSet(list);  
        set.add("Gaurav");  
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
