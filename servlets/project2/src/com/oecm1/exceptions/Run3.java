package com.oecm1.exceptions;

public class Run3 {

	public static void main(String[] args)  {
		try
		{
			display();
		}
		catch(InterruptedException e)
		{
			System.out.println();
		}

	}
	static void display() throws InterruptedException
	{
		System.out.println("a");
		Thread.sleep(2000);
		System.out.println("b");
	}

}
