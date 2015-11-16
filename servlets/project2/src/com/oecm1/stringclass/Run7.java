package com.oecm1.stringclass;

public class Run7 {

	public static void main(String[] args) {
		String s1="Abcd";
		String s2="abcd";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		Object x="abcd";
		System.out.println(x);
	}

}
