package com.oecm1.mocktest;

public class Run16 {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder("ab");
		System.out.println(sb);
		sb.append("c");
		System.out.println(sb);
		sb.insert(3,'d');
		System.out.println(sb);
		sb.insert(4, 'e');
		System.out.println(sb);
		System.out.println(sb.length());
		B b=new B();
		System.out.println(b);
		
	}

}
class A
{
	int i;
	
	A(int x)
	{
		System.out.println(x);
		x=10;
		i=x;
		
	}
	A(A a)
	{	
		i=a.i;	
	}
}
class B extends A
{
	B()
	{
		super(15);
		System.out.println(i);
	}
}
