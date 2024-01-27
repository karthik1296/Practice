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
        if (session.getAttribute("name") == null) {
                response.sendRedirect("Index.jsp?error=1");
        }
%>
<b>Hello <%= session.getAttribute("name") %></b><br>
<a href="Logout.jsp">Click here to logout</a>

</body>
</html>