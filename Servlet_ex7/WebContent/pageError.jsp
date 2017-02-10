<html>
<body>
<%@ page isErrorPage = "true" %>
<div class="message">
	<i>Siamo spiacenti, si è verificato un errore durante l'esecuzione:</i><br><br>
	
	<% 
		String result = exception.toString() + "\r\n"+"<br>";
	    StackTraceElement[] trace = exception.getStackTrace();
	    for (int i=0;i<trace.length;i++) 
	    {
	        result += trace[i].toString() + "\n"+"<br>";
	    }
	%>
	
	<%= result %>
</div>
</body>
</html>