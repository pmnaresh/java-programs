package com.naresh.threadhandling;

public class Main1 {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread1 t2 =new Thread1();
		t1.run();
		t2.run();
		
		Thread thread1=new Thread(t1);
		Thread thread2=new Thread(t2);
		thread1.start();
		thread2.start();

}
}