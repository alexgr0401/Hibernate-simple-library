<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="library.Librarian"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Librarians</title>
</head>

<head>
<style>
table {
	border-collapse: collapse;
}

th, td {
	border: 1px solid black;
	padding: 10px;
	text-align: left;
}
</style>
</head>
<body>
	<b>ALL LIBRARIANS</b>
	<br>
	<br>
	<table class="Libarian">
		<thead>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Department ID</th>
				<th>Username</th>
				<th>Password</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${librarians}" var="librarian">
				<tr>
					<td>${librarian.getId()}</td>
					<td>${librarian.getFirstName()}</td>
					<td>${librarian.getLastName()}</td>
					<td>${librarian.getDepartmentId()}</td>
					<td>${librarian.getUsername()}</td>
					<td>${librarian.getPassword()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>