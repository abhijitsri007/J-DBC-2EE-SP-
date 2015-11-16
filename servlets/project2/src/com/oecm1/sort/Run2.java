package com.oecm1.sort;

import java.util.Arrays;
import java.lang.Comparable;
public class Run2 {

	public static void main(String[] args) {
		A[] arr=new A[4];
		arr[0]=new A(4);
		arr[1]=new A(2);
		arr[2]=new A(10);
		arr[3]=new A(6);
		Arrays.sort(arr);
		for(A a:arr)
		{
			System.out.println(a);
		}

	}

}
class A implements Comparable<Object>
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return i+"";
	}
	public int compareTo(Object arg0)
	{
		return ((A)arg0).i-i;
	}
}