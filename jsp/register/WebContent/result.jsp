
<%@page import="org.abhi.app.Student"%>
<html>
	<head>
		<title>Result</title>
	</head>
	<body bgcolor="yellow">
		<%
			Student st=(Student)request.getAttribute("stk");
		%>
		
		<h1><u> Student data</u></h1><br>
		Name : <%=st.getName()%><br>
		ID : <%=st.getId()%><br>
		Stream :<%=st.getStream()%><br>
		Percentage: <%=st.getPerc() %>
		<p></p>
		<a href="search.jsp">Search Again</a>
		</body>
</html>