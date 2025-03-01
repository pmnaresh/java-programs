package com.pakage;

import java.util.Scanner;

public class NumberChecker_Main {
	
	
	public static void main(String[] args) {
		do {
	
		System.out.println("please enter the number :");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		
		NumberChecker number=new NumberChecker();
		System.out.println("***********");
		if(number.Pollindrome(num)==false) {
			System.out.println(num + "is not a pallindrome");
		}
		else {
			System.out.println(num + "is a pallindrome");
		}
		System.out.println("++++++++++++++++++++++");
		if(number.armstrong(num)==false) {
			System.out.println(num + "is not a armstrong");
		}
		else {
			System.out.println(num + " is a armstrong");
		}
		number.perfectnumber(num);
		System.out.println("#########################");
		
		if(number.primenumber(num)==false) {
			System.out.println(num  +  "is not a prime number");
			
		}
		else {
			System.out.println(num  +  "is a prime number ");
		}
		System.out.println("************");
		if(number.evenodd(num)==false) {
			System.out.println(num  +  "is a odd number");
		}
		else {
			System.out.println(num  +  " is a even number");
		}
		System.out.println("_________________________________________________________");	
		}
		while(1>0);
	}}
	
			
	
		

	
	


