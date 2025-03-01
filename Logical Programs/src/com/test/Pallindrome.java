package com.test;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		do {
			int sum = 0;
			int res = 0;

			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number");
			int num = sc.nextInt();
			int temp = num;
			while (num > 0) {
				res = num % 10;
				num = num / 10;

				sum = sum * 10 + res;

			}
			if (sum == temp) {
				System.out.println(temp + "  is pallindromne");
			} else {
				System.out.println(temp + "  is not a pallindrome");
			}

		} while (1 > 0);
	}
}
