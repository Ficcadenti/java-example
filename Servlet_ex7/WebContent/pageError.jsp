<html>
<body>
<%@ page isErrorPage = "true" %>
<div class="message">
	<h1>Errore</h1>
	<p>Siamo spiacenti, si è verificato un errore durante l'esecuzione:</p>
	
	<% 
		String result = exception.toString() + "\r\n";
	    StackTraceElement[] trace = exception.getStackTrace();
	    for (int i=0;i<trace.length;i++) 
	    {
	        result += trace[i].toString() + "\r\n";
	    }
	%>
	
	<p><em><%= exception %></em></p>
	<%
		out.write("<!--\n");
		out.write(result);
		out.write("-->");
	%>
</div>
</body>
</html>