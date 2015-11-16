package org.abhijit.dbapp;

import static org.abhijit.demoapp.AppConstants.*;
import java.sql.*;

public class CstmtDemo {

	public static void main(String[] args) {
		 Connection con=null;
		 Statement stmt = null;
		
		
		try
		{
			Class.forName(DRIVER);
			con=DriverManager.getConnection(URL,USER_NAME,PASS);
			stmt=con.createStatement();
			int novi=stmt.executeUpdate("insert into jspiderstudents.student values(2,'Amit','CSE',75.6)");
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
			
		}
		finally{
			//close rs, stmt & con
		}

	}

}
