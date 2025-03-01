package com.test.connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public  class ConnectionUtility {
	public static Connection getConnection() {
		Connection con = null;
		try {
			
			File file = new File("C:\\properties\\dbproperties.properties");
			FileInputStream fis = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fis);
			Class.forName(properties.getProperty("oracle.driver"));
			con = DriverManager.getConnection(properties.getProperty("oracle.url"),properties.getProperty("oracle.username"),properties.getProperty("oracle.password"));//"jdbc:oracle:thin:@localhost:1521:xe", "system", "system"
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

}
