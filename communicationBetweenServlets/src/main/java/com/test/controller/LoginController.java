package com.test.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HttpServletRequest :"+request);
		System.out.println("HttpServletResponse :"+response);
		System.out.println("HI NAresh");
		String username=request.getParameter("username");
		System.out.println(username);
		if(username.length()>4) {
			RequestDispatcher rd=request.getRequestDispatcher("welcome");
			rd.forward(request, response);
		}
	}

}
