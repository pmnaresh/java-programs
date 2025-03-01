package com.workspace;

import java.util.Scanner;

public class TriangleStar {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in); 
		int number = sc.nextInt();
		
        int count = number - 1;
        for (int i = 1; i<= number; i++) {
            for (int j = 1; j <= count; j++)
                System.out.print(" ");
            	count--;
            for (int j = 1; j <= 2 * i-1; j++)
                System.out.print("*");
            	System.out.println();
 
        }
    }
}
