package com.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Applicant
 */
public class Applicant extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletConfig config = getServletConfig();
		String email = config.getInitParameter("Email");
		ServletContext context = getServletContext();
		String website = context.getInitParameter("Website-name");
		PrintWriter out = response.getWriter();
		out.println("<center><h1>" + website + "</h1></center><br><p>Contact us:" + email);
	}
}
