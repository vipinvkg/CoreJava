package com.raytesc.InOutputStream;

import java.io.File;
import java.util.Date;

public class TestIO_Attrib {

	public static void main(String[] args) {
		
		File f = new File("E:/core1206/hello.txt");
		if(f.exists()) {
			
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.canExecute());
			System.out.println(f.isFile());
			System.out.println(f.isDirectory());
			System.out.println(new Date(f.lastModified()));
			System.out.println(f.length());
		}
	}
}
