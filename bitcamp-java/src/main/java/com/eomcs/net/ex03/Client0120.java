package com.eomcs.net.ex03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client0120 {
	  try (Scanner keyboard = new Scanner(System.in);
		        ServerSocket serverSocket = new ServerSocket(8888)) {

		      System.out.println("클라이언트의 연결을 기다리고 있음.");
	
	try(Socket socket = serverSocket.accept();
	DataOutputStream out = new DataOutputStream(socket.getOutputStream());
	DataInputStream in = new DataInputStream(socket.getInputStream())){
		
		
		System.out.println("클라이언트가 보낸 int값을 기다리고있음");
		
		int value =in.readInt();
		System.out.println(value);
		
		System.out.print("데이터를 보내기전에 잠깐");
		keyboard.nextLine();
		
		out.writeInt(value);
		System.out.println("클");
	}
		
		
	}
			
			
	
			
			
			
			
			
}
