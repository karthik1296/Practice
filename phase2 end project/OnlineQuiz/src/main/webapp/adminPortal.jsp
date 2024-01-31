<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  td,th {
    padding: 8px 7rem;
    text-align:center
  }
</style>

</head>
<body>
<div align="center">
		<h1 align="center">Welcome admin</h1>
		<div align="right">
		<form action="">
			<input type="submit" value="log out" name="signout">
		</form>
		</div>
		<hr>
	<%
		if(request.getParameter("signout")!=null){
			response.sendRedirect("Index.jsp");
		}
	%>
		<h1>Admin dashboard</h1><br>
		<table border="0" align="center">
			<tr><th>Manage User</th><th>Quiz Manager</th><th>Question Manager</th></tr>
			<tr><td><a href="addUser.jsp">add new user</a></td><td><a href="CreateQuiz.jsp">Create New Quiz</a></td><td><a href="BeforeAddNewQuestion.jsp">Add New Question(s)</a></td></tr>
			<tr><td><a href="userList.jsp">List of users</a></td><td><a href="quizList.jsp">Quiz List</a></td><td><a href="BeforeQuesList.jsp">Question List</a></td></tr>
		</table>
	</div>

</body>
</html>