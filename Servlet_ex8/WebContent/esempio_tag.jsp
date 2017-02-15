<%@ taglib uri="/mytag" prefix="mb"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>Custom Tag: esempio 1</title>
    	
		<link rel="stylesheet" type="text/css" href="css/myStile.css">
		<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css">		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
		<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="http://code.jquery.com/jquery-2.1.0.js"></script>
</head>
<body>
    <mb:hello nome="test" className="stile1"></mb:hello>
    <hr/>
    <mb:hello className="stile2"></mb:hello>
    <hr/>
    <mb:hello_body className="stile1">SELECT first_name,last_name,username from tab_01 where id>10</mb:hello_body>
    <br/>
	<br/>
	<br/>
    <b>JSTL core/function</b><br>
    <c:set var="string1" value="This is first String."/>
    <c:out value="${fn:toUpperCase(string1)}" />
</body>
</html> 