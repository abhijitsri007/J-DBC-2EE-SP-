package com.oecm1.sort;

import java.util.Arrays;
import java.util.Scanner;

public class project1 
{
	public static Scanner scn=new Scanner(System.in);
		
	public static void main(String[] args) {
		System.out.println("enter a string");
		String s=scn.nextLine();
		String[] arr=s.split(" ");
		StringBuffer sb=new StringBuffer();
		System.out.println("given string is:-");
		for(String b:arr)
		{
			System.out.print(b+" ");
		}
		Arrays.sort(arr);
		System.out.println();
		for(int i=0;i<=arr.length-1;i++)
		{
			sb.append(arr[i]+" ");
		}
		System.out.println("sorted string is:-");
		System.out.println(sb.toString());
	}

}
