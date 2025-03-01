package com.collectioncursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursors {

	public static void main(String[] args) {
		ArrayList<Employee> arraylist = new ArrayList(); 
		arraylist.add(new Employee(101, "Naresh", 56000.258f));
		arraylist.add(new Employee(102, "Suresh", 75100.268f));
		arraylist.add(new Employee(103, "Tippu", 75100.268f));
		arraylist.add(new Employee(104, "ice", 75100.268f));
		arraylist.add(new Employee(102, "Jagga", 75100.268f));
		arraylist.add(new Employee(102, "banda", 75100.268f));
		arraylist.add(new Employee(102, "billa", 75100.268f));
		
//		Iterator itr =arraylist.iterator();
//		while (itr.hasNext())
//		{
//			System.out.println("from the iterator loop");
//			
//			System.out.println(itr.next());
//			System.out.println("after the loop");
//			itr.remove();
//			System.out.println("after removing");
//			
//			
//		}
//		System.out.println(arraylist.size());
		
		
		System.out.println("***************************************");
		
		
//		ListIterator listiterator = arraylist.listIterator();
//		System.out.println("listiterator in forward direction");
//		while(listiterator.hasNext()) {
//			System.out.println(listiterator.next());
//		}
//		System.out.println("in the backword direction");
//		while(listiterator.hasPrevious()) {
//			System.out.println(listiterator.previous());
//			
//		}
		
		

	}

}
