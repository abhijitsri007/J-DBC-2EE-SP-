package org.abhi.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.runtime.regexp.joni.Config;

@WebServlet("/sc")
public class SearchController extends HttpServlet {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

@Override
public void init(ServletConfig config) throws ServletException {
	super.init(config);
	String qry="select * from jspiderstudents.student where id=?";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=password");
		pstmt=con.prepareStatement(qry);
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		RequestDispatcher rd=null;
		try {
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			
			if(rs.next())
			{
				/*fetching the related data from db*/
				String name=rs.getString("name");
				String Stream=rs.getString("st");
				double percentage=rs.getDouble("perc");
				
				/* Data population*/
				Student st=new Student();
				st.setId(id);
				st.setName(name);
				st.setPerc(percentage);
				st.setStream(Stream);
			
				/*pass all the student data to result.jsp*/
			request.setAttribute("stk", st);
				
			/*chain to result.jsp*/
				rd=request.getRequestDispatcher("result.jsp");
				
				}
			else
			{
				
				/*No data*/
				request.setAttribute("nd","no data found");
				rd=request.getRequestDispatcher("search.jsp");
				
			}
			rd.forward(request,response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
@Override
	public void destroy() {
	try {
		if (rs != null) {
			rs.close();
		}
		if (pstmt != null) {
			pstmt.close();
		}
		if (con != null) {
			con.close();
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
