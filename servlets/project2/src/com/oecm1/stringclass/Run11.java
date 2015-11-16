package com.oecm1.stringclass;

public class Run11 {

	public static void main(String[] args) {
		
		System.out.println(isPallindrome("madam"));
	}
	public static boolean isPallindrome(String arg0)
	{
		int n=arg0.length();
		for(int i=0,j=n-1;i<=n/2;i++,j--)
		{
			if (arg0.charAt(i)!=arg0.charAt(j)) return false;
		}
		return true;
	}

}
