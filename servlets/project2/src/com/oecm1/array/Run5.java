package com.oecm1.array;

import java.util.Scanner;

public class Run5 {

	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter size");
		int size=scn.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("type a no");
			a[i]=scn.nextInt();
		}
		
		int big=0;
		for(int i:a)
		{
			if(i>big)
				big=i;
		}
		System.out.println("biggest element is="+big);
	}

}
