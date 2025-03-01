package Synchronized;

public class Main {

	public static void main(String[] args) {
		Firstclass f = new Firstclass();
		Thread2 t1 = new Thread2(f);
		Thread2 t2 = new Thread2(f);
		Thread2 t3 = new Thread2(f);

		t1.start();
		t1.setName("Naresh");
		t1.setPriority(1);
		
		t2.start();
		t2.setName("Kumar");
		t2.setPriority(5);
		
		t3.start();
		t3.setName("Suresh");
		t3.setPriority(10);
	}

}
