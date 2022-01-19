package com.raytesc.InOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Testserialization_WriteanObject {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("E:/core1206/kvg.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		Employee_Serialization emp = new Employee_Serialization(2, "naman", "kumar", "namanku", "nama123");
		
		out.writeObject(emp);
		out.close();
		
		System.out.println("Successfully persisted");
	}
}
