package com.raystec.Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloTCPServer {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(4678);
		Socket client = server.accept();
		System.out.println("server started");
		DataInputStream in = new DataInputStream(client.getInputStream());
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		String greeting = in.readLine();
		
		System.out.println(greeting);
		
		out.writeBytes("Hello client\n");
		client.close();
		server.close();
		
	}
}
