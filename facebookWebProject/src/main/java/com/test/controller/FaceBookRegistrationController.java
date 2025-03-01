package com.test.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.model.FaceBook;
import com.test.service.FaceBookService;

/**
 * Servlet implementation class FaceBookRegistrationController
 */
@WebServlet("/faceBook")
public class FaceBookRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FaceBookRegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		FaceBook fb=new FaceBook();
		fb.setFirstName(request.getParameter("firstName"));
		fb.setLastName(request.getParameter("lastName"));
		fb.setGender(request.getParameter("gender"));
		fb.setPassword(request.getParameter("password"));
		FaceBookService fbs=new FaceBookService();
		fbs.faceBookRegistation(fb);
		
	}

}
