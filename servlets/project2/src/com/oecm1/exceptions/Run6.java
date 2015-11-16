package com.oecm1.exceptions;

public class Run6 {
		static int a;
	public static void main(String[] args) {
		System.out.println("main starts");
		
		try{
			a=10/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch Executes");
		}
		
		finally
		{
			System.out.println("finally executes");
		}
		System.out.println("main ends");
		

	}

}
