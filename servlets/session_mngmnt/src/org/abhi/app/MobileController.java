package org.abhi.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


@WebServlet("/mc")
public class MobileController extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String model=request.getParameter("mm");
		String quantity=request.getParameter("qty");
		
		HttpSession session=request.getSession(true);
		session.setMaxInactiveInterval(10*60);//10 min
		
		session.setAttribute("mdl", model);
		session.setAttribute("qty", quantity);
		
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor='cyan'>"
				+ "<form method='post' action='cc'>"
				+ "Cover color: <input type='text' name='fc'>"
				+ "<br>"
				+ "<input type='submit' value='send'>"
				+ "</form>"
				+ "</body></html>");
		out.close();
	}

}
