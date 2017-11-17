<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
<html>

<head>
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCSS" />

<spring:url value="/resources/js/jquery-3.2.1.slim.min.js"
	var="jqueryJS" />
<spring:url value="/resources/js/popper.min.js" var="popperJS" />
<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJS" />

<link rel="stylesheet" type="text/css" href="${bootstrapCSS}"
	integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb"
	crossorigin="anonymous">
</link>

<script type="application/x-javascript" src="${jqueryJS}"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>

<script type="application/x-javascript" src="${popperJS}"
	integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
	crossorigin="anonymous"></script>

<script type="application/x-javascript" src="${bootstrapJS}"
	integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ"
	crossorigin="anonymous">
</script>



<title>Home</title>
</head>
<body>
	<div class="jumbotron text-center">
		<h1>Hello world!</h1>
		<p>Resize this responsive page to see the effect!</p>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<h3>The time on the server is ${serverTime}.</h3>

			</div>
			<div class="col-sm-4">
				<h3>Column 2</h3>

			</div>
			<div class="col-sm-4">
				<h3>Column 3</h3>

			</div>
		</div>

	</div>
	<!-- div container -->

</body>
</html>
