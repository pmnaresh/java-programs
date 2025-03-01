package come.racecondition;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Bank bank= new Bank(101,2000);
		
		Naresh naresh=new Naresh(bank);
		Kumar kumar= new Kumar(bank);
		naresh.start();
//		naresh.join();
		naresh.setName("Naresh");
		System.out.println(naresh.getName());
		System.out.println(Thread.currentThread().getState());
		kumar.start();
		kumar.setPriority(10);
		
	}

}
