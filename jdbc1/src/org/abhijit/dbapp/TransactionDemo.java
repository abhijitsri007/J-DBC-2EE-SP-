package org.abhijit.dbapp;
import static org.abhijit.demoapp.AppConstants.*;
import java.sql.*;
import java.util.Scanner;

public class TransactionDemo {
	public static void main(String[] args) {
		System.out.println("App START");
		
		Connection con = null;
		PreparedStatement pstmtEdu = null;
		PreparedStatement pstmtPer = null;
		String inQrPer = "insert into jspiderstudents.personal_details values( ? , ? , ?)";
		String inQryEdu = "insert into jspiderstudents.education_details values (? , ? , ?)";

		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter id");
		int id = scan.nextInt();
		
		System.out.println("enter name");
		String name = scan.next();
		
		System.out.println("enter stream");
		String stream = scan.next();
		
		System.out.println("enter place");
		String place = scan.next();
		
		System.out.println("enter percentage");
		double perc = scan.nextDouble();
		
		scan.close();
		
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER_NAME, PASS);
			
			//start transaction
			con.setAutoCommit(false);
			
			pstmtEdu = con.prepareStatement(inQryEdu);
			pstmtEdu.setInt(1, id);
			pstmtEdu.setString(2, stream);
			pstmtEdu.setDouble(3, perc);
			pstmtEdu.executeUpdate();//Operation 1
			
			
			pstmtPer = con.prepareStatement(inQrPer);
			pstmtPer.setInt(1, id);
			pstmtPer.setString(2, name);
			pstmtPer.setString(3, place);
			pstmtPer.executeUpdate();//Operation 2
			
			//end transaction
			con.commit();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Exception - so revertig");
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		System.out.println("App END");
	}
}
