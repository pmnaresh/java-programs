package Synchronized;

public class Thread2 extends Thread {
	Firstclass firstclass;

	public Thread2(Firstclass firstclass) {
		this.firstclass = firstclass;
	}

	@Override
	public void run() {

		firstclass.methodOne(10);
	}
}
