package com.oecm1.stringclass;

public class Run13 {

	public static void main(String[] args) {
		//String s1="akash";
		//int c=0;
		/*for(int i=0;i<s1.length();i++)
		{
			if('a'==s1.charAt(i))
				c++;
		}
			System.out.println(c);*/
		String s2="java";
		String s3=s2.replace("a","");
		System.out.println(s2.length()-s3.length());
		//System.out.println(s2.length()-s2.replace("a","").length());
	}

}
