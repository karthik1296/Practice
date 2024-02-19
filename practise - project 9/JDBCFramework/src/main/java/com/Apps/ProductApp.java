package com.Apps;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.product.Product;
import com.service.ProductService;

public class ProductApp {

	public static void main(String[] args) {
ApplicationContext fact = new ClassPathXmlApplicationContext("dbconfig.xml");
		
		//CricketServiceImpl cr = (CricketServiceImpl)fact.getBean("dbConObj");
		ProductService ps = (ProductService)fact.getBean("dbConObj");
		
		Scanner sc = new Scanner(System.in);
		Product pd = new Product();
		
		System.out.println("Id ");
		pd.setId(sc.nextInt());
		
		System.out.println("Product Name ");
		pd.setName(sc.next());
		
		System.out.println(" Type");
		pd.setType(sc.next());
		
		System.out.println("Price ");
		pd.setPrice(sc.nextInt());
		
		String r = ps.AddProduct(pd);
		
		if(r.equals("Success"))
			System.out.println("Product is added...");
		else
			System.out.println("Error");
	}
	

}
