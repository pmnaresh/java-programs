package come.racecondition;

public  class Thread1 extends Thread{
	
	Resource resource;
	
	public Thread1(Resource resource) {
		this.resource=resource;
		
	}
	@Override
	public  void run() {
		
		
		System.out.println("hi how are you :"+Thread.currentThread().getName());
		resource.newResource(5);
	}
	
	
}
