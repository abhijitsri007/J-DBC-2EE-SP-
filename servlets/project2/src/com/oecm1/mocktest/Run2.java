package com.oecm1.mocktest;
import java.lang.Comparable;
import java.util.Arrays;
public class Run2 {

	public static void main(String[] args) {
		Emp[] e=new Emp[3];
		e[0]=new Emp("arindam",1);
		e[1]=new Emp("abhijit",2);
		e[2]=new Emp("nitish",3);
		Arrays.sort(e);
		for(Emp a:e)
		{
			System.out.println(a);
		}
	}

}
class Emp implements Comparable<Object>
{
	String name;
	int id;
	
	Emp(String n,int d)
	{
		this.name=n;
		this.id=d;	
	}
	public String toString()
	{
		return "[name:"+ name +","+ "id:"+ id +"]";
	}
	public int compareTo(Object arg0)
	{
		Emp c=(Emp)arg0;
		return name.compareTo(c.name);
	}
}
