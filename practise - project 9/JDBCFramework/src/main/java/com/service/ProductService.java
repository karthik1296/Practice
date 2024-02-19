package com.service;

import java.util.List;

import com.product.Product;

public interface ProductService 
{
	public String AddProduct(Product pd);
	public List<Product>  ShowAll();

}
