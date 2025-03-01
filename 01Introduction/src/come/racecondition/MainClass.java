package come.racecondition;

public  class MainClass {

	public static void main(String[] args) {
		Resource r=new Resource();
		Thread1 t1= new Thread1(r);
		Thread1 t2 = new Thread1(r);
		Thread1 t3= new Thread1(r);
		Thread1 t4 = new Thread1(r);
		Thread1 t5=new Thread1(r);
		Thread1 t6=new Thread1(r);
		t2.start();
		t2.setName("AAAAAAAAAA");
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		t1.start();
		t1.setName("NNNNNNN");
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		t3.setName("RRRRRRR");
		t4.setName("EEEEEEEE");
		t5.setName("SSSSSSSSS");
		t6.setName("HHHHHHHHH");
		t3.start();
		t4.start();
		t5.start();
		t6.start();
//		System.out.println("  how ");
	}

}
