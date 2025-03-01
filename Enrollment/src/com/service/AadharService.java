package com.service;

import com.test.Aadhar;

public class AadharService {
	public void CreateAadharService(Aadhar aadhar) {
	
	String gender = aadhar.getGender();
	if (gender.equalsIgnoreCase("Male")) {
		aadhar.setName("Mr."+aadhar.getName());
		
	}
	else {
		aadhar.setName("miss"+aadhar.getName());
	}
	}
	public void UpdateAadharService( ) {
		
	}
	public void retriveAadharService() {
		
	}
	public void deleteAadharService() {
		
	}
	
}
