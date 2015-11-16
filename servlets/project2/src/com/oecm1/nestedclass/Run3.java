package com.oecm1.nestedclass;

public class Run3 {

	public static void main(String[] args) {
		

	}

}
class MyArrayList
{
	private int[] a;
	private int p;
	
	public MyArrayList()
	{
		this(10);
	}
	public MyArrayList(int n)
	{
		a=new int[n];
	}
	public void add(int element)
	{
		if(p>a.length) increase();
		a[p++]=element;
	}
	public void add(int index,int element)
	{
		if(index>p)throw new IndexOutOfBoundsException();
		if(p>=a.length) increase();
		System.arraycopy(a, index, a, index+1, size()-index);
		++p;
		
	}
	public int get(int index)
	{
		if(index>=p)throw new ArrayIndexOutOfBoundsException();
		return a[index];
	}
	public int size()
	{
		return p;
	}
	private void increase()
	{
		int s=a.length+a.length/2;
		int[] b=new int[s];
		System.arraycopy(a,0,b,0,a.length);
	}
}