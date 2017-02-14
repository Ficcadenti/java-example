<html>
	<head>
		<title>PersonalData</title>
	</head>
	<body>
		<jsp:useBean id = "beanPerson" class="com.raffo.servlet.Person" />
		<jsp:useBean id = "beanArray" class = "com.raffo.servlet.myArray" />
		<jsp:setProperty name = "beanPerson" property="*" />
		<jsp:setProperty name = "beanArray" property = "items" param = "colors" />
		
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
		
		Questi sono i tuoi colori preferiti:<br>
		<b>
			<jsp:getProperty name = "beanArray" property = "formattedItems" />
		</b>
		
		<jsp:include page = "hello.jsp" flush = "true">
			<jsp:param name = "user_name" value = "Raffaele Ficcadenti"/>
		</jsp:include>

	</body>
</html>