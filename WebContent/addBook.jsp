<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add book page</title>
</head>
<body>
	<form action="AddBook" method="post">
		<b>ADD BOOK</b><br> <br> <label><b>ISBN </b></label> <input
			type="text" name="isbn" placeholder="Enter the ISBN number" required><br>
		<br> <label><b>Title</b></label> <input type="text" name="title"
			placeholder="Enter Title name" required><br> <br> 
		<label><b>Description</b></label> <input type="text" name="description"
			placeholder="Enter Description text" required><br> <br>
		<label><b>Author </b></label> <input type="text" name="first_name"
			placeholder="First name" required>&nbsp;			
			<input type="text" name="last_name" placeholder="Last name" required> <br> <br>		
		<label><b>Publisher </b></label> 			
		<input type="text" name="publisher_name" placeholder="Publisher name" required>&nbsp;	
			<input type="text" name="city" placeholder="Publisher city" required> <br> <br>
		<label><b>Release year </b></label> <input type="text"
			name="release_year" placeholder="Enter Release year"><br> <br> 
		<label><b>Genre</b></label> <input type="text" name="genre_name" placeholder="Genre name"><br><br>
		<label><b>Department</b></label> <input type="text"
			name="department_name" placeholder="Department name"><br> <br>		
		<label><b>Quantity</b></label> <input type="text"
			name="quantity" placeholder="Enter Quantity" required><br> <br> 
			<input type="submit" value="Add">
	</form>
</body>
</html>