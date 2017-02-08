<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>JSP esempio</title>
</head>
<%@ page import="java.util.*, java.text.*"%>
<%!
	private String DateFormat = "EEEE d MMMM yyyy";
	private DateFormat dateFormat = new SimpleDateFormat(DateFormat);
	private DateFormat timeFormat = new SimpleDateFormat("H:mm:ss");
%>
<% Date dateTime = new Date(); %>
<body style = "font-size: 16pt;">
Oggi &egrave; <%= dateFormat.format(dateTime) %><br>
e sono le ore <%= timeFormat.format(dateTime) %>

	
</body>
</html>