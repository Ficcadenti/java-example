<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP - Esempio </title>
</head>
<body>
	<h1>Presentazione dati</h1>
	
	Login: <% String fLogin = request.getParameter("user"); out.print(fLogin); %>
	<br>
	Password: <% String fPass = request.getParameter("pass"); out.print(fPass); %>
	
</body>
</html>