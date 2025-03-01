package com.scanner;

import java.util.Scanner;

public class Intrest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter thre Principe , time and rate of intrest ");
		
		System.out.println("Enter  the principle :");
		int principle= sc.nextInt();
		
		System.out.println("please enter The time in years :");
		int time =sc.nextInt();
		
		System.out.println("please enter the rate of intrest :");
		float rate =sc.nextFloat();
		
		float s1=(principle*time*rate)/100 ;
		 System.out.println("intrest is :"+s1);
		
		
		
	}

}
