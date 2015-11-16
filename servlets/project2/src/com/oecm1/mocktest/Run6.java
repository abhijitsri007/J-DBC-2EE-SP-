package com.oecm1.mocktest;

public class Run6 {
	static int a;
	int b=20;
	void test1()
	{
		a=10;
		System.out.println(a);
	}
	
	public static void main(String[] args) {

		Run6 r=new Run6();
		System.out.println(r.b);
		r.test1();
	}

}
