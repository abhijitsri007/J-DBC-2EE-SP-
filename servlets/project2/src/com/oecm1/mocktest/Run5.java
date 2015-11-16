package com.oecm1.mocktest;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;
public class Run5 {

	private static Scanner scn;

	public static void main(String[] args) throws IOException {
		
		scn = new Scanner(System.in);
		System.out.println("Please enter 1st value");
		String s=scn.nextLine();
		//String s=reader.readLine();
		int a=Integer.parseInt(s);
		
		System.out.println("please enter 2nd value");
		String g=scn.nextLine();
		//s=reader.readLine();
		int b=Integer.parseInt(g);
		System.out.println(a+b);

	}

}
