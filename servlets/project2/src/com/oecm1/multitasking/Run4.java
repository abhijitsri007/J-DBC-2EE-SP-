package com.oecm1.multitasking;

class Printer
{
	synchronized void print(String msg)
	{
		System.out.print("[");
		for(int i=0;i<msg.length();i++){
		System.out.print(msg.charAt(i));
		try{Thread.sleep(500);}
		catch(Exception e){}
		}System.out.println("]");
		
	}
}
class PrintThread implements Runnable
{
	Printer p;
	String msg;
	PrintThread(Printer p,String msg)
	{
		this.p=p;
		this.msg=msg;
		new Thread(this).start();
	}
	public void run()
	{
		p.print(msg);
	}
}


public class Run4 {

	public static void main(String[] args) {
		
		Printer p=new Printer();
		//PrintThread pt=new PrintThread(p,"jspiders");
		//new Thread pt.start();
		//{
			//p.print("jspiders");
		//}
		new PrintThread(p,"jspiders");//thread starts
		new PrintThread(p,"bangalore");//thread starts
		new PrintThread(p,"karnataka");//thread starts
		
	}

}
