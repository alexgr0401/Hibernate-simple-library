<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book search page</title>
</head>
<body>
	<form action="SearchBook" method="post">
		<b>BOOK SEARCH</b><br>
		<br> <label><b>Keywords</b></label> <input type="text" name="keywords"
			placeholder="Enter keywords" required><br>
		<br> <label><b>Title</b></label> <input type="text" name="title"
			placeholder="Enter Title name" required><br>
		<br> <label><b>Author </b></label> <input type="text"
			name="author" placeholder="Enter Author name" required><br>
		<br> <label><b>Publisher </b></label> <input type="text"
			name="publisher" placeholder="Enter Publisher name" required><br>
		<br> <input type="submit" value="Search">

	</form>
</body>
</html>