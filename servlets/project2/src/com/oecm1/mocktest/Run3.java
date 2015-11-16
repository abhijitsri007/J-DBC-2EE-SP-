package com.oecm1.mocktest;

public class Run3 {

	public static void main(String[] args) {
		String s="abhijit";
		String a="";
		char c;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			if(a.indexOf(c)==-1)
			{
				a+=c;
			}
		}System.out.println(a);
		

	}

}
