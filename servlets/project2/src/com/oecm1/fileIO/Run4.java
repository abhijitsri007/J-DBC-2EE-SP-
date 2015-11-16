package com.oecm1.fileIO;

import java.io.BufferedReader;
import java.io.FileReader;


public class Run4 {

	public static void main(String[] args) {
		try
		{
			FileReader fr=new FileReader("F:\\testfolder\\file1.txt");
			BufferedReader br=new BufferedReader(fr);
			String s=br.readLine();
			while(s!=null)
			{
				System.out.println(s);
				s=br.readLine();
			}
			br.close();
			fr.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
