package com.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;



public class LinkedAndArrayList{
	public int operationOnLinkedlist (){
		LinkedList linkedlist=new LinkedList();
		for(int i=0;i<100;i++) {
			linkedlist.add (new String("Naresh"));
		}
		System.out.println(linkedlist.size());
		
		return 1;
	}
		public int operationOnArraylist() {
		
		ArrayList arraylist=new ArrayList();
		for(int i=0;i<100;i++) {
			arraylist.add (new String("Kumar"));
		}
		System.out.println(arraylist.size());
		return 1;
	}
		public int traversingOnLinkedlist(LinkedList linkedlist) {
		
		for(int i=0;i<linkedlist.size();i++) {
			System.out.println(linkedlist.get(i));
		}
		return 1;
		}
		
		public int traverseOnArraylist(ArrayList arraylist) {
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		return 1;
	}
	
		
		
	
}
