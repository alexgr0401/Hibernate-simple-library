<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="library.Book"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Books</title>
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
	<b>ALL BOOKS</b>
	<br>
	<br>
	<table class="Book">
		<thead>
			<tr>
				<th>ID</th>
				<th>ISBN</th>
				<th>Title</th>
				<th>Description</th>
				<th>Publisher ID</th>
				<th>Release Year</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${books}" var="book">
				<tr>
					<td>${book.getId()}</td>
					<td>${book.getIsbn()}</td>
					<td>${book.getTitle()}</td>
					<td>${book.getDescription()}</td>
					<td>${book.getPublisherId()}</td>
					<td>${book.getReleaseYear()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>