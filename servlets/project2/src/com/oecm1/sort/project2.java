package com.oecm1.sort;

import java.util.Arrays;
import java.util.Scanner;



public class project2 
{
	public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter a string");
		String d=scn.nextLine();
		String[] arr=d.split(" ");
		
		Arrays.sort(arr,new Len());
		for(String s:arr)
		{
			System.out.print(s+" ");
		}

	}

}
class Len implements java.util.Comparator<Object>
{
	public int compare(Object arg0,Object arg1)
	{
		String s1=(String)arg0;
		String s2=(String)arg1;
		return s1.length()-s2.length();
	}	
}