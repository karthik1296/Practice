package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class LoginCookies
 */
public class LoginCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginCookies() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String users[][] = {{"Karthik", "123456"},{"Bhavi", "123456"}, {"Krishna", "123456"}}; 
		
		String uname = request.getParameter("txtUser");
		String pwd = request.getParameter("txtPass");
		boolean b = false;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(uname.equals(users[i][0])  &&  pwd.equals(users[i][1]))
				{
					Cookie ck = new Cookie("user", uname);
					ck.setMaxAge(10000);
					response.addCookie(ck);
					
					response.sendRedirect("WelcomeCoockies");
					
					b=true;
					break;
					
				}
			}
		}
		
		
	}
	}


