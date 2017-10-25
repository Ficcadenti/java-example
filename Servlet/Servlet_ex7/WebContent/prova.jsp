<!DOCTYPE html>
<html>
<head>
<title>Data e ora</title>
</head>
<jsp:useBean id="beanDateTime" scope="page" class="com.raffo.servlet.DateTime" />
<body style="font-size: 16pt;">
	Oggi è
	<jsp:getProperty name="beanDateTime" property="date" /><br> 
	e sono le ore
	<jsp:getProperty name="beanDateTime" property="time" />
</body>
</html>