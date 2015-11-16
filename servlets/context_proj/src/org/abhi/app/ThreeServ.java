package org.abhi.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/ThreeServ")
public class ThreeServ extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*Fetch context parameters*/
		ServletContext ctx = getServletContext();
		String place = ctx.getInitParameter("pl");
		String email = ctx.getInitParameter("em");
		String name = ctx.getInitParameter("nm");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor='grey'>"
				+ "<h1> THREE </h1>"
				+ "<p>"
				+ place
				+ "<br>" + email
				+ "<br>" + name
				+ "<p>"
				+ "<a href='OneServ'>one</a>"
				+ "<p>"
				+ "<a href='TwoServ'>two</a>"
				+ "</body></html>");
		out.close();
	}

}
