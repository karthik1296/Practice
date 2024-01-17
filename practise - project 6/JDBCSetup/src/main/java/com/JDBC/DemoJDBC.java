package com.JDBC;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.connector.DbConnector;

/**
 * Servlet implementation class DemoJDBC
 */
public class DemoJDBC extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DemoJDBC() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
		
      
		
		
         InputStream in = getServletContext().getResourceAsStream("/java/DbConnector");
        DbConnector props = new DbConnector();
        props.load(in);
         
        DbConnector conn = new DbConnector();
         out.println("DB Connection initialized.<br>");
         
         conn.closeConnection();
         out.println("DB Connection closed.<br>");
         
         
         out.println("</body></html>");
         conn.closeConnection();
	}
         
	
 



	}


