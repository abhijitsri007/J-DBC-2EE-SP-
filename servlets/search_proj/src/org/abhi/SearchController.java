package org.abhi;

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

import com.mysql.jdbc.Driver;

@WebServlet("/SearchController")
public class SearchController extends GenericServlet {

	private Connection con=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//fetch ui elements
		int id=Integer.parseInt(request.getParameter("id"));
		String outPut = null;
		try {
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				/* data is present */
				outPut = "<html><body>"
						+ "<font color='green' size='5'>"
					    + id
						+ "<br>" + rs.getString(2)
						+ "<br>" + rs.getString("st")
						+ "<br>" + rs.getDouble("perc")
						+ "</font>"
						+ "</body></html>";
			} else {
				/* data is NOT present */
				outPut = "<html><body>"
						+ "<font color='red' size='5'>No data found </font>"
						+ "<p>"
						+ "search <a href='search.html'>again</a>"
						+ "</body></html>";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		PrintWriter out = response.getWriter();
		out.println(outPut);
		out.close();
	}
@Override
public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	super.init(config);
	String query="select * from jspiderstudents.student where id=?";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","password");
		
		pstmt=con.prepareStatement(query);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
@Override
public void destroy() {
	// TODO Auto-generated method stub
	super.destroy();
	try {
		/*close rs , con & pstmt*/
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

