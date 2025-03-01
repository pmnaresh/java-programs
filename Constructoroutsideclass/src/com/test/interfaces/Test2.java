package com.test.interfaces;

public class Test2 implements Test,Test1{
	@Override
	public void add() {
		System.out.println("hiiii i am in add method");
		
	}

	@Override
	public void add1() {
		
		System.out.println("hello iam in add1 method");
	}
	public static void main(String[] args) {
		Test2 t1= new Test2();
		t1.add();
		t1.add1();
		t1.display();
	}

	@Override
	public void display() {
		System.out.println("hi iam displaying ");
		
	}

}
