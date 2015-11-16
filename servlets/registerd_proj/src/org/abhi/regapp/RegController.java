package org.abhi.regapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class RegController
 */
@WebServlet("/RegController")
public class RegController extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public RegController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("nm");
		/*String age=request.getParameter("ag");
		int actAge=Integer.parseInt(age);*/
		
		int age=Integer.parseInt(request.getParameter("ag"));
		String place=request.getParameter("pl");
		
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor='yellow'>"
				+"<h1>"
				+"welcome..."+name
				+"<br>"
				+"<a href='register.html'>back</a>"
				+"</h1>"
				+"</html></body>");
		out.close();
	}

}
