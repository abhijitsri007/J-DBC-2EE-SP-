package com.oecm1.exceptions;

import java.util.Scanner;

public class Run5 
{

	public static void main(String[] args) 
	{
		Account a1=new Account(3000);
		
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the amount:");
		double amt=scn.nextDouble();
		scn.close();
		try
		{
			a1.withdraw(amt);
			System.out.println("amount withdraw succesful");
		}
		catch(InsufficientFundException e)
		{
			System.out.println(e.getMessage());
			System.out.println("u have less balance");
		}
	}
}
	 class Account
	{
		private double bal;
		public Account(double bal)
		{
			this.bal=bal;
		}
	
	void withdraw(double amt)throws InsufficientFundException
	{
		if (bal>=amt)
		{
			bal=amt;
			
		}
		else
		{
			throw new InsufficientFundException();
		}
	}
	
}
class InsufficientFundException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg="less balance";
	public String getMsg()
	{
		return msg;
	}
	public String toString()
	{
		return "insufficientFundException:"+msg;
	}
}
