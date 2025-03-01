package com.test;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 12;
		int r = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				r = r + 1;
				break;
			}

		}

		if (r == 0) {
			System.out.println(num + " is prime number ");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

}
