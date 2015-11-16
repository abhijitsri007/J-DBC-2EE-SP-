package com.oecm1.array;

import java.util.Arrays;

public class Run18 {

	public static void main(String[] args)
	
	{
		Emp[] a=new Emp[4];
		a[0]=new Emp("ram",360.2);
		a[1]=new Emp("mohan",380.5);
		a[2]=new Emp("bahubali",240.8);
		a[3]=new Emp("uppi",350.9);
		
		for(Emp e:a)
		{
			System.out.println(e);
		}
			Arrays.sort(a);
			System.out.println("after sorting");
			for(Emp e:a)
				System.out.println(e);
		}
		
	}
class Emp implements Comparable<Object>
{
	String name;
	double sal;
	Emp(String s,double p)
	{
		name=s;
		sal=p;
	}
	public String toString()
	{
		return "["+name+","+sal+"]";
		
	}
	public int compareTo(Object arg0)
	{
		Emp e=(Emp)arg0;
		if(sal>e.sal) return 1;
		else if(sal<e.sal) return -1;
		else return 0;
			
	}
}
