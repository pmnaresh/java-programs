package Synchronized;

public class Firstclass {

	public void methodOne(int num) {
		for (int i = 0; i < num; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" Thread name is  : " + Thread.currentThread().getName() + "  and Thread Priority is :"
					+ Thread.currentThread().getPriority());
		}

	}
}