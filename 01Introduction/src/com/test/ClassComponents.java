package com.test;

public class ClassComponents {
	int num3;

	public static  int method1(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("two integer variable");
		return result;

	}

	public static int method2(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		System.out.println("three integer variable");
		return result;
	}

	public static int method3(float num1, int num2) {
		int result = (int) ((float) num1 + num2);
		System.out.println("two arguments with diffrent parameters");
		return result;

	}

	public static int method4(int var1, int var2, int var3) {
		int result = var1 + var2 - var3;
		System.out.println("threee parameters");
		return result;
	}

	public static  void methodcaller() {
		
		System.out.println(method1(5, 1));
		System.out.println(method2(4, 5, 6));
		System.out.println(method3(4.5f, 3));
		System.out.println(method4(2, 3, 1));

	}

	public static void main(String[] args) {
		methodcaller();
		
	}

}
