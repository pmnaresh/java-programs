package com.test.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.test.model.Aadhar;

public class AadharRepository {

	public void saveAadharToDB(Aadhar aadhar) {

		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			Statement stmt = con.createStatement();
			String Query = "insert into AADHARDB values('" + aadhar.getFirstName() + "'" +","+ "'" + aadhar.getLastName()
					+ "'" +","+ "'" + aadhar.getGender() + "'"+"," + "'" + aadhar.getAge() + "'" +","+ "'"
					+ aadhar.getMaritalStatus() + "'" +","+ "'" + aadhar.getMobileNumber() + "'"+"," + "'"
					+ aadhar.getVillageName() + "'"+"," + "'" + aadhar.getDistrict() + "'" +","+ "'" + aadhar.getState() + "'"
					+","+ "'" + aadhar.getCountry() + "'"+")";
			stmt.execute(Query);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
