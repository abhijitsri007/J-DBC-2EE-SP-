package org.abhi.dbapp;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class mySqlConDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String URL="jdbc:mysql://localhost:3306";
		final String Driver="com.mysql.jdbc.Driver";
		Properties prop=new Properties();
		FileReader reader=null;
		
		
		try {
			reader=new FileReader("config/mysqldbconfig.properties");
			prop.load(reader);
			Driver d=new com.mysql.jdbc.Driver();
			Connection con=d.connect(URL, prop);
			System.out.println("Connection Success"+con);
			
			

} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(reader!=null)
			{
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
