package org.abhijit.dbapp;

import java.sql.*;
import java.util.Scanner;
import static org.abhijit.demoapp.AppConstants.*;

public class CstmtDemo2 {
	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;

		Scanner scn = new Scanner(System.in);
		System.out.println("enter stream");
		String stream = scn.next();
		scn.close();
		boolean isDataPresent = false;

		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER_NAME, PASS);
			cstmt = con.prepareCall
					("{call jspiderstudents.getStudentsByStream(?)}");
			cstmt.setString(1, stream);
			rs =  cstmt.executeQuery(); 

			while (rs.next()) {
				isDataPresent = true;
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double perc = rs.getDouble("perc");
				
				System.out.println(id + "       " + name + "       " + perc);
			}
			if (!isDataPresent) {
				System.out.println("No data found");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			//close rs , cstmt & con
		}
	}
}

