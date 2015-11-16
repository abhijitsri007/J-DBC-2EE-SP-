package com.oecm1.mocktest;

public class Run18 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("abhijit");
		String s=sb.toString();
		System.out.println(s);
		StringBuilder sb2=new StringBuilder();
		for(int i=sb.length()-1;i>=0;i--)
		{
			sb2.append(sb.charAt(i));
			
		}
		System.out.println(sb2.toString());

	}

}
