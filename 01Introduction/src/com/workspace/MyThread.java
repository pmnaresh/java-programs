package com.workspace;

public class MyThread extends Thread {
	int num;
 
	@Override
	public void run() {
		for (int i=1;i<=num;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			if (num%i==0) {
				System.out.println(i + "is the factor of " + num);
			
		}
	}

	

}
	public static void main(String[] args) {
		MyThread t1=new MyThread ();
		t1.num=15;
		MyThread t2=new MyThread();
		t2.num=18;
		t1.start();
		t2.start();
		
	}
}