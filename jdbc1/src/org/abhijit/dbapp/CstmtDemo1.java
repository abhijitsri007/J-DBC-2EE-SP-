package org.abhijit.dbapp;

import static org.abhijit.demoapp.AppConstants.*;
import java.sql.*;
import java.util.Scanner;

public class CstmtDemo1 {
	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cstmt = null;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter id");
		int id = scn.nextInt();
		scn.close();
		
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER_NAME, PASS);
			cstmt = con.prepareCall("{call jspiderstudents.getPerc(? , ?)}");
			cstmt.setInt(1, id);
			cstmt.registerOutParameter(2, Types.DECIMAL);
			cstmt.execute();
			double perc = cstmt.getDouble(2);
			System.out.println("Percentage is : " + perc);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			//close cstmt & con
		}
	}
}

