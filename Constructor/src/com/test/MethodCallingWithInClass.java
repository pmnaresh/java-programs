package com.test;

public class MethodCallingWithInClass {
	public static void methodOne() {
		System.out.println("iam Static  method one ");
		//methodTwo();
	}
	public static void methodTwo() {
		System.out.println(" i am Static Method two");
		methodOne();
	}
	

	public static void main(String[] args) {
		methodTwo();
		MethodCallingWithInClass m = new MethodCallingWithInClass();
		m.animal();
		m.bird();
		

	}
	public void animal() {
		System.out.println("it is animal with four legs and one tail");
		
		bird();
	}
	public void bird() {
		System.out.println("it is a fly with beautiful feathrs and color");
		//animal();
		
	}

}
