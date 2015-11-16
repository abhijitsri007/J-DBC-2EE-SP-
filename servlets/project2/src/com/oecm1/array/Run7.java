package com.oecm1.array;

import java.util.Arrays;

public class Run7 {

	public static void main(String[] args) {
		String[] arr=new String[4];
		arr[0]="java";
		arr[1]="sql";
		arr[2]="java";
		arr[3]="j2ee";
		
		System.out.println(Arrays.toString(arr));
		for(String i:arr)
		{
			System.out.println(i);
		}

	}

}
