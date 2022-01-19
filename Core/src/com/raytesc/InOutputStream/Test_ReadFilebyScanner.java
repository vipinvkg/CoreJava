package com.raytesc.InOutputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Test_ReadFilebyScanner {

	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("E:/core1206/hello.txt");
	Scanner sc = new Scanner(reader);
	
	while (sc.hasNext()) {
		System.out.println(sc.nextLine());
		}
	reader.close();
	}
}
