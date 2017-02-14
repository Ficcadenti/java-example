<!DOCTYPE html>
<html>
<head>
<title>Gestione contatti</title>
</head>
<jsp:useBean id="contatto" scope="session" class="com.raffo.servlet.bean_contatto" />
<body style="font-size: 16pt;">
	<%--@ page errorPage = "pageError.jsp" --%>
	
	<!--  Commentare la riga successiva per simulare l'errore -->
	<jsp:setProperty name="contatto" property="cognome" value="Ficcadenti"/>
	<jsp:setProperty name="contatto" property="email" value="raffaele.ficcadenti@gmail.it"/>
	<jsp:setProperty name="contatto" property="cellulare" value="(+39)340-4020010"/>

	<b>Nome1:</b> <jsp:getProperty name="contatto" property="nome" /><br> 
	<b>Cognome:</b> <jsp:getProperty name="contatto" property="cognome" /><br> 
	<b>Cellulare:</b> <jsp:getProperty name="contatto" property="cellulare" /><br> 
	<b>e-mail:</b> <jsp:getProperty name="contatto" property="email" />
</body>
</html>