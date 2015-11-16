package org.abhijit.dbapp;
import static org.abhijit.demoapp.AppConstants.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;

public class BatchUpdateDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		
		String delQry1="delete from jspiderstudents.student where perc < 60";	
		String delQry2="delete from jspiderstudents.student where id=154";
		String updQry="update jspiderstudents.student set st='ISE' where st='ECE'";
		String insrtQry="insert into jspiderstudents.student values (13,'Debashis','MECH',65.90)";
		
		try 
		{
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER_NAME, PASS);
			stmt=con.createStatement();
			
			stmt.addBatch(delQry1);
			stmt.addBatch(delQry2);
			stmt.addBatch(updQry);
			stmt.addBatch(insrtQry);
			
			/* Execute the batch */
			int[] arr=stmt.executeBatch();
			
			for (int i : arr) {
				System.out.println(i +"--");
			}
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
			
		finally
		{
			try
			{
								
				if(stmt!=null)
				{
				stmt.close();
				}
				if(con!=null)
				{
					con.close();
				}
			}
			catch(SQLException sqle)
			{
				sqle.printStackTrace();
			}
		}
	}

}
