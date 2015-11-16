package com.oecm1.mocktest;

public class Run8 {

	public static void main(String[] args) {
		new Test1();
		

	}

}
class Constructor
{
	int a;
	int b;
	Constructor(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

}
class Test1 extends Constructor
{
	Test1()
	{
		super(10,20);
		
	}
}