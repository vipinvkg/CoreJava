package com.raytesc.InOutputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test_ReadPrimitiveData {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("E:/core1206/primitive.dat");
		DataInputStream in = new DataInputStream(file);
		
		System.out.println(in.read());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		in.close();
	}
}
