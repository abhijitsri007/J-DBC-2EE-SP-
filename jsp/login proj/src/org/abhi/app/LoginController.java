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
import javax.servlet.http.HttpSession;

@WebServlet("/lc")
public class LoginController extends HttpServlet{

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		String qry = "select name from  jspiderstudents.user1 where uid=? and pass=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=password");
			pstmt = con.prepareStatement(qry);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = req.getParameter("un");
		String pwd = req.getParameter("pwd");
		RequestDispatcher rd = null;
		
		try {
			pstmt.setString(1, user);
			pstmt.setString(2, pwd);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String fullName = rs.getString("name");
				HttpSession session = req.getSession(true);
				session.setAttribute("fn", fullName);
				
				rd = req.getRequestDispatcher("home.jsp");
			} else {
				req.setAttribute("error", "Invalid User");
				rd = req.getRequestDispatcher("login.jsp");
			}
			rd.forward(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
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
