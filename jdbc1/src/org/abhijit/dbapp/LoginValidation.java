package org.abhijit.dbapp;

import java.sql.*;
import java.util.Scanner;

public class LoginValidation {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user name");
		String un = scan.next();
		System.out.println("Enter Password");
		String pwd = scan.next();
		scan.close();
		
		String loginQry = "select uname from jspiderstudents.user "
				+ " where uname= '"+un+"'  and pass= '"+pwd+"'";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "password");
			stmt = con.createStatement();
			rs = stmt.executeQuery(loginQry);
			
			if (rs.next()) {
				String actName = rs.getString("uname");
				System.out.println("Welcome " + actName);
			} else {
				System.out.println("Invalid user");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			//close rs, stmt & con
		}
	}
}