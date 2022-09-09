<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add librarian page</title>
</head>
<body>
	<form action="AddLibrarian?add=true" method="post">
		<b>ADD LIBRARIAN</b><br>
		<br> <label><b>First Name </b></label> <input type="text" 
		    name="first_name" placeholder="Enter First name" required><br>
		<br> <label><b>Last Name</b></label> <input type="text" 
		    name="last_name" placeholder="Enter Last name" required><br>
		<br> <label><b>Department ID </b></label> <input type="text"
			name="department_id" placeholder="Enter Librarian ID" required><br>
		<br> <label><b>Username </b></label> <input type="text"
			name="username" placeholder="Enter Username" required><br>
		<br> <label><b>Password </b></label> <input type="text"
			name="password" placeholder="Enter Password" required><br>
		<br> <input type="submit" value="Add">

	</form>
</body>
</html>