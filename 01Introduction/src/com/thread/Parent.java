package com.thread;

public class Parent {
	public synchronized void method1(int num) {
		for(int i=0;i<num ;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("im in method one "+Thread.currentThread().getName());
		}
		
	}
	
	
	
}