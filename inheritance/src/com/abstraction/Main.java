package com.abstraction;

public class Main {

	public static void main(String[] args) {
		Shape s= new Circle();
		s.draw();
		s.printing();
		
		Shape s1 = new Rectangle() ;
		s1.draw();
		s1.printing();
	}

}
