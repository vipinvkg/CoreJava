package com.raytesc.InOutputStream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendText {

	public static void main(String[] args) throws Exception {
		//FileWriter writer = new FileWriter("E:/core1206/hello.txt",true);// we can use one of from both (fileWriter or FileOutputStream)
		FileOutputStream writer = new FileOutputStream("E:/core1206/hello.txt",true);
		PrintWriter pw = new PrintWriter(writer);
			pw.println("Gupta");
			
			
	pw.close();
	writer.close();
	
	System.out.println("Successfully written");// its always create a new file & replace to selected file
	}

	}

