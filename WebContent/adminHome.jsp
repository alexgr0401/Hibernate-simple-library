<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin home page</title>
</head>
<body>
	<form action="ViewLibrarians" method="get">
		<input type="submit" value="View Librarians"> &nbsp;&nbsp;<br>  
	</form>
	<form action="AddLibrarian" method="get">
		<input type="submit" value="Add Librarian"> &nbsp;&nbsp;<br><br>   			
	</form>
	<form action="Logout" method="get">
		<input type="submit" value="Logout">
	</form>
</body>
</html>