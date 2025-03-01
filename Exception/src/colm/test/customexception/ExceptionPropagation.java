package colm.test.customexception;

public class ExceptionPropagation {
	public void methodOne() throws Exception {
		methodtwo();
	}
	public void methodtwo() throws Exception {
		methodthree();
	}
	public void methodthree() throws Exception {
		methodfour();
	}
	public void methodfour() throws Exception{
		int x=50/0;
		throw new ArithmeticException();
		
	}
	public static void main(String[] args) {
		ExceptionPropagation ep= new ExceptionPropagation();
		try {
			ep.methodOne();
		}
		catch (Exception e) {
			System.out.println("exception hadled");
		}
	System.out.println("rest of code");
	}

}
