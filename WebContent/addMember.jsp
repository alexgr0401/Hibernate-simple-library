<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add member page</title>
</head>
<body>
	<form action="AddMember" method="post">
		<b>ADD MEMBER</b><br>
		<br> <label><b>First Name </b></label> <input type="text" 
		    name="firstName" placeholder="Enter First name" required><br>
		<br> <label><b>Last Name</b></label> <input type="text" 
		    name="lastName" placeholder="Enter Last name" required><br>
		<br> <label><b>Birth Date </b></label> <input type="text"
			name="birthDate" placeholder="Enter Birth date"><br>
		<br> <label><b>Address </b></label> <input type="text"
			name="address" placeholder="Enter Address" required><br>
		<br> <label><b>City </b></label> <input type="text"
			name="city" placeholder="Enter City" required><br>
		<br> <label><b>Phone</b></label> <input type="text"
			name="phone" placeholder="Enter Phone" required><br>
		<br> <label><b>Department ID</b></label> <input type="text"
			name="department" placeholder="Enter Department ID" required><br>
		<br> <input type="submit" value="Add">

	</form>
</body>
</html>