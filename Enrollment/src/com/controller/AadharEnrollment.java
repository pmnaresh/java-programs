package com.controller;

import java.util.Scanner;

import com.service.AadharService;
import com.test.Aadhar;
import com.test.Address;

public class AadharEnrollment {
	AadharService service= new AadharService();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
		System.out.println("Available aadhar operations");
		
		System.out.println("1.creating aadhar card");
		System.out.println("2.retriving aadhar card");
		System.out.println("3.updating aadhar card");
		System.out.println("4.deleting aadhar card");
		
		System.out.println("chhose any operation in the  above list");
		
		Scanner sc = new Scanner(System.in);
		int choice =sc.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println("your choice is for creating aadhar card");
			createAadharCard();
			break;
		case 2 :
			System.out.println("your choice is for retrive aadhar card");
			retriveAadharCard();
			break;
		case 3 :
			System.out.println("your choice is for updating aadhar card");
			updatingAadharCard();
			break;
		case 4 :
			System.out.println("your choice is for daleting aadhar card");
			deletingAadharCard();
			break;
		default:
		System.out.println("your choive is not available ");
		break;
		}
		
		}

	while(1>0);
	}

	private static void deletingAadharCard() {
		
		
	}

	private static void updatingAadharCard() {
		
		
	}

	private static void retriveAadharCard() {
		
		
	}

	private static void createAadharCard() {
		System.out.println("Enter aadhar information ");
		Scanner sc = new Scanner(System.in);
		Aadhar aadhar= new Aadhar();
		Address address= new Address();
		
		System.out.println("Enter the name ");
		aadhar.setName(sc.next());
		System.out.println("Enter the gender");
		aadhar.setGender(sc.next());
		System.out.println("enter the age");
		aadhar.setAge(sc.nextInt());
		System.out.println("***********");
		
		System.out.println("enter the door number");
		address.setDoornumber(sc.next());
		System.out.println("enter the street");
		address.setStreet(sc.next());
		System.out.println("enter the state");
		address.setState(sc.next());
		System.out.println("enter the country ");
		address.setCountry(sc.next());
		
		aadhar.setAddress(address);
		System.out.println("you entered the all details "+aadhar);
		
		
		
	}
	

}
