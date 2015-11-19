<html>
	<head>
		<title>HOME</title>
	</head>
	<%-- <%@include file="login.jsp" %>
	<jsp:include page="login.jsp"></jsp:include> --%>
	
	<body>
	<a href="loc">Log-Out</a>
	<%
	 String name = (String) session.getAttribute("fn");
	%>
		<h1>
		 Welcome <%= name %>
		</h1>
	</body>
	<%-- <%@include file="footer.html" %>--%>
</html>