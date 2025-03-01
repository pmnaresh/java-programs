package com.thread;

public class MainRes {

	public static void main(String[] args) {
		Resource resource = new Resource(5);
		Resource resource1= new Resource(9);
		Thread t1 = new Thread(resource);
		Thread t2 = new Thread(resource1);
		t1.start();
		t2.start();
		
		

	}

}
