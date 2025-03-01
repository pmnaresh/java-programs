package com.interfaces;

public class ClassA implements Printable,Showable{

	@Override
	public void show() {
		System.out.println("i am showing the what is printed in the print method");
		
	}

	@Override
	public void ptint() {
		System.out.println("i am printing........");
		
	}
	
	public static void main(String[] args) {
		ClassA main = new ClassA();
		main.ptint();
		main.show();
	}

}
