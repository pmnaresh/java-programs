package com.test.finalexamples;

public class FinallyBlockExample {
	public static void main(String[] args) {
		try {
			System.out.println("inside try block");
			int num=510/000;
		}
		catch (Exception e) {
			System.out.println("exception handled");
			System.out.println(e);
		}
		finally {
			System.out.println("finally block is always exicuted");
		}
		System.out.println("'remaining code will be exicuted");
	}

}
