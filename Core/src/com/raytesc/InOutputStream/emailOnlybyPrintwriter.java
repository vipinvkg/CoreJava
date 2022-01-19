package com.raytesc.InOutputStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class emailOnlybyPrintwriter {

	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter("E:/core1206/output.txt");
		Pattern p = Pattern.compile( "[a-zA-Z0-9]"
                + "[a-zA-Z0-9_.]"
                + "*@[a-zA-Z0-9]"
                + "+([.][a-zA-Z]+)+");
		BufferedReader br = new BufferedReader(new FileReader("E:/core1206/token.txt"));
	System.out.println("done");
	}
}
