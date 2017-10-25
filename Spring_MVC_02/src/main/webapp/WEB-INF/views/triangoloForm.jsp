<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Esempio di form spring</title>
</head>
<body>
	<h1>Esempio di form spring</h1>
	<h2>Compila i campi del form</h2>
	<form:form action="showTriangolo" method="GET"
		commandName="triangoloComm">
		<label>Type</label>
		<form:input path="type" />
		<label>Altezza</label>
		<form:input path="altezza" />
		<input type="submit" value="submit">
	</form:form>
</body>
</html>
