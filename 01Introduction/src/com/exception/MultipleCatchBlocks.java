package com.exception;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try {
		int array[]= new int[10];
		System.out.println("we created integer array");
		array[5]=10/0;
		System.out.println(array[9]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("array is out of bound");
			
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("arithmatic Exception is occur");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
