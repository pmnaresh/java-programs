package com.thread;

public class Main1 {

	public static void main(String[] args) {
		Thread1 t1=new Thread1("Playing");
		Thread1 t2 =new Thread1("walking");
//		t1.run();
//		t2.run();
//		Runnable r1=new Thread1("playing");
//		Runnable r2= new Thread1("walking");
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t2);
		th1.start();
		th2.start();
	}

}
