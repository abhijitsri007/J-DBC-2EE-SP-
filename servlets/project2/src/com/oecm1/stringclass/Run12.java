package com.oecm1.stringclass;

public class Run12 {

	public static void main(String[] args) {
		String s1="developer";
		System.out.println(s1.substring(2,6));
		System.out.println(s1.substring(3));
		//String s2="java";
				/*for(int i=0;i<=s2.length();i++)
				{
					System.out.println(s2.substring(0,i));
				}*/
			for(int i=0;i<s1.length();i++)
			{
				for(int j=s1.length();j>i;j--)
				{
					System.out.print(" ");
				}
				for(int k=0;k<=i;k++)
				{
					System.out.print(s1.charAt(k));
					System.out.print(" ");
				}
				System.out.println();
			}

	}		
	
}
