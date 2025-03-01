package com.thread;

public class MainThread {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child t1=new Child(p);
		t1.start();
	
		Child t2 = new Child(p);
		t2.start();

	}

}
