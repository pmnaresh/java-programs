package com.workspace;

public class Factorial {

	public static int enternumnber(int num) {
		if (num < 1) {
			return 0;
		}

		else {
			int fact = 1;
			for (int i = 1; i <= num; i++) {

				fact = fact * i;

			}
			return fact;
		}
	}

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		System.out.println(fact.enternumnber(1));

	}

}
