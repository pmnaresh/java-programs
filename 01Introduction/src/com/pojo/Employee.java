package com.pojo;

public class Employee {
	private String name;  
	private String id;  
	private double sal; 
	
	public Employee(String name, String id, double sal) {
		
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public  void methodone(String id) {
		this.id =id;
	}
	public static void main(String[] args) {
		Employee emp = new Employee("narresh","1251",525582);
		
		
	}
	
}  


