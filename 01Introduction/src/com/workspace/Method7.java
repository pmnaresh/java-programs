package com.workspace;

public class Method7 {
	 int EmployeeId;
	 String EmployeeName;
	 double Salary;
	
	public Method7(int EmployeeId,String EmployeeName,double Salary){
		this.EmployeeId=EmployeeId;
		this.EmployeeName=EmployeeName;
		this.Salary=Salary;
		
	}
	
	
 String methodone () {
		if (Salary>50000) {
			return EmployeeName+" is a senior developer";
		}
		else{
			return EmployeeName+"  is a junior  developer";
			
		}
		
	}
	public static void main(String[] args) {
		Method7 method7= new Method7(101,"Naresh",500000);
		String str =method7.methodone();
		System.out.println(str);
		
	}

}
