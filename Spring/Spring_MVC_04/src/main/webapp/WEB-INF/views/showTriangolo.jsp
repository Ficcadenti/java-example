<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Triangolo</title>
</head>
<body>
	<h1>Show Triangolo</h1>
	<h1>Triangolo</h1>
	<label>Type</label>
	<c:out value="${type}" />
	<label>Altezza</label>
	<c:out value="${altezza}" />
</body>
</html>
