package com.spring1;

public class Student {
	private int number;
	private String name;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("hi your roll number is " +number + "and your name is " +name);
	}
	

}
