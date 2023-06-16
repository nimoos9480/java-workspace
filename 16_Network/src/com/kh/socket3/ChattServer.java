package com.kh.socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChattServer {

	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(60000);
			System.out.println("클라이언트 기다리는 중~~!!");
			
			// 여러명 입장위한 스레드, 소켓 필요
			while(true) {
				Socket socket = serverSocket.accept();
				ClientThread clientThread = new ClientThread(socket);
				clientThread.start();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class ClientThread extends Thread {
	
	Socket socket;
	BufferedReader br;
	PrintWriter pw;
																		// 동기화! 동시작업 시 롹 걸기
	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>()) ;  // 다른 사람들의 것까지 담아서 넘기기 위해 생성
	
	public ClientThread(Socket socket) {
		this.socket = socket;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			list.add(pw);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sendAll(String message) {
		for(PrintWriter pw : list) {
			pw.println(message);
			pw.flush();
			
		}
	}
	
	public void run() {
		String login = socket.getInetAddress() + "님이 접속하셨습니다^__^";
		System.out.println(login);
		sendAll(login);

		try {
			while (br != null) {

				String line = br.readLine();
				System.out.println("[" + socket.getInetAddress() + "] 가 보낸 메세지 : " + line); // 서버에도 메세지가 보이고 싶다면
				sendAll("[" + socket.getInetAddress() + "] 가 보낸 메세지 : " + line);

			}
		} catch (IOException e) {
			System.out.println(socket.getInetAddress() + "님이 나가셨습니다ㅠ__ㅠ");
		}

	}
}







