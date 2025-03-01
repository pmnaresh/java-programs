package com.locking;

public class Main {

	public static void main(String[] args) {
		Lock lock = new Lock("Naresh",1010);
		Threads t1 = new Threads(lock);
		Threads t2 = new Threads(lock);
		Threads t3= new Threads(lock);
		Threads t4= new Threads(lock);
		
		t1.setName("naresh");
		t2.setName("suresh");
		t3.setName("tippu");
		t4.setName("kumar");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}

