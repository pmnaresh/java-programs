package com.test;

public class Employee {
	int empId;
	String empName;
	String empAddress;
	
	public void setEmpId(int empId) {
		this.empId=empId;	
	}
	public int getEmpId() {
		return empId;
		
	}
	public void setEmpName(String empName) {
		this.empName=empName;
		
	}
	public String getEmpName() {
		return this.empName;
		
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress=empAddress;
	}
	public String getEmpAddress() {
		return empAddress;
	}
public static void main(String[] args) {
	Employee emp= new Employee();
	emp.setEmpId(101);
	System.out.println(emp.getEmpId());
	emp.setEmpName("Naresh");
	System.out.println(emp.getEmpName());
	emp.setEmpAddress("MPL");
	System.out.println(emp.getEmpAddress());
	}
}
