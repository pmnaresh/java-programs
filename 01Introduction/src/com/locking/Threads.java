package com.locking;

public class Threads extends Thread {
	Lock lock;
	public Threads(Lock lock) {
		this.lock=lock;
		
	}
	@Override
	public void run() {
		lock.methodone();
		lock.methodtwo();
	}

}
