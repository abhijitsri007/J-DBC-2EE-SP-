package com.oecm1.stringclass;

public class Run17 {

	public static void main(String[] args) {
		String s1="Java";
		for(int i=0;i<s1.length();i++)
		{
			char s2=s1.charAt(i);
			char s3=Character.toUpperCase(s2);
			if(s2==s3)
				System.out.print(Character.toLowerCase(s2));
			else
				System.out.print(Character.toUpperCase(s2));
		}

	}

}
