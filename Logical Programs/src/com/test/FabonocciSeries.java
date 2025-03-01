package com.test;

public class FabonocciSeries {

	public static void main(String[] args) {
		int num=10;
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a);
		System.out.print(","+b);
		for (int i = 2; i <= num; i++) {
			c = a + b;
			System.out.print(","+c);
			a = b;
			b = c;
		}

	}

}
