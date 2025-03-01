package com.test;

public class ClassB {
	public void add() {
		System.out.println("instance method in classB");
	}
	public static void add1() {
		System.out.println("static method in classB");
	}
	public static void main(String[] args) {
		
		ClassA a= new ClassA();
		a.test1();
		System.out.println("****static method oin outside the class we can call by using object reference");
		a.test2();
		System.out.println("***we can call static method out side the class by using class name***");
		ClassA.test2();
		System.out.println("______________________________");
		ClassB b= new ClassB() ;
		b.add();
		System.out.println("**calling static method by using object reference**");
		b.add1();
		System.out.println("***with in class staic block**");
		add1();
		
	}
	

}
