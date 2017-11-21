<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
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
		<form:form action="showTriangolo" method="GET" commandName="triangoloComm">
			<form:errors path="*" cssClass="alert alert-warning alert-dismissible fade show" role="alert" element="div"/>
			<div class="form-group">
				<label for="type">Type:&nbsp;</label>
				<form:input path="type" class="form-control" placeholder="type" id="type" />
				<form:errors path="type" cssClass="error"></form:errors>
			</div>
			<div class="form-group">
				<label for="altezza">Altezza:&nbsp;</label>
				<form:input path="altezza" class="form-control" placeholder="type"
					id="altezza" />
				<form:errors path="altezza" cssClass="error"></form:errors>
			</div>
			<button type="submit" class="btn btn-primary" data-toggle="tooltip" data-placement="top" title="Press button" >&nbsp;Submit</button>
		</form:form>  <!-- form -->
	</div> <!-- container -->
</body>
</html>
