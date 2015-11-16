package com.oecm1.array;

import java.util.Scanner;
//for binary search ,array sh/d be sorted
public class Run12 {

	public static void main(String[] args) {

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
		int search=scn.nextInt();
		scn.close();
		
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		
		while(low<=high)
		{
			if(a[mid]>search)
			{
				high=mid-1;
			}
			else if(a[mid]<search)
			{
				low=mid+1;
			}
			else
			{
				System.out.println("element found="+a[mid]+"@ index"+mid);
				break;
				
			}
			mid=(low+high)/2;
		}
		if(low>high)
		System.out.println("element"+search+"not found");
	}

}
