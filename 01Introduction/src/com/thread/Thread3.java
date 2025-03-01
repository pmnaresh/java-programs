package com.thread;

public class Thread3 extends Thread {
	int num;
	public Thread3(int num) {
		this.num=num;
		
	}
	@Override
	public void run() {
		
		for(int i=0;i<num;i++) {
			try {
				System.out.println("Thread active  count is " +Thread.activeCount());
				System.out.println("thread name is " + Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getState());
				
					
				if(Thread.currentThread().equals(getName())) {	
					
				}
					
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			if(i%2==1) {
			System.out.println( " one is the remainder of "+i);
			}
		}
		
		
	}
	

}
