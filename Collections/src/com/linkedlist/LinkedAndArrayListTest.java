package com.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class LinkedAndArrayListTest {
	LinkedAndArrayList obj = new LinkedAndArrayList();

	@Test
	void testOperationOnLinkedlist() {
		obj.operationOnLinkedlist();
	}

	@Test
	void testOperationOnArraylist() {
		obj.operationOnArraylist();
	}

	@Test
	void testTraversingOnLinkedlist() {
		LinkedList linkedlist=new LinkedList();
			for(int i=0;i<100;i++) {
				linkedlist.add (new String("Naresh"));
			}
		
		obj.traversingOnLinkedlist(linkedlist);
	}

	@Test
	void testTraverseOnArraylist() {
		ArrayList arraylist=new ArrayList();
		for(int i=0;i<100;i++) {
			arraylist.add (new String("Kumar"));
		}
		obj.traverseOnArraylist(arraylist);
	}

}
