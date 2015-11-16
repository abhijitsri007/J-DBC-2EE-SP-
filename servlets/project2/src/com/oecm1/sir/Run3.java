package com.oecm1.sir;

import java.lang.Object;
public class Run3 {

	public static void main(String[] args) 
	{
		Object x=(Object) new Integer(10);//upcasting,boxing
		int i=((Integer)x).intValue();//downcasting,unboxing
		System.out.println(i);
		Object var1=10;
		Object var2=20;
		Integer a=(Integer) var1;//downcasting is always explicit
		Integer b=(Integer) var2;//downcasting is always explicit
		//System.out.println(var1+var2);//for object type variable we cant concat because instance is run time
		System.out.println(a+b);
		Integer i1=10;
		Integer i2=20;
		System.out.println(i1+i2);
	}
}

