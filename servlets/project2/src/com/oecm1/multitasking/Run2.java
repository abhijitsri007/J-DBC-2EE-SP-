package com.oecm1.multitasking;

public class Run2 {

	public static void main(String[] args) {
		System.out.println("main starts");
		//Runnable r=new Runnable1();
		//Thread t1=new Thread(r);
		//t1.start();
		new Runnable1();
		new Runnable1();
		new Runnable1();
		System.out.println("main ends");
		

	}

}
class Runnable1 implements Runnable
{
	Runnable1()
	{
		new Thread(this).start();
	}
	public void run()
	{
		
		System.out.println("run() of Runnable1 starts");
		for(int i=1;i<=15;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}System.out.println("run() of Runnable1 ends");
	}
}