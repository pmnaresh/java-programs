package com.generics;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import com.collection.Student;


public class NewClass {

//	public static void main(String[] args) {
//		
//		List arrayList = new ArrayList(); // it allows any kind of object 
//		arrayList.add(new String("java"));
//		
//		// I want restrict the collection to add only one type of objects 
//		arrayList.get(0);
//		
//		ArrayList<Student> studentList = new ArrayList();
//		studentList.add(new Student(1010, "sriman", "kurnool"));
//		studentList.add(new Student(1020, "srikanth", "kadiri"));
//		studentList.add(new Student(1030, "sri harsha", "madanapalli"));
//		studentList.add(new Student(1040, "srimukhi", "tirupati"));
//		studentList.add(new Student(1050, "sri nandanan", "hyderabad"));
//		studentList.add(new Student(1060, "sri chandana", "tanakal"));
//		studentList.add(new Student(1070, "sri charan", "vepalapalli"));
//		studentList.add(new Student(1080, "srimadan", "mulakalacheruvu"));
//		studentList.add(new Student(1090, "sri sai", "kothakota"));
//		studentList.add(new Student(1000, "sriram", "kadapa"));
//
//
//		System.out.println("****************");
//		for(Student a:studentList) {
//			System.out.println(" from for each loop or enhance for loop");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(a);
////			studentList.remove(a);
//		}
//		
//		System.out.println("size of studentList "  + studentList.size());
//
//		System.out.println("****************");
//		int size = studentList.size();
//		for(int i=0;i<size;i++) {
//			System.out.println(" from for loop " + i );
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}		
//			System.out.println(studentList.remove(studentList.get(i)));
//		}
//		
//		System.out.println("size of studentList "  + studentList.size());
//		
//		System.out.println("****************");
//		Iterator studentItr = studentList.iterator();
//
//		while(studentItr.hasNext()) {
//			System.out.println("from Iterator each element");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(studentItr.next());
//			
//		}
	
//}
	public static void main(String[] args) {
		int a =9;
		int b=5;
		
		System.out.println(a+b);
	}
	
	}