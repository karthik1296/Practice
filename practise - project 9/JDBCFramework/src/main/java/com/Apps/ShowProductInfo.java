package com.Apps;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.product.Product;
import com.service.ProductService;

public class ShowProductInfo {

	public static void main(String[] args)
	{
		ApplicationContext fact = new ClassPathXmlApplicationContext("dbconfig.xml");
		
		
		ProductService ps = (ProductService)fact.getBean("dbConObj");
		
		List<Product> pdlist = ps.ShowAll();
		
		for(Product c : pdlist)
			System.out.println(c.getId() + "\t" + c.getName() + "\t" + c.getType() + "\t" + c.getPrice());
		
	}

	

}
