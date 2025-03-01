package come.racecondition;

public class Naresh extends Thread {
	
	Bank bank;
	public Naresh(Bank bank) {
		this.bank= bank;
		
	}
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			try {
				System.out.println("thread is before sleep"+Thread.currentThread().getState());
				Thread.sleep(500);
				Thread.yield();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bank.deposit(50);
		}
		
		
	}

}
