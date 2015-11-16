package com.oecm1.fileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class Run3{

	public static void main(String[] args) {
		try
		{
			FileWriter fw=new FileWriter("F:\\testfolder\\file1.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Jspiders");
			bw.newLine();
			bw.write("Oar");
			bw.newLine();
			bw.write("Bangalore");
			bw.flush();
			bw.close();
			fw.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("done");

	}

}
