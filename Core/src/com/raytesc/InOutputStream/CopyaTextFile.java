package com.raytesc.InOutputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyaTextFile {

	public static void main(String[] args) throws Exception {
		
		//String source = "E:/core1206/hello.txt";
		//String target = "E:/core1206/copyfile.txt";
		
		FileReader reader = new FileReader("E:/core1206/hello.txt");
		FileWriter writer = new FileWriter("E:/core1206/copyfile.txt");//it will copy from source file but remove the content from target file (if dont want to remove then use keyword "true" to append)
		
		int ch = reader.read();
		
		while (ch!=-1) {
			writer.write(ch);
			ch=reader.read();
		}
	writer.close();
	reader.close();
	
	System.out.println("Copied");
	}
}
