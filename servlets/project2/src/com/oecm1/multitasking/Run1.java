package com.oecm1.multitasking;

public class Run1 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Thread t1=new Print1to15();
		t1.start();
		t1=new PrintAtoP();
		t1.start();
		t1.run();
		System.out.println("main ends");
	}

}
class Print1to15 extends Thread
{
	public void run()
	{
		System.out.println("run() of print 1-15 starts");
		for(int i=1;i<=15;i++)
		{
			System.out.print(i+" ");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
			
		}System.out.println("run() of print 1-15 ends");
	}
}
class PrintAtoP extends Thread
{
	public void run()
	{
		System.out.println("run() of AtoP starts");
		for(int i=65;i<=80;i++)
		{
			System.out.print((char)i+" ");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}System.out.println("run() of AtoP ends");
	}
}  