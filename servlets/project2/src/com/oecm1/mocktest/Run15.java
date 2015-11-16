package com.oecm1.mocktest;

public class Run15 {

	public static void main(String[] args) {
	Rect r1=new Rect(10,20);
	System.out.println(r1);
	r1=new Rect(30,40);
	System.out.println(r1);
	String s1=new String("abc");
	System.out.println(s1);
	s1=new String("def");
	System.out.println(s1);
	String s="ab";
	for (int i = 1; i <=3; i++) {
		s+=i;
		
	}
	System.out.println(s);
	}

}
class Rect
{
	private final int length;
	private final int breadth;
	public Rect(int l,int b)
	{
		length=l;
		breadth=b;
		
	}
	public String toString()
	{
		return "["+ length +","+ breadth +"]";
				
	}
	
}
