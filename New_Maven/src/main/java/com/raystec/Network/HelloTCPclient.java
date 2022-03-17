package com.raystec.Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class HelloTCPclient {

	public static void main(String[] args) throws Exception {
		Socket client = new Socket("localhost",3232);
		DataInputStream in = new DataInputStream(client.getInputStream());
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		out.writeBytes("Hello Server\n");
		
		String greeting = in.readLine();
		System.out.println(greeting);
		
		client.close();
	}
}
