package com.exception;

public class Finally {

	public static void main(String[] args) {
		try {
			int result = 25/0;
			System.out.println(result);
			System.out.println("code is exicuted");
		}
		catch(Exception e) {
		System.out.println(	e.fillInStackTrace());
			
		System.out.println("exception handled");
		}
		finally {
			System.out.println("finally block is exicuted");
		}
		System.out.println("rest of code");
		
	}

}
