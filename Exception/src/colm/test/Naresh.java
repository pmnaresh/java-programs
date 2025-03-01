package colm.test;

public class Naresh {
	
	{
		System.out.println("HIi");
	}
	{
		System.out.println("Helloo");
	}
	{
		System.out.println("how are you");
	}
	final int a=10;
	final int b;
	public Naresh(int b) {
		this.b=b;
		System.out.println("constrictor exicuted");
	}
	{
		System.out.println("i am a block  after constructor ");
	}
	public static void main(String[] args) {
		Naresh naresh = new Naresh(10);
		System.out.println(naresh.a);
		System.out.println(naresh.b);
	}
	{
		System.out.println("iam a block after the main method");
	}
}
