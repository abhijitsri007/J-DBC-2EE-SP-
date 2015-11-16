package com.oecm1.stringclass;

public class Run14 {

	public static void main(String[] args) {
		String s="developer";
		char z;
		String w="";
		int x=0;
		for(int i=0;i<s.length();i++)
		{
			z=s.charAt(i);
			
			if(w.indexOf(z)==-1)
			{
				for(int j=0;j<s.length();j++)
				{
					if(z==s.charAt(j))
					{
						x++;
					}
				}
				w=w+z;
				System.out.print(z);
				System.out.print(x);
				x=0;
				System.out.println();
			}
			
		}
	}

}
