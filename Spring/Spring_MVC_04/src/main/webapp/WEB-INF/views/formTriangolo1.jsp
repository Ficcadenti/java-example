<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
<style>
.error {
	color: #ff0000;
}

.errorblock{
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding:8px;
	margin:16px;
}
</style>
</head>
<body>

	<form:form action="showTriangolo1" method="POST"
		commandName="triangoloComm">
		<form:errors path="*" cssClass="errorblock" element="div"/>
		
		<div>
			<label>Type: ${triangoloComm.type} = </label>
			<form:input path="type" />
			<form:errors path="type"></form:errors>
		</div>
		<div>
			<label>Altezza ${triangoloComm.altezza} = </label>
			<form:input path="altezza" />
			<form:errors path="altezza" cssClass="error"></form:errors>
		</div>
		<input type="submit" value="Salva" />
	</form:form>
	<!-- form -->
</body>
</html>
