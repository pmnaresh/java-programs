package com.test;

public class withTry {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			System.out.println(i / j);
			System.out.println("i am in try block");
			try {
				System.out.println("try block inside try block");
			} catch (Exception e) {
				System.out.println("catch block inside catch block");
			} finally {
				System.out.println("i am in finally block inside the try block");
			}

		} catch (Exception e) {
			System.out.println("i am in catch block");
			try {
				System.out.println("i am in try block inside catch block");
			} catch (Exception e1) {
				System.out.println("i am in catch block inside catch block");
			} finally {
				System.out.println(" iam in finally block inside catch block");
			}

		} finally {
			System.out.println("iam in finally block");
			try {
				System.out.println("iam in try block inside the finally block");
			} catch (Exception e) {
				System.out.println("i am in Catch block inside the finally block ");
			} finally {
				System.out.println("i am in finally block inside the finally block");
			}
		}

	}
}
