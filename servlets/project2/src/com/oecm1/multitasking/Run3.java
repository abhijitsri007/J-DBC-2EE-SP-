package com.oecm1.multitasking;

public class Run3 {

	public static void main(String[] args) 
	{
		new Husband();
		new Wife();

	}

}
class JoinedAccount
{
	int bal=1000;
	void deposit(int amt)
	{
		bal+=amt;
	}
}
class Husband extends JoinedAccount implements Runnable
{
	Husband()
	{
		new Thread(this).start();
	}
	void deposit
	
}
class Wife extends JoinedAccount implements Runnable
{
	Wife()
	{
		new Thread(this).start();
	}
}