package com.oecm1.nestedclass;

public class Run1 {

	public static void main(String[] args) {
		A a1=new A(10);
		A.B b1=a1.new B();
		b1.display();
		
		A a2=new A(20);
		A.B b2=a2.new B();
		b2.display();
	}

}
class A
{
	int i;
	public A(int j) {
		this.i=j;
	}
	//inner class
	class B
	{
		void display()
		{
			System.out.println(i);
		}
	}
}