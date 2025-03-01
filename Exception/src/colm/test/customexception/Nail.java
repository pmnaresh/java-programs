package colm.test.customexception;

public class Nail extends Exception {
	public String message;
	 
	public Nail() {
		super();
		
	}
	public Nail(String message) {
		this.message=message;
	}

}
