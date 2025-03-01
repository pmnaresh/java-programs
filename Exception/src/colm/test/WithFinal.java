package colm.test;

public class WithFinal {

	final float a=10.9f;
	final int b;
	{
		System.out.println("Hello");
	}
	static
	{
		System.out.println("90");
	}
	
	WithFinal(int x)
	{
		b=x;//this.b=b;
	}
	{
		System.out.println("good");
	}
	public static void main(String[] args) {
		
		System.out.println("guru..!");
		
		WithFinal t1 = new WithFinal (30);
		System.out.println("Bad....!");
		System.out.println(t1.a);
		System.out.println(t1.b);
		WithFinal t2 = new WithFinal(90);
		System.out.println(t2.a); 
		System.out.println(t2.b);  

}
}


