package com.treemap;

public class Student  {
	int roll;
	String name;
	String fathername;
	String address;
	String phonenumber;
	public Student(int roll, String name, String fathername, String address, String phonenumber) {
		super();
		this.roll = roll;
		this.name = name;
		this.fathername = fathername;
		this.address = address;
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", fathername=" + fathername + ", address=" + address
				+ ", phonenumber=" + phonenumber + "]";
	}
	

}
