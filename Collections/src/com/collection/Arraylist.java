package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {


	public static void main(String[] args ) {
		List arraylist = new ArrayList<>();
		
		arraylist.add(new Employee());
		arraylist.add(new Integer(1010));
		arraylist.add(new String("naresh"));
		arraylist.add(new Integer(1212));
		arraylist.add(new String("Kumar"));
		arraylist.add(2,new String( "NNNNNNN"));
		arraylist.addAll(arraylist);
		arraylist.contains('n');
		System.out.println("last index "+arraylist.lastIndexOf(arraylist));
		System.out.println(arraylist.add(new Scanner(System.in).getClass()));
		arraylist.get(2);
		for(int i=0;i<arraylist.size();i++) {
			try {
				System.out.println(arraylist.get(i));
			}
			catch(Exception e) {
				
			}
			
		}
		
		System.out.println("*********************");
		for(Object ar:arraylist) {
			System.out.println(ar);
		}
	}


	
	
}
