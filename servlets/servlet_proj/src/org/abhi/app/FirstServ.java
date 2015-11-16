package org.abhi.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class FirstServ
 */
@WebServlet("/FirstServ")
public class FirstServ extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public FirstServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String htmlOutPut="<html><body>"
				+"<font color='blue' size='6'>hello Guldu...</font>"
				+"</body></html>";
				
				PrintWriter out=response.getWriter();
				out.println(htmlOutPut);
				out.close();
	}

}
