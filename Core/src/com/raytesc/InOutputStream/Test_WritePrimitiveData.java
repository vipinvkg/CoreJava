package com.raytesc.InOutputStream;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test_WritePrimitiveData {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("E:/core1206/primitive.dat");
		DataOutputStream out = new DataOutputStream(file);
		
		out.write(1);
		out.writeBoolean(true);
		out.writeChar('A');
		out.writeDouble(1.56);
		out.close();
		file.close();
		System.out.println("Successfully written");
		
	}
}
