package com.oecm1.immutable;

public class run4 
{

	public static void main(String[] args)
	{
		System.out.println(reverse("developer"));
	}
	
	public static String reverse(String s)
	{
		StringBuilder sb=new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		
		}
		
		return sb.toString();
	}
			
		
}
