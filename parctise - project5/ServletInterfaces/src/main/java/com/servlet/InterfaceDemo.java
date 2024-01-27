package com.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class InterfaceDemo
 */
public class InterfaceDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config;

    /**
     * Default constructor. 
     */
    public InterfaceDemo() {
        // TODO Auto-generated constructor stub
    }
   

    

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter pwriter=response.getWriter();
        /*pwriter.print("hii");
        pwriter.print("<h2>welcome</h2>");
        pwriter.print("In the service() method<br>");
        pwriter.print("<h2>end</h2>");
        pwriter.print("close");*/
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("In the service() method<br>");
        pwriter.print("</body>");
        pwriter.print("</html>");
        

    }
    public void destroy(){
        System.out.println("In destroy() method");
    }
    public ServletConfig getServletConfig(){
        return config;
    }
    public String getServletInfo(){
        return "This is a sample servlet info";
    }

	}



