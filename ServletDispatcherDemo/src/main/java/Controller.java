
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet({ "/ServletDispatcherDemo", "/Controller" })
public class Controller extends HttpServlet 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("Text/html");
		String select=request.getParameter("selectOption");
		HttpSession session=request.getSession();
		session.setAttribute("userName", select);
		
		response.getWriter().append("<html><body'></body></html>");
		if(select.equals("Above18"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Above18");  
	        rd.forward(request, response); 
	    }	 
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp?msg=below18");
			rd.include(request,response);
		}
		
	}


	

}

