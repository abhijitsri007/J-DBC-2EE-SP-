package com.oecm1.sir;

import java.util.Arrays;

public class Run1 {

	public static void main(String[] args) {
		animal[] arr=new animal[4];
		arr[0]=new Dog();
		arr[1]=new Dog();
		
		arr[0]=new Cat();
		arr[1]=new Cat();
		Object var=10;
		System.out.println(var);
		System.out.println(Arrays.toString(arr));
		//System.out.println(arr);
		for(animal a:arr)
		{
			a.makesound();
			
		}
		

	}

}
