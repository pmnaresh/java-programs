package com.vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(null);
		arraylist.add(new String("Naresh"));
		arraylist.add(new Integer(120120));
		arraylist.add(null);
		
		
		System.out.println(arraylist);
		
		
		Vector vector = new Vector();
		vector.add(null);
		vector.addAll(arraylist);
		System.out.println(vector);
		
		 Iterator itr = vector.iterator();
		 
//		 for(;itr.hasNext();) {
//			 System.out.println(itr.next());
//		 }
		 
		 while(itr.hasNext()) {
			itr.next();
			try {
			System.out.println( itr.next());
			}
			catch(Exception e) {
				
			}
		 }
		
}
}