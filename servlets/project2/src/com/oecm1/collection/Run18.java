package com.oecm1.collection;

public class Run18 {

	public static void main(String[] args) {
		int[][] a=new int[6][6];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0 || i==j)
				{
					a[i][j]=1;
				}
				else
				{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			
			{
				System.out.print(a[i][j]+" ");
			}System.out.println();
		
		}
	
	}

}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			