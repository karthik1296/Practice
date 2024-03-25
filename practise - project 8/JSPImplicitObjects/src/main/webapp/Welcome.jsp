<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
out.print("Welcome "+request.getParameter("uname"));  
  
String driver=config.getInitParameter("dname");  
out.println("driver name is="+driver);  
session.setAttribute("user","name");  
String name=(String)session.getAttribute("user");  
out.println("Hello "+name);  
%>
</body>
</html>