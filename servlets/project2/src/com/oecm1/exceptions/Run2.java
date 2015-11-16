package com.oecm1.exceptions;

public class Run2 {
	static int a;
	public static void main(String[] args) {
		
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
		

	}
	static void m1()
	{
		System.out.println("m1 starts");
		try
		{
			m2();
		}
		
		
		catch(ArithmeticException e)
		{		
			System.out.println("m1 ends");
			
		}
	}
		
	static void m2()
	{
		System.out.println("m2starts");
		a=10/0;
		System.out.println("m2 ends");
	}
}
