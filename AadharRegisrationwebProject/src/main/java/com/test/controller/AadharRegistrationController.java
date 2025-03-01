package com.test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.model.Aadhar;
import com.test.service.AadharService;

/**
 * Servlet implementation class AadharRegistrationController
 */
@WebServlet("/aadhar")
public class AadharRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int age;
       
   
    public AadharRegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Aadhar aadhar  = new Aadhar();
		aadhar.setFirstName(request.getParameter("firstName"));
		aadhar.setLastName(request.getParameter("lastName"));
		aadhar.setGender(request.getParameter("gender"));
		aadhar.setAge(request.getParameter("age"));
		aadhar.setMaritalStatus(request.getParameter("maritalStatus"));
		aadhar.setMobileNumber(request.getParameter("mobileNumber"));
		aadhar.setVillageName(request.getParameter("villageName"));
		aadhar.setDistrict(request.getParameter("district"));
		aadhar.setState(request.getParameter("state"));
		aadhar.setCountry(request.getParameter("country"));
		AadharService as= new AadharService();
		as.aadharRegistration(aadhar );
	}


	

}
