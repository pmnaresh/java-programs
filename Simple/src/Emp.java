
public class Emp
{
	public int add(int a , int b)
	{
		return a-(-b);
	}
	
		
	public static void main(String[] args) {
		
		Emp e = new Emp();
		
		System.out.println(e.add(2, 6));
	}

}
