package org.abhi.lifeapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dc")
public class DisplayController extends HttpServlet {


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String message=(String)request.getAttribute("msg");
  	   	 String name=request.getParameter("nm");
  	   	 
  	   PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor='grey'>"
				+ "Welcome " + name
				+ "<br>"
				+ "Purpose : " + message
				+ "<body></html>");
		out.close();
	}

}
