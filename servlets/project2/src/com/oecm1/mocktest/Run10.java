package com.oecm1.mocktest;

public class Run10 {

	public static void main(String[] args) {
		new Add(10,20,30);
		new Add(40,50);
		

	}

}
class Add
{
	int a;
	int b;
	int c;
	
	Add(int a1,int a2)
	{
		a=a1;
		b=a2;
		System.out.println(a+b);
		
	}
	Add(int b1,int b2,int b3)
	{
		a=b1;
		b=b2;
		c=b3;
		System.out.println(a+b+c);
		
	}
}