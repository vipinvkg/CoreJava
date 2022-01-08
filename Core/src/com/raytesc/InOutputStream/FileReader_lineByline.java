package com.raytesc.InOutputStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader_lineByline {

	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("E:/core1206/hello.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
		while (line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
	reader.close();
	}
}
