package com.test;

public class Employee {
	public int EmpId;
	public String name;
	public double salary;
	
	public Employee(int eid , String ename,double esal) {
		EmpId = eid;
		name = ename;
		salary=esal;
	}
	public Employee() {
		
	}
	public Employee(int eid, String ename) {
		EmpId= eid;
		name = ename;
		
	}
	
}
