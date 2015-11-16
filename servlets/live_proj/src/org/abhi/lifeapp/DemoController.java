package org.abhi.lifeapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/dc" ,loadOnStartup=2,name="demo",
initParams={
@WebInitParam(name="nm",value="abhi"),
@WebInitParam(name="pl",value="bnglr")
})
public class DemoController extends GenericServlet {

    public DemoController() {
        //super();
        // TODO Auto-generated constructor stub
    	System.out.println("-------------DemoController.constructor()------------");
  
    }

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("------------DemoConroller.service()--------------");
		PrintWriter out=response.getWriter();
		out.println("<html><body>"
				+"welcome<a href='index.html'>click</a>"
				+ "</body></html>");
		out.close();
	}
@Override
public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	super.init(config);
	String name=config.getInitParameter("nm");
	String place = config.getInitParameter("pl");
	
	System.out.println("--------------DemoController.init()--------------");

}
@Override
public void destroy() {
	// TODO Auto-generated method stub
	super.destroy();
	System.out.println("----------DemoController.destroy()-------------");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
