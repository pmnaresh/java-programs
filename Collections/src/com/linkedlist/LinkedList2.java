package com.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList linkedlist= new LinkedList();
		linkedlist.add(new String("bjyfsfkha"));
		linkedlist.add(1, new Integer(201));
		linkedlist.add(new Character('n'));
		
		for (int i=0;i<linkedlist.size();i++) {
			System.out.println(linkedlist.get(i));
		}
		
		ArrayList  arraylist= new ArrayList();
		arraylist.add(new String("jbfk"));
		arraylist.add(new Double(1234656.44d));
		arraylist.add(new Float(12.0558f));
		arraylist.addAll(linkedlist);
		
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		

	}

}
