<%@ taglib uri="/mytag" prefix="mb"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
<title>PersonalData</title>
<link rel="stylesheet" type="text/css" href="css/myStile.css">
</head>
<body>
	<jsp:useBean id="beanPerson" class="com.raffo.servlet.Person" />
	<jsp:setProperty name="beanPerson" property="*" />

	<p>Questi sono i tuoi dati personali:</p>

	<table style="font-weight: bold;">
		<tr>
			<td>Nome:</td>
			<td>${fn:toUpperCase(param.firstName)}</td>
		</tr>
		<tr>
			<td>Cognome:</td>
			<td><jsp:getProperty name="beanPerson" property="lastName" /></td>
		</tr>
		<tr>
			<td>Telefono:</td>
			<td><jsp:getProperty name="beanPerson" property="telephone" /></td>
		</tr>
		<tr>
			<td>E-mail:</td>
			<td><jsp:getProperty name="beanPerson" property="email" /></td>
		</tr>
	</table>
	<hr/>
	<mb:hello nome="test" className="stile1"></mb:hello>
    <hr/>
    <mb:hello className="stile2"></mb:hello>
</body>
</html>