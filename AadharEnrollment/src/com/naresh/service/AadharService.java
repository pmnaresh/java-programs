package com.naresh.service;

import com.naresh.model.Aadhar;
import com.naresh.store.AadharStore;

public class AadharService {
	public void createAadharService(Aadhar aadhar){
		AadharStore  store = new AadharStore();
		String gender=aadhar.getgender();
		if(gender.equalsIgnoreCase("male")) {
			aadhar.setfName("mr."+aadhar.getfName());
		}
		else {
			aadhar.setfName("miss "+aadhar.getfName() );
			
		}
		store.saveAadharStore(aadhar);
	}
	public void retriveAadharService() {
		
	}
	public void updateAadharService() {
		
	}
	public void deleteAadharService() {
		
	}
	

}
