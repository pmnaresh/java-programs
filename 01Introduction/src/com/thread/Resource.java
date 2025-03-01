package com.thread;

public class Resource extends Thread {
	int num;

	public Resource(int num) {

		this.num = num;
	}
	@Override
	public void run() {
//		table(8);
		table();
	
		
	}
	private void table() {
		for (int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(num +"*" + i +"="+ num*i);	}
		
	}
	
	

}
