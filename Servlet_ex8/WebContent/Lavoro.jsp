<html>
<head>
<title>PersonalData</title>
</head>
<body>
	
	<%
		String job = request.getParameter("gender1");
		String nextPage = null;
		if (job.equals("lavoratore"))
		{
			nextPage = "Worker.jsp";
		}
		else if (job.equals("studente"))
		{
			nextPage = "Student.jsp";
		}
		else if (job.equals("disoccupato"))
		{
			nextPage = "Unemployed.jsp";
		}
	%>
	<br>
	
	<jsp:include page="<%= nextPage %>" flush="true">
		<jsp:param name="job" value="<%= job %>" />
	</jsp:include>
	
</body>
</html>