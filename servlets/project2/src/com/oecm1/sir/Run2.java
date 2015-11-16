package com.oecm1.sir;

public class Run2 {

	public static void main(String[] args) {
		Integer iObj=new Integer(10);//boxing
		System.out.println(iObj);
		int c=iObj*2;
		System.out.println(c);
		
		int i=iObj.intValue();
		System.out.println(i);
		

	}

}
