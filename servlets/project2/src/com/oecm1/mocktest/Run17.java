package com.oecm1.mocktest;

import java.util.Iterator;



public class Run17 {

	public static <E> void main(String[] args) {
		//int[] arr=new int[5];
		int[] arr;
		arr=new int[5];
		arr[0]=10;
		arr[1]=++arr[0];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		int[] arr1={1,2,3,4};
		Iterator<E> itr=new Iterator<E>() {
			@Override
			public boolean hasNext() {
				for(int j=0;j<arr1.length;j++)
				{
					if(0!=arr1[j])
						return true;
					
				}
				
					return false;
			
			}

			@Override
			public E next() {
				
				return null;
			}
		};
		
	}

}
