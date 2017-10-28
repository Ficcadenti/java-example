<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCSS" />
<spring:url value="/resources/js/jquery-3.2.1.slim.min.js"
	var="jqueryJS" />
<spring:url value="/resources/js/popper.min.js" var="popperJS" />
<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJS" />



<link rel="stylesheet" href="${bootstrapCSS}"
	integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb"
	crossorigin="anonymous">
</link>

<script rel="stylesheet" href="${jqueryJS}"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>

<script rel="stylesheet" href="${popperJS}"
	integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
	crossorigin="anonymous"></script>

<script rel="stylesheet" href="${bootstrapJS}"
	integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ"
	crossorigin="anonymous">
	
</script>
<title>Esempio di form spring</title>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>Spring_MVC_02 - Esempio di form spring</h1>
		<h2>Compila i campi del form</h2>
	</div>

	<div class="container">
		<form:form action="showTriangolo" method="GET"
			commandName="triangoloComm">
			<div class="form-group">
				<label for="type">Type:&nbsp;</label>
				<form:input path="type" class="form-control" placeholder="type" id="type" />
			</div>
			<div class="form-group">
				<label for="altezza">Altezza:&nbsp;</label>
				<form:input path="altezza" class="form-control" placeholder="type"
					id="altezza" />
			</div>
			<button type="submit" class="btn btn-primary" data-toggle="tooltip" data-placement="top" title="Press button" >&nbsp;Submit</button>
		</form:form>
	</div>
</body>
</html>
