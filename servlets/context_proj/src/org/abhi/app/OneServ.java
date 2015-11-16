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

import jdk.nashorn.internal.runtime.regexp.joni.Config;


//@WebServlet("/OneServ")
//no annotation bcz its confgrd in web.xml
public class OneServ extends GenericServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		String state=config.getInitParameter("st");
		System.out.println("OneServ.init() ---->"+ state);
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//ServletConfig conf=getServletConfig();
		PrintWriter out=response.getWriter();
		
		ServletContext ctx=getServletContext();
		String place=ctx.getInitParameter("pl");
		String email=ctx.getInitParameter("em");
		String name=ctx.getInitParameter("nm");
		
		Student s=new Student();
		s.id=12;s.name="raju";
		ctx.setAttribute("stu", s);
		
		String[] frtArr={"mango","orange","grapes"};
		ctx.setAttribute("arr", frtArr);
		out.println("<html><body bgcolor='yellow'>"
				+ "<h1>ONE</h1>"
				+ "<p>"
				+ place
				+ "<br>"+email
				+ "<br>"+name
				+"</p>"				
				+ "<a href='TwoServ'>two</a>"
				+ "</body></html>");
				out.close();
	}

}
