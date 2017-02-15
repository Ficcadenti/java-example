<%@ taglib uri="/mytag" prefix="mb"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>Custom Tag: esempio 1</title>
    <link rel="stylesheet" type="text/css" href="css/myStile.css">
</head>
<body>
    <mb:hello nome="test" className="stile1"/>
    <hr/>
    <mb:hello className="stile2"/>
    
    <c:set var="string1" value="This is first String."/>
    <c:out value="${fn:toUpperCase(string1)}" />
</body>
</html> 