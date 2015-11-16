package com.oecm1.stringclass;

public class Run18 {

	public static void main(String[] args) {
		String s1="developer";
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf('e',4));
		System.out.println(s1.indexOf('v',4));
		System.out.println(s1.lastIndexOf('r'));
		System.out.println(s1.contains("developer"));
		System.out.println(s1.startsWith("de"));
		System.out.println(s1.endsWith("er"));
		String s2="java";
		System.out.println(s1.compareTo(s2));
		System.out.println();
		int a="Balu".compareTo("chetan");
		System.out.println(a);		
		
		int b="balu".compareTo("chetan");
		System.out.println(b);
		
		int c="balu".compareToIgnoreCase("chetan");
		System.out.println(c);

	}

}
