package com.oecm1.mocktest;

public class Run11 
{

	public static void main(String[] args) 
	{
		String s="abhi1j2i3t";
		String c;
		int g;
		int add=0;
		//hs=hs+hc;
				
		int f;
		for(int i=0;i<s.length();i++)
		{
			String hs="";	
			c=s.substring(i,i+1);
			
			char charact=s.charAt(i);
			hs=hs+charact;
			try{
			f=Integer.parseInt(hs);
			g=Integer.parseInt(c);
			add=add+f;
			}
			catch(NumberFormatException e)
			{
				continue;
			}
			System.out.println(f);
			System.out.println(g);
		}System.out.println(add);
	}
}
