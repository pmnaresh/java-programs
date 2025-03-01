package colm.test;

public class Final {
	final int a=10;
	final int b;
	public Final(int b) {
		this.b=b;
	}
	public static void main(String[] args) {
		Final fi = new Final(20);
		System.out.println(fi.b);
		System.out.println(fi.a);
	}
	

}
