package com.oecm1.array;

import java.util.Scanner;

public class Run19 {

	public static void main(String[] args) {
		
	
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size of array:-");
		int size=scn.nextInt();
		int[] arr= new int[size];
		System.out.println("enter the elements of array:-");
		for(int i=0;i<size;i++)
		{
			arr[i]=scn.nextInt();
		}
		System.out.println("the inserted elements are:-");
		for(int i:arr)
		{
			System.out.println(i);
		}
		scn.close();
		for(int i=0;i<size;i++)
		{
			
		}
	}

}
