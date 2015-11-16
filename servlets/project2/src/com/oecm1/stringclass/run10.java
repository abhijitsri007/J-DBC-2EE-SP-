
package com.oecm1.stringclass;

import java.util.Scanner;

public class run10 {

	private static Scanner scn;
	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("enter a string");
		String str=scn.next();
		if(str.equalsIgnoreCase(reverse(str)))
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");

	}
	public static String reverse(String arg0)
	{
		if(arg0==null) return null;
		String s="";
		for(int i=arg0.length()-1;i>=0;i--)
		{
			s+=arg0.charAt(i);
		
		}
		return s;
	}

}
