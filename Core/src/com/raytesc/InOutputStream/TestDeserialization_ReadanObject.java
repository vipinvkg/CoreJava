package com.raytesc.InOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestDeserialization_ReadanObject {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("E:/core1206/kvg.ser");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Employee_Serialization emp = (Employee_Serialization) in.readObject();
		System.out.println(emp.getId());
		System.out.println(emp.getFname());
		System.out.println(emp.getLname());
		System.out.println(emp.getLoginid());
		System.out.println(emp.getPassword());
        	
	}
}
