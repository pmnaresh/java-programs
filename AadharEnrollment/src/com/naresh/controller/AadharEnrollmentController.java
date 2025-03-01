package com.naresh.controller;

import java.util.Scanner;

import com.naresh.model.Aadhar;
import com.naresh.model.Address;
import com.naresh.service.AadharService;

public class AadharEnrollmentController {
	static AadharService service = new AadharService();
	

	public static void main(String[] args) {
		System.out.println("Available Aadhar operations ");
		System.out.println("1.create aadhar card ");
		System.out.println("2.retrive aadhar card ");
		System.out.println("3.update aadhar card ");
		System.out.println("4.delete aadhar card ");
		
		System.out.println("choose any one operation above ");
		Scanner sc=new Scanner(System.in);
		int choice =sc.nextInt();
		switch(choice) {
		case 1 :System.out.println("you choice is to create aadhar card");
		createAadharCard();
		break;
		case 2 : System.out.println("your choice is to retrive aadhar card");
		retriveAadharCard();
		break;
		case 3 : System.out.println("your choice is to update aadhar card ");
		updateAadharCard();
		break;
		case 4 :System.out.println("Your choice is to delete aadhar card ");
		deleteAadharCard();
		break;
		
		default:System.out.println("you choice is not available ");
		
		break;
		
		}

	}
	public static void createAadharCard() {
		System.out.println("Enter Aadhar Information ");
		
		Scanner sc = new Scanner(System.in);
		Aadhar aadhar = new Aadhar();
		Address address = new Address();
		
		System.out.println("Enter the first Name ");
		aadhar.setfName(sc.next());
		System.out.println("Enter the last name ");
		aadhar.setlName(sc.next());
		System.out.println("Enter the gender");
		aadhar.setgender(sc.next());
		System.out.println("Enter the age ");
		aadhar.setAge(sc.nextInt());
		System.out.println("Enter the contact number");
		aadhar.setContactNumber(sc.nextLong());
		
		System.out.println("*****************************");
		System.out.println("Enter the address details below ");
		
		System.out.println("Enter the door number ");
		address.setDoorNumber(sc.next());
		System.out.println("Enter the street ");
		address.setStreet(sc.next());
		System.out.println("Enter the District ");
		address.setDistrict(sc.next());
		System.out.println("Enter the state ");
		address.setState(sc.next());
		System.out.println("Enter pincode ");
		address.setPin(sc.nextInt());
		System.out.println("Enter the country ");
		address.setCountry(sc.next());
		aadhar.setAddress(address);
		System.out.println("All entered details of  aadhar  " + aadhar);
		
	}
	private static void retriveAadharCard() {
		// TODO Auto-generated method stub
		
	}
	private static void updateAadharCard() {
		// TODO Auto-generated method stub
		
	}
	private static void deleteAadharCard() {
		// TODO Auto-generated method stub
		
	}
	


}
