package com.workspace;

public class Employee {
	int empNo;
	String empName;
	 int salary;
	
	public Employee(int empNo, String empName, int salary) {
		
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1010, "suresh", 56000);
		Employee emp2 = new Employee(1011, "mahesh", 10000);
		Employee emp3 = new Employee(1012, "naresh", 70000);
		Employee emp4 = new Employee(1013, "hareesh", 40000);
		Employee emp6 = new Employee(1014, "vipina", 30000);
		
		Employee emp5 = new Employee(1015, "manoj", 90000);
		Employee emp7 = new Employee(1016, "nandini", 75000);
		Employee emp8 = new Employee(1017, "sriman", 54000);
		Employee emp9 = new Employee(1018, "srikrishna", 46000);
		Employee emp10 = new Employee(1019, "pradeesh", 28000);
		
		Employee[] empList = new Employee[10];
		empList[0] = emp1;
		empList[1] = emp2;
		empList[2] = emp3;
		empList[3] = emp4;
		empList[4] = emp6;
		empList[5] = emp5;
		empList[6] = emp7;
		empList[7] = emp8;
		empList[8] = emp9;
		empList[9] = emp10;
		
		Employee[] result =getEmployeesmorethen50k(empList);
		for(Employee res:result) {
			System.out.println(res);
		}
		
		
	}
public static Employee[] getEmployeesmorethen50k(Employee[] arrayOfEmp) {
		
		
		int count =0;
		for(int i = 0 ; i<arrayOfEmp.length; i++) {
			if(arrayOfEmp[i].salary>50000) {
				count++;
			}
		}
		Employee[] newEmpArray = new Employee[count];
		int j=0;
		for(int i = 0 ; i<arrayOfEmp.length; i++) {
			if(arrayOfEmp[i].salary>50000) {
				newEmpArray[j] = arrayOfEmp[i];
				j++;
			}
		}
		return newEmpArray;
	}
	
}


