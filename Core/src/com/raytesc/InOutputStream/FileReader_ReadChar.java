package com.raytesc.InOutputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader_ReadChar {

	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("E:/Core1206/hello.txt");
		int ch = reader.read();
		char chr;
		
		while(ch!=-1) {
			chr= (char)ch;
			System.out.print(chr);
			ch=reader.read();
		}
	}
}
