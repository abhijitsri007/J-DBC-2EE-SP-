package com.oecm1.fileIO;

import java.io.File;
import java.io.IOException;

public class Run2 {

	public static void main(String[] args) {
		File f=new File("F:\\testfolder\\file1.txt");
		if(!f.exists())
		{
			try {
				f.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("new folder created");
			
		}
		else
		{
			System.out.println("folder already exists");
		}
	}

}
