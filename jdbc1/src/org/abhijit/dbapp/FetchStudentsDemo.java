package org.abhijit.dbapp;

	import java.sql.*;
	import java.util.Scanner;
	import static org.abhijit.demoapp.AppConstants.*;

	public class FetchStudentsDemo {
		public static void main(String[] args) {
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			boolean isDataPresent = false;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter stream");
			String stream = scan.next();
			scan.close();
			
			String selQry = "select * from jspiderstudents.student "
					+ "where st='"+stream+"'";
			try {
				Class.forName(DRIVER);
				con = DriverManager.getConnection(URL , USER_NAME , PASS);
				stmt = con.createStatement();
				rs = stmt.executeQuery(selQry);
				
				while (rs.next()) {
					isDataPresent = true; 
					
					int id = rs.getInt("id");
					String name =rs.getString(2);
					double per = rs.getDouble("perc");
					System.out.println(id + "          "+ name + "       " + per);
				}
				if (!isDataPresent) {
					System.out.println("No data found");
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}finally{
				//close rs, stmt & con
			}
		}
	}

