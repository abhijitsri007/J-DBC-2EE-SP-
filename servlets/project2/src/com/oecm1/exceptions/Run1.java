package com.oecm1.exceptions;

public class Run1 {

	public static void main(String[] args) {
		int a=4;
		int b=0;
		int c;
		try
		{
			c=a/b;	
		}
		catch(Exception e)
		{
			System.out.println(e);
			c=a/2;
			System.out.println(c);
			
			
		}
	}

}
