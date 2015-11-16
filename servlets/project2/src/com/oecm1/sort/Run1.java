package com.oecm1.sort;
import java.util.Arrays;


public class Run1 {

	public static void main(String[] args)
	{
		Emp[] e=new Emp[4];
		e[0]=new Emp("anish","1a",1000);
		e[1]=new Emp("bala","4a",5000);
		e[2]=new Emp("sunny","2a",10000);
		e[3]=new Emp("kenny","8a",3000);
		
		
		System.out.println("before sorting");
		for(Emp m:e)
		{
			System.out.println(m);
		}
		System.out.println("-------------*******-------------");
		Arrays.sort(e);
		System.out.println("after sorting by name");
		for(Emp m:e)
		{
			System.out.println(m);
		}
		System.out.println("-------------*******-------------");
		System.out.println("after sorting by id");
		Arrays.sort(e,new IdComp());
		for (Emp m : e) 
		{
			System.out.println(m);
		}
		System.out.println("-------------*******-------------");
		System.out.println("after sorting by sal");
		Arrays.sort(e,new Sal());
		for (Emp m : e) 
		{
			System.out.println(m);
		}
		
	}

}
  class Emp implements Comparable<Object>
{
	 String name;
	String  id;
	double sal;
	public Emp(String n,String d,double s)
	{
		name=n;
		id=d;
		sal=s;
	}

	
	public String toString()
	{
		return "["+name+","+id+","+sal+"]";
		
	}
	
	//@Override
	public int compareTo(Object arg0) {
		Emp e1=(Emp)arg0;
		return name.compareTo(e1.name);
	}
	
	
}
class IdComp implements java.util.Comparator<Object>
{
	public int compare(Object arg0,Object arg1)
	{
		Emp s1=(Emp) arg0;
		Emp s2=(Emp) arg1;
		return s1.id.compareTo(s2.id);
		
	}
}
class Sal implements java.util.Comparator<Object>
{
	public int compare(Object arg0,Object arg1)
	{
		Emp s3=(Emp) arg0;
		Emp s4=(Emp) arg1;
		if(s3.sal>s4.sal) return 1;
		else if(s3.sal<s4.sal) return -1;
		else return 0;
	}
}
