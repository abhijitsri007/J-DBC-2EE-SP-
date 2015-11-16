package org.oejm1.dbapp;

import java.util.Scanner;

public class EmployeeTestCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ID:");
		int id=scan.nextInt();
		System.out.println("Enter Name:");
		String name=scan.next();
		System.out.println("Enter Dept:");
		String dept=scan.next();
		System.out.println("Enter Sal:");
		double sal=scan.nextDouble();
		scan.close();
		
		EmployeeDTO dto=new EmployeeDTO();
		/*data population*/
		dto.setEid(id);
		dto.setDept(dept);
		dto.setName(name);
		dto.setSal(sal);
		EmployeeDAO edao=new EmployeeDAO();
		edao.addEmployee(dto);
	}

}
