<html>
	<head>
		<title>Search</title>
	</head>
	<body bgcolor="pink">
		<form action="sc" method="post">
			<pre>
				ID: <input type="text" name="id" required>
				<input type="submit" value="Get-Details">
			</pre>
		</form>
		<%
		String msg=(String)request.getAttribute("nd");
		%>
		<%
			if(msg!=null)
			{%>
				<font color="red" size=4>no data found</font>
			<% }
			%>
			
	</body>
</html>