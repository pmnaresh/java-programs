package com.exception;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number1 : ");
		int num1= sc.nextInt();
		System.out.println("Enter a number 2 :");
		int num2=sc.nextInt();
		try {
		int result = num1/num2;
		System.out.println("result is : "+result);
		System.out.println("hiiii");
		}
		catch(Exception e) {
			System.out.println("number by zero we cant divide");
			
		}
		System.out.println("rest of the code ..................");
		
		

	}

}
