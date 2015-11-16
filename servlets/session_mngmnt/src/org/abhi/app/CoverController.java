package org.abhi.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/cc")
public class CoverController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*get an existing session */
		HttpSession session=request.getSession(false);
		String model=(String)session.getAttribute("mdl");
		String quantity=(String)session.getAttribute("qty");
		
		String flipCoverClr=request.getParameter("fc");
		
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor='yellow'>"
				+ "<h1>"
				+ model
				+ "<br>"+ quantity 
				+ "<br>" + flipCoverClr
				+ "<p>"
				+ "<a href='fc'>finish</a>"
				+ "</h1>"
				+ "</body></html>");
		out.close();
				
	}

}
