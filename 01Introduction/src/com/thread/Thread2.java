package com.thread;

public class Thread2 extends Thread {
	int number;
	
	public Thread2(int number) {
		this.number=number;
	}
	@Override
	public void run() {
		factor();

	}
	public void factor() {
		for (int i=1;i<=number;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (number%i==0) {
				System.out.println(i+"is the factor of "+number);
				
			}
		}
	}

}
