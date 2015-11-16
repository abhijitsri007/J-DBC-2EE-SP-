package com.oecm1.collection;

public class Run10 {

	public static void main(String[] args) {
		Container1<String> c1=new Container1<String>();
		c1.add("abcd");
		String s1=c1.get();
		System.out.println(s1);

	}

}
class Container1<T>
{
	private T a;
	public void add(T element)
	{
		a=element;
		
	}
	public T get()
	{
		return a;
	}
}