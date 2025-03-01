package com.test;

public class withThrow{
	public static void add1() {
		add(15);
		System.out.println("how are you");
	}
	public static void add(int age) {
		if(age<18) {
			throw new ArithmeticException();
		}
	}
	
	public static void main(String[] args) {
		try {
		add1();
		}
		catch(Exception e) {
			System.out.println(e.fillInStackTrace());
		}
		System.out.println("hii");
		System.out.println("hello");
		
	}

}
