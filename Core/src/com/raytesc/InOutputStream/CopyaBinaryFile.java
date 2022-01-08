package com.raytesc.InOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class CopyaBinaryFile {

	public static void main(String[] args) throws Exception {
		
		String source = "E:/core1206/my.jpg";
		String target = "E:/core1206/copy.jpg";
		
		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer = new FileOutputStream(target);
		
		int ch = reader.read();
		while (ch!=-1) {
			writer.write(ch);
			ch=reader.read();
			}
	writer.close();
	reader.close();
	
	System.out.println("pic copied");
	}
}
