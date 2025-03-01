package com.pakage;

import java.util.Scanner;

public class Choice {
	
	public static void main(String[] args) {
		do {
			int num=0;
			
			System.out.println("****************MENU OF THE RESTURENT***********************");

			System.out.println("1.Coffee   cost : 20 ");
			System.out.println("2.Tea      cost : 10 ");
			System.out.println("3.Juice    cost : 30 ");
			System.out.println("4.Cake     cost : 50 ");

			Scanner sc = new Scanner(System.in);
			System.out.println("please enter your choice ");
			String Choice = sc.next();

			System.out.println("your choCakeice is " + Choice);

			switch (Choice) {
			case "Coffee":
				System.out.println("please enter how many cups of coffee you want :");
				num = sc.nextInt();
				System.out.println("your bill is : " + num * 20);
				System.out.println();
				break;

			case "Tea":
				System.out.println("please enter how many cups of tea you want :");
				num = sc.nextInt();
				System.out.println("your bill is : " + num * 10);
				System.out.println();
				break;
			case "juice":
				System.out.println("how many glasses juice you want : ");
				num = sc.nextInt();
				System.out.println("your bill is : " + num * 30);
				System.out.println();
				break;

			case "Cake":
				System.out.println("how many portions Cake you want :");
				num = sc.nextInt();
				System.out.println("your bill is : " + num * 50);
				System.out.println();
				break;
			default:
				System.out.println("sorry your choice is not availabe");
				System.out.println();

			}

		} while (1 > 0);

	}
}