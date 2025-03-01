package com.exception;

public class TryCatchArray {

	public static void main(String[] args) {
		int array[]= {10,230,30,40,50};
		try {
			System.out.println(array[6]);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("please enter the index value less than array ");
		}

	}

}
