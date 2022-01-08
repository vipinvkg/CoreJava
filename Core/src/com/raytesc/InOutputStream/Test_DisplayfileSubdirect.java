package com.raytesc.InOutputStream;

import java.io.File;

public class Test_DisplayfileSubdirect {

	public static void main(String[] args) {
		File directory = new File ("E:/core1206");
		
		String [] list = directory.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println((i+1) + ":" + list[i]);
		}
	}
}
