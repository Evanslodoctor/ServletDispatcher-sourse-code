package com.lodoctor;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class Controller extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("Text/html");
		String select=request.getParameter("selectOption");
		response.getWriter().append("<html><body style='background-color: red;'></body></html>");
		if(select.equals("Bellow"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Under18Page");
			rd.forward(request,response);
		}
		if(select.equals("Older"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Above18");
			rd.include(request,response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("htmlPage.html");
			rd.forward(request,response);
		}
		
	}

	

}
