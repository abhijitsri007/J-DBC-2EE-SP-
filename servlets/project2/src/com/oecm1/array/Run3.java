package com.oecm1.array;
import java.util.Arrays;//for Arrays.toString()
public class Run3 {

	public static void main(String[] args) {
		int[] arr={10,11,12,13};
		for(int i:arr)
		{
			System.out.println(i);
		}
		int[] a={10,20,30};
		int[] b=a;
		b[1]=40;
		
		for(int element:a)
			System.out.println(element);
			System.out.println(Arrays.toString(a));
			test1(arr);
			int[] arr1={1,2,3,4};
			test1(arr1);
	}
	static void test1(int[] a)
	{
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
