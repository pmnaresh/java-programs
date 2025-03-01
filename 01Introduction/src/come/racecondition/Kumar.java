package come.racecondition;

public class Kumar  extends Thread{
	Bank bank ;
	public Kumar(Bank bank) {
		this.bank =bank;
		
	}
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bank.withdrawn(50);
		}
		
	}

}
