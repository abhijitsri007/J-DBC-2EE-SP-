<HTML>
	<HEAD>
		<TITLE> LogIn </TITLE>
	</HEAD>
	<BODY bgcolor="#FFFF33">
		<FORM METHOD=POST ACTION="lc">
			<pre>
				User Name : <INPUT TYPE="text" NAME="un" required>
				Password  : <INPUT TYPE="password" NAME="pwd" required>
							<INPUT TYPE="submit" value="Log-In">
				<%
				String msg = (String) request.getAttribute("error");
				
				if(msg != null){
				%>							
				<font color="red" size="4">Invalid User</font>
				<% } %>
			</pre>
		</FORM>
	</BODY>
</HTML>