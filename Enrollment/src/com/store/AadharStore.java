package com.store;

import java.util.ArrayList;

import com.test.Aadhar;

public class AadharStore {
	ArrayList<Aadhar> aadharlist=new ArrayList<Aadhar>();
	
	public void saveAadharStore(Aadhar aadhar ) {
		aadharlist.add(aadhar);
		
	}
	

}
