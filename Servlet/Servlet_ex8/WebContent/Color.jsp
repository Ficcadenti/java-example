<html>
<head>
<title>PersonalData</title>
</head>
<body>
	<jsp:useBean id="beanArray" class="com.raffo.servlet.myArray" />
	<jsp:setProperty name="beanArray" property="items" param="colors" />

	Questi sono i tuoi colori preferiti:
	<br>
	<b> <jsp:getProperty name="beanArray" property="formattedItems" />
	</b>

	<jsp:include page="hello.jsp" flush="true">
		<jsp:param name="user_name" value="Raffaele Ficcadenti" />
	</jsp:include>
	
</body>
</html>