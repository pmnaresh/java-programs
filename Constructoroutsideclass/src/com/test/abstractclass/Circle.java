package com.test.abstractclass;

public class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("i am drawing circle");
		
	}
	
	public static void main(String[] args) {
		Shape s= new  Circle();
		s.draw();
		s.printing();
		s.shape();
		Shape s1=new Rectangle();
		s1.draw();
		s1.shape();
		s1.printing();
		
	}

}
