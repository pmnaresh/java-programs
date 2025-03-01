package com.test;

public class Else_if {

	public static void main(String[] args) {
		int marks= 22;
		if (marks<35) {
			System.out.println("you are failed");
		}
		else if(marks>35&&marks<50) {
			System.out.println("Second class");
			
		}
		else if (marks>50 && marks<70) {
			System.out.println("First class");
		}
		else if(marks>70&&marks<=100) {
			System.out.println("Distinction");
		}
	}
}
