package com.thread;

public class Child extends Thread {
	
	Parent parent ;
	public Child(Parent parent) {
		this.parent = parent;
		
	}
	@Override
	public void run() {
		parent.method1(10);
	}
	

}
