package com.pakage;

public class Overloading {
	public void methodone() {
		System.out.println("HIIIIIIII");
		
	}
	public void methodone(int a) {
		System.out.println("how arrreeeeee you ");
	}
	public int methodone(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Overloading  obj = new Overloading();
		obj.methodone();
		obj.methodone(10);
		System.out.println(obj.methodone(10,20));
	}

}
