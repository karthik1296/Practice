package com.ecommerce.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.beans.Quote;





@RestController
public class MainController 
{
  
    	 @RequestMapping("/products")
    	    public String getProducts() {
    	    	return "products";
    	 }
    	         @RequestMapping("/")
    	          @ResponseBody
    	          public String index() {
    	                 
    	             RestTemplate restTemplate = new RestTemplate();
    	             Quote quote = restTemplate.getForObject("https://type.fit/api/quotes", Quote.class);
    	                
    	            return quote.toString();

      
    }
     


}
