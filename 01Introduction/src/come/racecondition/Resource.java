package come.racecondition;



public  class Resource {
	public synchronized void newResource(int num) {
		for (int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i +" is exicuting and current thread  name is "+Thread.currentThread().getName());
		}
		
	}
}
