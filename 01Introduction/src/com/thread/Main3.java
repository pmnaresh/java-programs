package com.thread;

public class Main3 {

	public static void main(String[] args) {
		Thread3 t1=new Thread3(4);
		Thread3 t2 = new Thread3(12);
		t1.start();
		t2.start();
		t1.setName("naresh");
		System.out.println(t1.getName());
		System.out.println(Thread.currentThread().getState());
		System.out.println(t1.getId());
		t2.setName("kumar");
		
		

	}

}
