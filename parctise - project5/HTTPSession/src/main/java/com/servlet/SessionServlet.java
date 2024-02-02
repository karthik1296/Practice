package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SessionServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String users[][] = {{"Karthik", "123@56"},{"Bhavi", "1234@6"}, {"Krishna", "12@456"}}; 
		
		String uname = request.getParameter("txtUser");
		String pwd = request.getParameter("txtPass");
		boolean b = false;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(uname.equals(users[i][0])  &&  pwd.equals(users[i][1]))
				{
					HttpSession  session = request.getSession();
					session.setAttribute("user", uname);
					session.setMaxInactiveInterval(60000);
					response.sendRedirect("Welcome");
					
					b=true;
					break;
					
				}
			}
		}
		
		if(b==false)
			response.sendRedirect("ErrorPage.html");
				
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
