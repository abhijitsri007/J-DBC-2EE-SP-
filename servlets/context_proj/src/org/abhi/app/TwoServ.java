package org.abhi.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class TwoServ
 */
@WebServlet("/TwoServ")
public class TwoServ extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out=response.getWriter();
		
		ServletContext ctx=getServletContext();
		String place=ctx.getInitParameter("pl");
		String email=ctx.getInitParameter("em");
		String name=ctx.getInitParameter("nm");
		
		/*fetch attribute*/
		Student stnt=(Student)ctx.getAttribute("stu");
		System.out.println(stnt.name+"runs");
		stnt.sleep();
		String[] fruitArr=(String[])ctx.getAttribute("arr");
		
		out.println("<html><body bgcolor='cyan'>"
				+ "<h1> TWO </h1>"
				+ "<p>"
				+ place
				+ "<br>" + email
				+ "<br>" + name
				+ "<p>"
				+ "<a href='OneServ'>one</a>"
				+ "<p>"
				+ "<a href='ThreeServ'>three</a>"
				+ "</body></html>");
				out.close();
	}
	

}
