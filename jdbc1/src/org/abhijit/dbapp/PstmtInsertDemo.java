package org.abhijit.dbapp;

import java.sql.*;
import static org.abhijit.demoapp.AppConstants.*;

public class PstmtInsertDemo {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "insert into jspiderstudents.student values(? , ? , ? , ?)";

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER_NAME, PASS);
			pstmt = con.prepareStatement(qry);

			pstmt.setDouble(4, 66.8);
			pstmt.setString(2, "Guldu");;
			pstmt.setString(3, "CSE");
			pstmt.setInt(1, 9);
			pstmt.executeUpdate();

			pstmt.setDouble(4, 77.9);
			pstmt.setString(2, "Guldi");;
			pstmt.setString(3, "ECE");
			pstmt.setInt(1, 10);
			pstmt.executeUpdate();

			pstmt.setDouble(4, 30.8);
			pstmt.setString(2, "Rajesh");;
			pstmt.setString(3, "ISE");
			pstmt.setInt(1, 11);
			pstmt.executeUpdate();
			
			System.out.println("App END");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			//close pstmt , con 
		}
	}
}
