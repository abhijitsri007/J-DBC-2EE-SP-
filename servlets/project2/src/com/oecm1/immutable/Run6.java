package com.oecm1.immutable;

public class Run6 {
	int i;
	Run6(int x)
	{
		i=x;
	}
	Run6(Run6 r)
	{
		i=r.i;
	}
	
	public static void main(String[] args) {
		
		//Run6 a1=new Run6(10);
		//Run6 a2=new Run6(a1);			
		Run6 a2=new Run6(new Run6(10));//two objects are created
		System.out.println(a2);	
	}
	

}
