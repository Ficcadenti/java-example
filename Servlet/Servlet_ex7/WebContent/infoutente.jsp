<!DOCTYPE html>
<html>
<head>
<title>Data e ora</title>
</head>
<jsp:useBean id="infoUtente" scope="session" class="com.raffo.servlet.InfoUtente" />
<body style="font-size: 16pt;">
	<%@ page errorPage = "pageError.jsp" %>
	
	<jsp:setProperty name="infoUtente" property="nome" value="Raffaele Ficcadenti"/>
	<jsp:setProperty name="infoUtente" property="email" value="raffaele.ficcadenti@gmail.it"/>

	<b>nome:</b> <jsp:getProperty name="infoUtente" property="nome" /><br> 
	<b>e-mail:</b> <jsp:getProperty name="infoUtente" property="email" />
</body>
</html>