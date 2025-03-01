package com.test;

public class Variables {
	int b= 20 ;                              // variable declared inside the class i.e instance variable
	static int c=30;                         // static variable using static keyword

	public static void main(String[] args) {
		 int a = 10;
		 System.out.println(a);               // variable declared inside the method i.e local variables
		 
		 Variables Object = new Variables();  // creating object for instance variable
		 System.out.println(Object.b);         // printing instance variables
		 
		 System.out.println(c);               // printing static variables 
		 
		 
		 
		 

	}

}
