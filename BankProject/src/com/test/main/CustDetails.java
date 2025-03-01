package com.test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.test.model.AccountDetails;
import com.test.model.AddressDetails;
import com.test.model.CustomerDetails;

public class CustDetails {
	public List details() {
		ArrayList<AccountDetails> ar = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean status;
		
		do {

			CustomerDetails customerDetails = new CustomerDetails();
			System.out.println("Enter Customer Name:");
			String name = sc.next();
			customerDetails.setName(name);
			System.out.println("Enter Fathers Name:");
			String fatherName = sc.next();
			customerDetails.setFatherName(fatherName);
			System.out.println("Enter Aadhar Number :");
			long aadhar = sc.nextLong();
			customerDetails.setAadharNumber(aadhar);
			System.out.println("Enter phone number : ");
			long phone = sc.nextLong();
			customerDetails.setPhoneNumber(phone);
			System.out.println("Enter pan number :");
			String pan = sc.next();
			customerDetails.setPanNumber(pan);

			AddressDetails addressDetails = new AddressDetails();
			System.out.println("Enter a door number :");
			String doorno = sc.next();
			addressDetails.setDoorNumber(doorno);
			System.out.println("Enter a village : ");
			String village = sc.next();
			addressDetails.setVillageName(village);
			System.out.println("Enter a district :");
			String dist = sc.next();
			addressDetails.setDistrict(dist);
			System.out.println("Enter a state :");
			String state = sc.next();
			addressDetails.setDistrict(state);
			System.out.println("Enter pincode :");
			String pincode = sc.next();
			addressDetails.setPincode(pincode);
			customerDetails.setAddressdetails(addressDetails);

			AccountDetails accountdetails = new AccountDetails();
			System.out.println("Enter Account number :");
			long accountnumber = sc.nextLong();
			accountdetails.setAccountNumber(accountnumber);
			System.out.println("Enter IFSC Code :");
			String ifsc = sc.next();
			accountdetails.setIfscCode(ifsc);

			System.out.println("Enter pin :");
			int pin = sc.nextInt();
			accountdetails.setPin(pin);
			accountdetails.setCustomerdetails(customerDetails);
			ar.add(accountdetails);
			System.out.println("Customer Details :" + ar);
			System.out.println("Enter 1 to add costomer details or enter 2 to exit the program");
			status =false;
			int number=sc.nextInt();
			if(number==1) {
				status=true;
			}
			
		} while (status);
		return ar;

	}

}
