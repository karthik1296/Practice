package com.connector;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector 
{
	public static final String DRIVER_NAME="com.mysql.jdbc.Driver";
	public static final String URL_NAME="jdbc:mysql://localhost:3306/DB1";
	public static final String USER_NAME="root";
	public static final String PASS_WORD="Karthik@11";

public static Connection getConn() throws ClassNotFoundException, SQLException
{
	Class.forName(DRIVER_NAME);
	Connection cn= DriverManager.getConnection(URL_NAME,USER_NAME,PASS_WORD);
	return cn;
}

public void load(InputStream in) {
	// TODO Auto-generated method stub
	
}

public void closeConnection() {
	// TODO Auto-generated method stub
	
}
}
