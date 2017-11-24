<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Triangolo</title>
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCSS" />
<spring:url value="/resources/css/custom.css" var="customCSS" />
<spring:url value="/resources/css/custom_fonts.css" var="googleFontCSS" />
<spring:url value="/resources/js/jquery-3.2.1.slim.min.js"
	var="jqueryJS" />
<spring:url value="/resources/js/popper.min.js" var="popperJS" />
<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJS" />

<link rel="stylesheet" type="text/css" href="${bootstrapCSS}"></link>
<link rel="stylesheet" type="text/css" href="${customCSS}"></link>
<link rel="stylesheet" type="text/css" href="${googleFontCSS}">
<script type="application/x-javascript" src="${jqueryJS}"></script>
<script type="application/x-javascript" src="${popperJS}"></script>
<script type="application/x-javascript" src="${bootstrapJS}"></script>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>Hello world!</h1>
		<p>Test Spring MVC!!!!!</p>
	</div>

	<div class="container">
		<h1>Il file "${name}" è stato caricato correttamente. !!!! </h1>
		
	</div> <!-- container -->
</body>
</html>
