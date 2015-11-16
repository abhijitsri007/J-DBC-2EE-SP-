package com.oecm1.array;

import java.util.Scanner;

public class run6 {

	
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
			int evencount=0;
			int oddcount=0;
			for(int i:a)
			{
				if(i%2==0)
					evencount++;
				else
					oddcount++;
			}
			System.out.println("even no count="+evencount);
			System.out.println("odd no count="+oddcount);

	}

}
