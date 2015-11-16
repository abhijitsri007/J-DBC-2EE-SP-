package com.oecm1.multitasking;

import java.util.Arrays;

public class Run8 {

	public static void main(String[] args) {
		Emp[] a=new Emp[3];
		a[0]=new Emp("ri",1);
		a[1]=new Emp("s",2);
		a[2]=new Emp("mee",3);
		Arrays.sort(a,new Namewisesort());
		
		for(Emp w:a)
		{
			System.out.println(w);
		}
	}

}
class Emp 
{
	String name;
	int id;
	
	Emp(String s,int d)
	{
		name=s;
		id=d;
	}
	public String toString()
	{
		return "[name:"+ name +","+"id:"+ id+"]";
	}
	
}
class Namewisesort implements java.util.Comparator<Object>
{
	
	public int compare(Object arg0,Object arg1)
	{
		Emp e1=(Emp)arg0;
		Emp e2=(Emp)arg1;
		return e1.name.length()-e2.name.length();
	}
}