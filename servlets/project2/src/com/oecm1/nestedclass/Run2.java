package com.oecm1.nestedclass;

interface I
{
	void m1();
}
public class Run2 {

	public static void main(String[] args) {
		I i1=new I()
		{
			public void m1()
			{
				System.out.println("m1() of type I");
			}
		};
i1.m1();
	}

}
