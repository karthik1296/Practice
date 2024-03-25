package com.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.product.Product;


public class ProductServiceImpl implements ProductService
{
	private DataSource ds;  // it holds connection info of db.
	private JdbcTemplate jt;
	
	public DataSource getDs() {
		return ds;
	}
	
	public void setDs(DataSource ds) {
		this.ds = ds;
		System.out.println("DS Setter");
		jt = new JdbcTemplate(this.getDs());
	}

	@Override
	public String AddProduct(Product pd) {
		String res="Err";
		String qry = "Insert into Product(id,name,type,price) values(?,?,?,?)";
		int n = jt.update(qry, new Object[] {pd.getId(), pd.getName(),pd.getType(),pd.getPrice()});
		if(n>=1)
			res ="Success";
		return res;
	}

	@Override
	public List<Product> ShowAll() {

		String qry = "Select * from Product";
		List<Product> lstpd = jt.query(qry, new BeanPropertyRowMapper(Product.class));
		return lstpd;
	}
	
	


}
