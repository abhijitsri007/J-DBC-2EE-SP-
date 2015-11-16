package com.oecm1.fileIO;

import java.io.File;

public class Run1 {

	public static void main(String[] args) {
		File f=new File("F:\\testfolder");
		if(!f.exists())
		{
			f.mkdir();
			System.out.println("new folder created");
			
		}
		else
		{
			System.out.println("folder already exists");
		}
		

	}

}
