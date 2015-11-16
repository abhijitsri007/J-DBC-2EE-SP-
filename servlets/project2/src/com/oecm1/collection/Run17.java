package com.oecm1.collection;

public class Run17 {

	public static void main(String[] args) {
		int[][] a=new int[4][3];
		a[0][0]=10;
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println();
			}
		}*/
		for(int[] i:a)
		{
			for(int j:i)
			{
				System.out.println(j);
			}
		}

	}

}
