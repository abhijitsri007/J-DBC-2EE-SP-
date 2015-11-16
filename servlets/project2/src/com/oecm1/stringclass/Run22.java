package com.oecm1.stringclass;

public class Run22 {

	public static void main(String[] args) {
		String str="ravi is a good boy";
		System.out.println(str.substring(0,4));
		String str2= str.substring(0,4);
		System.out.println(reverse(str2));
	}
public  static String reverse(String arg0)
{
	String s="";
	for(int i=arg0.length()-1;i>=0;i--)
	{
		s+=arg0.charAt(i);
	}
		return s;
}
}
