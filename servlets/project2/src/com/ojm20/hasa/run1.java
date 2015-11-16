package com.ojm20.hasa;
class A
{
	int i;
	B b;
	A(int i,B b)
	{
		this.i=i;
		this.b=b;
	}
}
class B
{
	int x;
	int y;
	B(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
public class run1 {

	public static void main(String[] args) {
		A a1=new A(10,new B(20,30));
		System.out.println(a1.i);
		System.out.println(a1.b.x);
		System.out.println(a1.b.y);

	}

}
