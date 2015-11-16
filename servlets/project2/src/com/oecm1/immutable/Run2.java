package com.oecm1.immutable;

public class Run2 {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("ab");
		System.out.println(sb);
		sb.append("cd");
		System.out.println(sb);
		sb.insert(1,"e");
		System.out.println(sb);
		

	}

}
