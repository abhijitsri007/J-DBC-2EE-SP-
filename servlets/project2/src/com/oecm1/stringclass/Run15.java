package com.oecm1.stringclass;

public class Run15 {

	public static void main(String[] args) {
		String s1="java";
		String s2="";
		char c;
		for(int i=0;i<s1.length();i++)
		{
			c=s1.charAt(i);
			if(s2.indexOf(c)==-1)
			{
				System.out.println(c);
				s2+=c;
				
			}
		}System.out.println(s2);

	}

}
