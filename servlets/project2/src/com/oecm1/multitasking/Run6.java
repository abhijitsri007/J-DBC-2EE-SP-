package com.oecm1.multitasking;

public class Run6 {

	public static void main(String[] args) {
		System.out.println("main starts");
		new Print1to5().start();
		Thread t=new PrintAlphabets();
		t.setDaemon(true);
		t.start();
		System.out.println("main ends");
	}

}
class Print1to5 extends Thread
{
	public void run()
	{
		System.out.println("run() of print 1-5 starts");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" ");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
			
		}System.out.println("run() of print 1-5 ends");
	}
}
class PrintAlphabets extends Thread
{
	public void run()
	{
		System.out.println("run() of AtoP starts");
		char c='A';
		while(true)
		{
			System.out.print(c);
			++c;
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}  