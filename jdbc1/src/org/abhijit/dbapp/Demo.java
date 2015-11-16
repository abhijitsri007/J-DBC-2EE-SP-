package org.abhijit.dbapp;

import java.sql.*;
import static org.abhijit.demoapp.AppConstants.*;
public class Demo {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String insertQry = "insert into jspiderstudents.student values (12 , 'Surendra' , 'ECE' , 65)";
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER_NAME, PASS);
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(insertQry);
			pstmt.executeUpdate(); 
			con.commit();
			System.out.println("Executed");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
