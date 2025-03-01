package com.test.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.test.connection.ConnectionUtility;
import com.test.model.FaceBook;

public class FaceBookRepository {

	public void saveDataToDB(FaceBook fb) {
		try {
			Connection con=ConnectionUtility.getConnection();
			Statement stmt = con.createStatement();
			String Query = "insert into FACEBOOKDB values('"+fb.getFirstName() +"'"+","+ "'" + fb.getLastName()+"'"+","+"'"+fb.getGender()+"'"+","+
			"'"+fb.getPassword()+"'"+")";
			stmt.execute(Query);
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
