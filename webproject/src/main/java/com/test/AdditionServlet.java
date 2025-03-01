package com.test;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class AdditionServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("iam in Destroy method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("i am in servetconfig Method ");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("iam in get servlet info method");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("i am in init method ");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("i am in service method ");
		
	}

}
