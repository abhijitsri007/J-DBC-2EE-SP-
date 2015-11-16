package org.abhi.lifeapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lpc")
public class LifePurposeController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int age=Integer.parseInt(request.getParameter("ag"));
		String message=null;
		
		if(age<22)
		{
				message="Concentrate on studies";
		}
		else if(age>22 && age <30)
		{
			message="Get Marry soon";
		}
		else if (age>30 && age>50) {
			message="take care of family";
		}
		else if (age>50) {
			message="settle in himalaya";
		}
		request.setAttribute("msg", message);
		
		/*chain to display servlet*/
		RequestDispatcher rd = request.getRequestDispatcher("dc");
		rd.forward(request, response);
	}

}
