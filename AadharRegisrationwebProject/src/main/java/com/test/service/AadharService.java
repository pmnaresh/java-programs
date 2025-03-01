package com.test.service;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.test.model.Aadhar;
import com.test.repository.AadharRepository;

public class AadharService {
	
	
		
	
	public void aadharRegistration(Aadhar aadhar) {
		AadharRepository ar= new AadharRepository();
		ar.saveAadharToDB(aadhar);
		
		
	}

	
		
	}
	


