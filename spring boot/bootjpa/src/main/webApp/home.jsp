<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data JPA & H2 Database</title>
</head>
<body>
	<h2>Spring boot Data JPA and H2 database</h2>
	<form action="addAlien">
		<input type="text" name="aid" placeholder="Enter your id">Id<br>
		<input type = "text" name="aname" placeholder="Enter your name">Name<br>
		<input type= "text" name="Tech" placeholder="Enter your Technology">Technology<br>

		<input type="Submit"><br>
	</form>
	
	<form action="getAlien">
		<input type="text" name="aid" placeholder="Enter your id">Id<br>
		<input type="Submit"><br>
	</form>
</body>
</html>