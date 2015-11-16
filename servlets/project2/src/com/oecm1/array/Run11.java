package com.oecm1.array;

import java.util.Scanner;

public class Run11 {

	public static void main(String[] args) {
		//int[] arr={1,2,3,4,5,6};
		//int search=6;

		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter array size");
		int size=scn.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("eneter a no.");
			a[i]=scn.nextInt();
			
		}
		//*************************
		System.out.println("enter a no to be search");
		int n=scn.nextInt();
		//int j=linearSearch(arr,search);
		scn.close();
		int j=linearSearch(a,n);
		if(j!=-1)
			//System.out.println("element found="+arr[j]+","+"with index="+j);
			System.out.println("element found="+a[j]+","+"with index="+j);
		else
			System.out.println("element not found");
	}
	public static int linearSearch(int[] arr,int search)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				return i;
			}
		}
		return -1;
	}

}
