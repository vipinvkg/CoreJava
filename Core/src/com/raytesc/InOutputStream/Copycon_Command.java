package com.raytesc.InOutputStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Copycon_Command {

	public static void main(String[] args) throws Exception {
		
		String target = "E:/core1206/Copycon.txt";
		FileWriter writer = new FileWriter(target);
		PrintWriter printwriter = new PrintWriter(writer);
		
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);
		
		System.out.println("Start....");
		String line = in.readLine();
		while (!line.equals("quit")) {//can write in console untill you dont type quit & it will save into target file.
			printwriter.print(line);
			line=in.readLine();
		}
	printwriter.close();
	isReader.close();
System.out.println("Stop");
	}
}
