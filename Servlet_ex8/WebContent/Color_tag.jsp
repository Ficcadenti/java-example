<%@ taglib uri = "http://www.mokabyte.it/examples/jsp/taglib" prefix = "mb" %>
<html>
<head>
<title>Colors</title>
</head>
<body>
<jsp:useBean id = "bean" class = "com.raffo.servlet.myArray" />
<jsp:setProperty name = "bean" property = "items" param = "colors" />
<p>Questi sono i tuoi colori preferiti:</p>
<mb:iterate beanName = "bean" property = "items">
<mb:getItemNumber/>.&nbsp;<b><mb:getValue/></b><br>
</mb:iterate>
</body>
</html>