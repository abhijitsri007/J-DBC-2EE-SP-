package com.oecm1.multitasking;

public class Run7 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Thread.currentThread().setName("oecm1 thread");
		String ThreadName=Thread.currentThread().getName();
		System.out.println(ThreadName);
		System.out.println("main ends");

	}

}
