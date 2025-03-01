package com.thread;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		Thread2 t1=new Thread2(10);
		Thread2 t2 = new Thread2(16);
		t1.start();
		t2.start();
		t1.setName("Naresh");
		System.out.println(t1.getName());
		t1.stop();
		t1.wait();

	}

}
