package com.oecm1.array;

public class Run16 {

	public static void main(String[] args)
	{
		int[] a={1,2,5,10,20,50,100,500,1000};
		int no=126;
		while(no!=0)
		{
			int n=no;
			for(int i:a)
			{
				int d=n/i;
				int r=n%i;
				/*if(d!=0)
				{
					n=n-r;
				}*/
				System.out.print(d+" ");
				System.out.println(r);		
			}no=no-n;
			System.out.println("-----------********---------");
		}
	}

}


