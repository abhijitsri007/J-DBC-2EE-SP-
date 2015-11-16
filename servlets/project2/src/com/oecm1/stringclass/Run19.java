package com.oecm1.stringclass;

public class Run19 {

	public static void main(String[] args) {
		
		String s="Harshit:Amit:Kenny";
		
		String receivedArr[]=s.split("a");
		
		for(String sd: receivedArr)
		{
			System.out.println(sd);
		}

	}

}
