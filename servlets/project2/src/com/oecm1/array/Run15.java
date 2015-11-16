package com.oecm1.array;
import java.util.Arrays;


public class Run15 {

	public static void main(String[] args) {
		
		String[] arr={"x","abc","be"};
		
		Arrays.sort(arr,new Lensorter());
		for(String s:arr)
		{
			System.out.println(s);
		}
	}
}
class Lensorter implements java.util.Comparator<Object>{
	public int compare(Object arg0,Object arg1)
	{
		String s1=(String)arg0;
		String s2=(String)arg1;
		return s1.length()-s2.length();
		
		
		
	}
}
		