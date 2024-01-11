package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        
	        request.getRequestDispatcher("LoginPage.html").include(request, response);
	        out.println();
	        String name=request.getParameter("name");  
	        String password=request.getParameter("password");  
	          
	        if((name.equals("Karthik"))&&(password.equals("admin123"))){  
	        out.print("Welcome, "+name);  
	        HttpSession session=request.getSession();  
	        session.setAttribute("name",name);  
	       
	        String htmlRespone = "<html>";
            htmlRespone += "<input a href=\"LogoutServlet\" type=\"submit\" value=\"logout\">";     
            htmlRespone += "</html>";
            out.println(htmlRespone);
            out.println("<h1><a href='LogoutServlet'>logout</a>");
            request.getRequestDispatcher("Link.html").include(request, response);  
	        }  
	        else{  
	            out.print("Sorry, username or password error!");  
	             
	        }  
	        out.close();  
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
