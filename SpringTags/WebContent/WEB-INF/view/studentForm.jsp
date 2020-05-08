<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<style>
	
		.error{
			color: red;
		}
	</style>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="processStudentForm" modelAttribute="student">
		Name: <form:input  path="name"/>
		<form:errors path="name" cssClass="error"></form:errors>
		<br>
		
		Gender: <form:input  path="gender"/>
		<form:errors path="gender" cssClass="error"></form:errors>
		<br>
		
		<form:input  path="age"/>
		<form:errors path="age" cssClass="error"></form:errors>
		<input type="submit" />
	</form:form>
</body>
</html>