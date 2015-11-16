	
<html>
	<head>
		<title>test</title>
	</head>
	<body bgcolor="cyan">
		<% String name="Dhoni";%>
		<%
			if(name.equals("Dhoni"))
			{
				for(int i=0;i<5;i++)
				{%>
					<font color="blue"><%=name %></font><br>
		<% }
			}
			else
			{
				for(int i=0;i<10;i++)
				{%>
					<font color="red"><%=name %></font><br>
			<% }
			}%>
	</body>
</html>