package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ChattClient {
	
	// 키보드로 입력받은 데이터를 읽어서 서버로 보낸다.
	// 다시 서버가 보낸 메세지를 받아서 클라이언트 자신의 콘솔창에 출력한다.

	public static void main(String[] args) {
		
		try {
			
			InetAddress ip = InetAddress.getLocalHost();  // 본인의 IP 주소 찾는 방법
			
			// 1. 소켓 생성
//			Socket s = new Socket("192.168.10.34", 60000);   
			Socket s = new Socket(ip.getHostAddress(), 60000);
			
			
			// 2. 스트림			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			// BufferedReader, InputStreamReader 추가
			BufferedReader brs = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			while(true) {
				String line = br.readLine();
				pw.println(line); //  서버한테 보내기

				System.out.println("내가 보낸 메세지 : " + brs.readLine());
			}

		} catch (IOException e) {
			System.out.println("서버와의 연결이 끊어졌습니다...");
		} 

	}

}
