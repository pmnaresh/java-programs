package com.test;

public class InstanceToStatic {
	
	public void music() {
		System.out.println("i am flutist");
		System.out.println("****************");
		draw();
		
		
	}
	public static void draw() {
		System.out.println("i am an artist");
	
		
	}

	public static void main(String[] args) {
		
		InstanceToStatic its =new InstanceToStatic();
		draw();
		its.music();
		
	}

}
