<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
	<body>
		<h1>Welcome To Form</h1>
	
		<form:form action="students" modelAttribute="map"
			method="GET">
	
			<input type="text" name="map['0'].name" value="abc">
	
			<input type="submit" />
		</form:form>
	</body>
</html>