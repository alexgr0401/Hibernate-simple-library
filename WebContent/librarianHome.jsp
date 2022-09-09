<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Librarian home</title>
</head>
<body>
	<form action="ViewMembers" method="get">
		<input type="submit" value="View Members"> &nbsp;&nbsp;<br>
	</form>
	<form action="ViewBooks" method="get">
		<input type="submit" value="View Books"> &nbsp;&nbsp;<br>
	</form>
	<form action="SearchBook" method="get">
		<input type="submit" value="Search Book"> &nbsp;&nbsp;<br>
	</form>
	<form action="AddMember" method="post">
		<input type="submit" value="Add Member"> &nbsp;&nbsp;<br>		
	</form>
	<form action="addBook.jsp" method="post">
		<input type="submit" value="Add Book"> &nbsp;&nbsp;<br><br>		
	</form>
	<form action="Logout" method="get">
		<input type="submit" value="Logout">
	</form>
</body>
</html>