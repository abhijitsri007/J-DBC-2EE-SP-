package com.oecm1.multitasking;

 class Stock
{
	int stock;
	
	synchronized void update(int n)
	{
		stock+=n;
		System.out.println("producer updated the stock");
		System.out.println("current stock is "+stock+" items");
		notify();
	}
	synchronized void consume(int n)
	{
		System.out.println("consumer requires "+n+" items");
		while(stock<n)
		{
			System.out.println("stock is less,wating for stock update...");
			try
			{
				//Thread.sleep(500);
				wait();
			}
			catch(Exception e)
			{
				
			}
		}
		stock-=n;
		System.out.println("stock is consumed by consumer ");
	}
}
class Consumer implements Runnable
{
	Stock s;
	int n;
	Consumer(Stock s,int n)
	{
		this.s=s;
		this.n=n;
		new Thread(this).start();
		
	}
	public void run() {
		s.consume(n);
	}
}
class Producer implements Runnable
{
	Stock s;
	int n;
	public Producer(Stock s,int n) 
	{
		this.s=s;
		this.n=n;
		new Thread(this).start();
	}
	public void run()
	{
		s.update(n);
	}
}
public class Run5 {

	public static void main(String[] args) {
		Stock s=new Stock();
		new Consumer(s, 10);
		
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		new Producer(s,25);
	}
		
}


