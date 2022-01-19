package com.raytesc.InOutputStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizerEmailintoaFile {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("E:/core1206/Token.txt");
		BufferedReader br = new BufferedReader(reader);
		FileWriter writer = new FileWriter("E:/core1206/CopyToken.txt");
		PrintWriter pw = new PrintWriter(writer);

		String str = br.readLine();

		StringTokenizer stn = new StringTokenizer(str, ",");

		String token = null;

		while (stn.hasMoreElements()) {
			token = stn.nextToken();
			if (token.contains("@") && token.contains(".") ) {
				pw.println(token);	
			}
			
		}
		reader.close();
		writer.close();
		pw.close();
		System.out.println(token);
	}
}
