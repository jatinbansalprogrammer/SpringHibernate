<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  
<!DOCTYPE html>
<html>

<head>
<style type="text/css">
	.error{color:red}
</style>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>

	<form:form action="ProcessEmployee" modelAttribute="employee">
	
	employee Name <form:input path="empName"/>
				  <form:errors path="empName" cssClass="error"></form:errors>
	employee Age  <form:input path="empAge"/>
				  <form:errors path="empAge" cssClass="error"></form:errors>
	<br><br>
	<input type="submit"/>
	</form:form>


</body>

</html>