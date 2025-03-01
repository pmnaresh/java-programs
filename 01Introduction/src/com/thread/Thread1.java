package com.thread;

public class Thread1 implements Runnable{
	String status;
	
	public Thread1(String status) {
		this.status=status;
		
	}
	
	@Override
	public void run() {
		
		for (int i=0;i<=10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hi The status is "+status+"..");
		}
		
	}

}
