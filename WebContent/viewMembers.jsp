<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="library.Member"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Members</title>
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
	<b>ALL MEMBERS</b>
	<br>
	<br>
	<table class="Member">
		<thead>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Birth Date</th>
				<th>Address</th>
				<th>City</th>
				<th>Phone</th>
				<th>Department ID</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${members}" var="member">
				<tr>
					<td>${member.getId()}</td>
					<td>${member.getFirstName()}</td>
					<td>${member.getLastName()}</td>
					<td>${member.getBirthDate()}</td>
					<td>${member.getAddress()}</td>
					<td>${member.getCity()}</td>
					<td>${member.getPhone()}</td>
					<td>${member.getDepartmentId()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>