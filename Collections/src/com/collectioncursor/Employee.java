package com.collectioncursor;

public class Employee {
	int Empid;
	String Empname;
	float Empsalary;
	public Employee(int empid, String empname, float empsalary) {
		
		Empid = empid;
		Empname = empname;
		Empsalary = empsalary;
	}
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", Empsalary=" + Empsalary + "]";
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public float getEmpsalary() {
		return Empsalary;
	}
	public void setEmpsalary(float empsalary) {
		Empsalary = empsalary;
	}
	
	
	
	

}
