package com.hibernate;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.Product;
import com.hibernate.HibernateUtil;




/**
 * Servlet implementation class ListProduct
 */
public class ListProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            
            Session session = factory.openSession();
            PrintWriter out = response.getWriter();
            out.print("hii");
            // using HQL
            List<Product> list = session.createQuery("from product").list();
            
            session.close();
            
             
             out.println("<html><body>");
             out.println("<b>Product Listing</b><br>");
             for(Product p: list) {
                     out.println("ID: " + Integer.valueOf(p.getId()) + ", Name: " + String.valueOf(p.getName() )+", Product Type: " + String.valueOf(p.getType()) + 
                                     ", Price: " + Double.valueOf(p.getPrice())  + "<br>");
             }
             
         out.println("</body></html>");
         
         
     } catch (Exception ex) {
    	 ex.printStackTrace();
     }

	}

}
