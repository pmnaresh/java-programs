package com.locking;

public  class Lock {
	 String name;
	 int number;
	 
	 public Lock(String name , int number) {
		 this.name=name;
		 this.number= number;
		 
	}
	 public synchronized void methodone() {
		 for (int i=0;i<10;i++) {
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("Thread name is :"+Thread.currentThread().getName());
		 }
	 }
	 public synchronized void methodtwo() {
		 for (int i=0;i<10;i++) {
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("Thread id is :"+Thread.currentThread().getId());
		 }
	 }
	 
	

}
