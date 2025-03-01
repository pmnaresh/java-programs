package com.workspace;

import java.util.Scanner;

public class TestTable {
	
	public static void  table(int num) {
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);

		}
		
	}
	public static void main(String[] args) {
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int num=sc.nextInt();
		TestTable testtable = new TestTable();
		testtable.table(num);
		
		
		}while(1>0);
		
	}

}
