package com.oecm1.stringclass;

import java.util.Scanner;

public class Run8 {

	private static Scanner scn;

	public static void main(String[] args) {
		/*System.out.println("abcd".charAt(0));
		System.out.println("abcd".charAt(5));
		String s="abcd";
		char c=s.charAt(0);
		System.out.println(c);
		char c=s.charAt(0);*/
		scn = new Scanner(System.in);
		System.out.println("enter a character");
		char c=scn.next().charAt(0);
		System.out.println(c);
	

	}

}
