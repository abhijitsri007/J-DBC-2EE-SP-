package com.oecm1.collection;

public class Run1 {

	public static void main(String[] args) {
		Container c=new Container();
		c.add(10);
		c.add(5);
		c.add(3);
		System.out.println(c.get(0));
		System.out.println(c.get(1));
		System.out.println(c.get(2));
	
		

	}

}
class Container
{
	private int[] a;
	private int p;
	public Container()
	{
		a=new int[3];
		
	}
	public void add(int element)
	{
		
		if(p>=a.length) increase();
			a[p++]=element;
	}
	public int get(int index)
	{
		return a[index];
	}
	private void increase()
	{
		int newsize=a.length+3;
		int[] b=new int[newsize];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		a=b;
	}
}