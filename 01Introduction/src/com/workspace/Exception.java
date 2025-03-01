package com.workspace;



public class Exception {

	public static void main(String[] args) {
		Exception exception = new Exception();
		try {
		exception.method1();
		}
		catch(ArithmeticException e ) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}
	public void method1()  {
		 int a[]=new int[5];    
         a[5]=30/1;   
	}
}