<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
	<%! private int INIT_COUNT=0; %> <!-- Dichiarazione -->

	<% 
		String userName=request.getParameter("userName");
	
		if(userName!=null && userName.trim().compareTo("")==0)
		{
			userName=null;
		}
		
		int count=0;
		
		if(application.getAttribute("count")==null)
		{
			application.setAttribute("count", INIT_COUNT);
		}	
		
		if(userName!=null)
		{
			session.setAttribute("userName", userName);
			session.setAttribute("count", ++count);
			application.setAttribute("userName", userName);
			application.setAttribute("count", ++count);
		}else if(userName==null && session.getAttribute("userName")!=null)
		{
			count=(int)application.getAttribute("count");
			application.setAttribute("count", ++count);
		}
	
	%> <!-- Scriptlet -->

	<h1>JSP Scope</h1> <!-- Espressione -->
	<% if(session.getAttribute("userName")!=null) {%>
	<b>Client corrente: </b><%=session.getAttribute("userName") %>
	<br>
	<b>Numero di richieste: </b><%=session.getAttribute("count") %>
	<% } %>
	<br>
	<b>Ultimo client corrente: </b><%=application.getAttribute("userName") %>
	<br>
	<b>Totale di client che si sono connessi: </b><%=application.getAttribute("count") %>
</body>
</html>