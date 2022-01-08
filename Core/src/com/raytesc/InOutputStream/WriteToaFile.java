package com.raytesc.InOutputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToaFile {

	public static void main(String[] args) throws Exception {
		
		FileWriter writer = new FileWriter("E:/core1206/hello.txt");
		PrintWriter pw = new PrintWriter(writer);
		
		for (int i = 0; i <5; i++) {
			pw.println(i+":Line");
			}
	pw.close();
	writer.close();
	
	System.out.println("Successfully written");// its always create a new file & replace to selected file
	}
}
