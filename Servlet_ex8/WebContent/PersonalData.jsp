<html>
<head>
<title>PersonalData</title>
</head>
<body>
	<jsp:useBean id="beanPerson" class="com.raffo.servlet.Person" />
	<jsp:setProperty name="beanPerson" property="*" />

	<p>Questi sono i tuoi dati personali:</p>

	<table style="font-weight: bold;">
		<tr>
			<td>Nome:</td>
			<td><jsp:getProperty name="beanPerson" property="firstName" /></td>
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
	
</body>
</html>