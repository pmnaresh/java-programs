package com.collection;

import java.util.ArrayList;

public class Naresh {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(new Student(12, "Raju", "bng"));
		ar.add(new Student(13, "ram", "bng"));
		ar.add(new Student(14, "rocky", "ctm"));
		ar.add(new Student(15, "bheem", "tpt"));
		
		
		ArrayList adr= new ArrayList();
		
		for(int i=0;i<ar.size();i++) {
			if(((Student)ar.get(i)).address.equalsIgnoreCase("Bng")) {
				System.out.println((Student)ar.get(i));
				
		
	}
	
		
	}

}
}