package com.oecm1.mocktest;
import java.lang.Comparable;
import java.util.Arrays;

public class Run9 {

	public static void main(String[] args) {
		Emp1[] a=new Emp1[4];
		a[0]=new Emp1("ramu","21",2002.03);
		a[1]=new Emp1("shyam","23",3002.03);
		a[2]=new Emp1("manohar","20",2032.04);
		a[3]=new Emp1("kenny","12",6002.03);
		
		
		
		for(Emp1 q:a)
		{
			System.out.println(q);
		}
		Arrays.sort(a);
		for(Emp1 q:a)
		{
			System.out.println(q);
		}
		Arrays.sort(a,new id());
		for(Emp1 q:a)
		{
			System.out.println(q);
		}
		Arrays.sort(a,new sal());
		for(Emp1 q:a)
		{
			System.out.println(q);
		}
	}

}
 class Emp1 implements Comparable<Object>
{
	String name;
	String id;
	double sal;
	public Emp1(String n,String d,double s)
	{
		name=n;
		id=d;
		sal=s;
	}
	public String toString()
	{
		return "[name:"+ name +","+"id:"+ id +","+"sal:"+ sal +"]";
	}
	@Override
	public int compareTo(Object arg0)
	{
		Emp1 e=(Emp1)arg0;
		return name.compareTo(e.name);
	}
}
class id implements java.util.Comparator<Object>
{
	public int compare(Object arg0,Object arg1)
	{
		Emp1 e1=(Emp1)arg0;
		Emp1 e2=(Emp1)arg1;
		
		return e1.id.compareTo(e2.id);
	}
}
class sal implements java.util.Comparator<Object>
{
	public int compare(Object arg0,Object arg1)
	{
		Emp1 s1=(Emp1)arg0;
		Emp1 s2=(Emp1)arg1;
		
		if(s1.sal>s2.sal) return 1;
		else if(s1.sal<s2.sal) return -1;
		else return 0;
	}
}