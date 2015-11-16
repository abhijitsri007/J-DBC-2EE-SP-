package com.oecm1.array;
import java.util.Arrays;
import java.lang.Comparable;

public class Run17 {

	public static void main(String[] args) 
	{
		Book2[] a=new Book2[4];
		a[0]=new Book2("java",360);
		a[1]=new Book2("c",380);
		a[2]=new Book2("bahubali",240);
		a[3]=new Book2("uppi",350);
	
		System.out.println("before sort");
		for(Book2 b:a)
		{
			System.out.println(b);
		}
		
		Arrays.sort(a);
		System.out.println("after sort");
		for(Book2 b:a)
		{
			System.out.println(b);
		}
		/*public int compareTo(Object arg0)
		{
			
			//return pages-((Book2)arg0).pages;
		}*/

	}
}
class Book2 implements Comparable<Object>
{
	
	String title;
	int pages;
	
	Book2(String s,int p)
	{
		title=s;
		pages=p;
	}
	public String toString()
	{
		return "["+title+","+pages+"]";
		
	}
	public int compareTo(Object arg0)
	{
		Book2 b=(Book2)arg0;
		return title.compareTo(b.title);
		//return pages-((Book2)arg0).pages;
	}
}