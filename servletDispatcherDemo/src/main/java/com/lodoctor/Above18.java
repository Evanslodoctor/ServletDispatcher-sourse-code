package com.lodoctor;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class Above18 extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("Text/html");
		response.getWriter().append("<html><body style='background-color: red; color: white; text-align: center; padding :200px'><h1>you are above 18</h1></body></html>");
	}


}
