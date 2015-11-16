package com.oecm1.mocktest;

import java.util.Scanner;

public class Run14 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scn.nextInt();
		scn.close();
	    double fact=1;
	    for(int i=1;i<=n;i++)
		{
		  fact *=i;
		  
		}
	      System.out.println("factorial of a no is="+fact);
		  String s=" "+fact;
	      String p=""+0;
		  int count=0;
	      for(int j=s.length()-1;j>=0;j--)
	        {
	          char c =s.charAt(j);
	           if(p.indexOf(c)!=-1)
	              {
	                count++;
	              }
	           else break;
	        }
	      	
	             System.out.println("No of trials="+count);
	   
	}

}
