package com.workspace;

import java.io.Serializable;

public class Student  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int rollnumber;
	public String name;
	public String address;
	public float salary;
	
	public Student(int rollnumber, String name, String address, float salary) {
		
		this.rollnumber = rollnumber;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	

	

}
