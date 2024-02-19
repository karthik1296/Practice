package com.ecommerce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.exception.ProductNotFoundException;

@RestController
public class MainController 
{
    @RequestMapping(value ="/eproduct/{ID}")
     public String getProduct(@PathVariable("ID") String ID) {
           
                  if (ID.contentEquals("0"))
                          throw new ProductNotFoundException();
        return "Product was found";
     }
    
    @RequestMapping("/products")
    public String getProducts() {
    	return "products";
    }

}
