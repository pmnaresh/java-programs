package com.methodoverloading;

public class ByChangingNumberOfParameters {
	
	public void methodone() {
		System.out.println("Default method");
	}
	public void methodone(int a) {
		System.out.println("with one parameter :"+a);
	}
	public void methodone(int a ,int b) {
		System.out.println("with two parameters :"+a+b);
	}
	public void methodone(int a , int b, int c) {
		System.out.println("with three parameters :"+a+b+c);
	}
	

}
