package com.collection;

public class Student {
	int number;
	String name;
	String address;
	
	public Student(int number,String name,String address) {
		// TODO Auto-generated constructor stub
		this.number=number;
		this.name= name;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", address=" + address + "]";
	}
	

}
