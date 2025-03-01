package com.linkedlist;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		
		linkedlist.add(new String("Naresh"));
		linkedlist.add(new String("ram"));
		linkedlist.addFirst(new String ("charan"));
		linkedlist.addFirst(new String ("nari"));//insert at first place
		System.out.println(linkedlist.contains("Naresh"));//checks element is there or not
		System.out.println(linkedlist.element());//returns first element
		try {
			linkedlist.add(new Integer (1010));
		}
		catch(Exception e){
			System.out.println("Exception handled");
		}
		
		linkedlist.add(1,new String ("String"));
		linkedlist.add(new String ("kumar"));
		linkedlist.add(new Integer (101));
		linkedlist.add(new Character('c'));
		System.out.println(linkedlist.descendingIterator());
		System.out.println(linkedlist.iterator());
		
		for (int i =0;i<linkedlist.size();i++) {
			System.out.println(linkedlist.get(i).getClass().getName());
			System.out.println(linkedlist.get(i));
		}
		
		
		
		
//		}
}
}