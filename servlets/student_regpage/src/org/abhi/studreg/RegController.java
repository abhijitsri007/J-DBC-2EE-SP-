package org.abhi.studreg;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
@WebServlet("/RegController")
public class RegController extends GenericServlet 
{
	Connection con;
	PreparedStatement pstmt;
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		/*fetch ui/form data*/
		String name=request.getParameter("nm");
		int id=Integer.parseInt(request.getParameter("id"));
		String stream=request.getParameter("st");
		double perc=Double.parseDouble(request.getParameter("per"));

		/*set the ui data to PH*/
		try 
		{
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, stream);
			pstmt.setDouble(4, perc);
			
			/*execute query*/
			pstmt.executeUpdate();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		/*display msg*/
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor='yellow'>"
				+"<h1>"
				+"Registered succesfully..." +name
				+"<br>"
				+"<a href='register.html'>back</a>"
				+"</h1>"
				+ "</body></html>");
		out.close();

		
	}
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		super.init(config);
		// initialize con & pstmt
		String inQry="insert into jspiderstudents.student values(?,?,?,?)";

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "password");
			
			pstmt = con.prepareStatement(inQry);
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() 
	{
		//close  pstmt,con 
		try 
		{
			if(pstmt!=null)
			{
				pstmt.close();
			} 
			if(con!=null)
			{
				con.close();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}



