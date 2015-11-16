package org.abhijit.dbapp;

import java.sql.*;
import static org.abhijit.demoapp.AppConstants.*;	

public class MySqlConDemo {

	public static void main(String[] args) {
		//final String URL="jdbc:mysql://localhost:3306?user=root&password=password";
		Connection con;
		
		try
		{
			Class.forName(DRIVER);
			System.out.println("loaded & registerd success");
			con=DriverManager.getConnection(URL,USER_NAME,PASS);
			System.out.println("Connection Success");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("Failed to load & register the Driver");
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connection Failed");
		}
		

	}

}
