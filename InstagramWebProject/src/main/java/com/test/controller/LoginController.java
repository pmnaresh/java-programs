package com.test.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName =request.getParameter("uname");
		String password= request.getParameter("pass");
		String receivedpassword = null;
		PrintWriter pr = response.getWriter();
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","system");
			Statement stmt =con.createStatement();
			String Query="select password from LOGIN where username = "+ "'"+ userName +"'";
			ResultSet rs =stmt.executeQuery(Query);
			while(rs.next()) {
				 receivedpassword=rs.getString(1);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(password.equals(receivedpassword)) {
			pr.write("login is Successful into instagram....!");
		}
		else {
			pr.write("login is failure ,please enter your correct password");
		}
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
	}

}
