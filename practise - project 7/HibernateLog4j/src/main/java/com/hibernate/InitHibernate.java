package com.hibernate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;


/**
 * Servlet implementation class InitHibernate
 */
public class InitHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public InitHibernate() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try {
	            // Initialize Hibernate
			 response.getWriter().println("Hii");
			 
			 SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	            System.out.println("Hibernate initialized successfully.");

	            // Perform any Hibernate-related operations here

	            // Close Hibernate
	            sessionFactory.close();
	            System.out.println("Hibernate closed successfully.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
