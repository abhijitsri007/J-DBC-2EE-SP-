package com.oecm1.immutable;

public class run3 {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("developer");
		for(int i=s1.length()-1;i>=0;i--)
		{
			StringBuilder s2=new StringBuilder();
			s2.append(s1.charAt(i));
			System.out.print(s2);
		}
		

	}

}
