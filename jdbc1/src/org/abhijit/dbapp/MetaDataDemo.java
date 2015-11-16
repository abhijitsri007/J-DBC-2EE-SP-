package org.abhijit.dbapp;

import static org.abhijit.demoapp.AppConstants.*;

import java.sql.*;
public class MetaDataDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String query="select * from jspiderstudents.student";
		
		try
		{
			Class.forName(DRIVER);
			
			con=DriverManager.getConnection(URL,USER_NAME,PASS);
			DatabaseMetaData dbMeta=con.getMetaData();
			System.out.println(dbMeta.getDatabaseProductName());
			System.out.println(dbMeta.getDriverName());
			
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			ResultSetMetaData rsMeta=rs.getMetaData();
			System.out.println(rsMeta.getColumnCount());
			System.out.println(rsMeta.getColumnName(3));
			
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt!=null)
			{
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
