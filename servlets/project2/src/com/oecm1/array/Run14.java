package com.oecm1.array;

import java.util.Arrays;

public class Run14 {

	public static void main(String[] args) 
	{
		int[] a={2,5,1,8,3};
		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
		

	}
	
	public static void bubbleSort(int[] a)
	{
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}

















































