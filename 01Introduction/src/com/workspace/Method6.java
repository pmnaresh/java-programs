package com.workspace;

public class Method6 {

	
	public static String Employee1 (int EmployeeID,String EmployeeName ,double Salary) {
		if (Salary>50000) {
			return EmployeeName+" is a senior developer";
		}
		else{
			return EmployeeName+"  is a junior  developer";
			
		}
		
	}
	public static void main(String[] args) {
		Method6 method6 = new Method6();
		String str =method6.Employee1(101,"Naresh",50000d);
		System.out.println(str);
		
	}
	

}
