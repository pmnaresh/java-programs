package com.test.main;

import java.util.Scanner;

public class MainFormScannerClass {

	public static void main(String[] args) {
		CustDetails custdetails = new CustDetails();
		custdetails.details();
		boolean status = false;
		do{
			
			Service service = new Service();
			Scanner sc = new Scanner(System.in);
			System.out.println("choose 1 for Balance Enquiry");
			System.out.println("choose 2 for deposit");
			System.out.println("choose 3 for withdraw");
			System.out.println("enter yor choice");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Balance Enquiry ");
				System.out.println("Enter account number :");
				long acNumber = sc.nextLong();
				service.balanceEnquiry(acNumber);
				break;
			case 2:
				System.out.println("Deposit");
				System.out.println("Enter amount for deposit :");
				double amount = sc.nextDouble();
				service.deposit(amount);
				break;
			case 3:
				System.out.println("Withdraw");
				System.out.println("Enter amount for withdraw :");
				double amount1 = sc.nextDouble();
				service.withdraw(amount1);
			default:
				System.out.println("choose the number between 1 and 3");
				
			}
			System.out.println("Enter 1 to make transaction  or enter 2 to exit the transaction");
			status = false;
			int number = sc.nextInt();
			if (number == 1) {
				status = true;
			}
			} while (status);
			
		
		
	}
}

