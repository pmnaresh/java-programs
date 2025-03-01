package com.exception;

public class Throw1 {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("person is not eligible for voting");
		}
		else {
			System.out.println("Eligible for voting ");
		}
		
	}
	public static void main(String[] args) {
		validate(13);
		System.out.println("Rest of code ");
	}
}

