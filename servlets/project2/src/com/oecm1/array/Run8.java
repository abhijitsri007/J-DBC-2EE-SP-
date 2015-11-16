package com.oecm1.array;

public class Run8 
{

	public static void main(String[] args) 
	{
		//String str="ab,cd,ef";
		String str="java is an object oriented program";
		String[] arr=str.split(" ");
		
		/*for(String s:arr)
		{
			System.out.println(s);
		}*/
		StringBuilder sb=new StringBuilder();//to avoid craetion of so many objects
		for(int i=arr.length-1;i>=0;i--)
		{
			sb.append(arr[i]);
			sb.append(" ");
		}
		String s=sb.toString().trim();
		//s.trim();
		
		System.out.println(s);
	}
}

