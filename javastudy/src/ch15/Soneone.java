package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Soneone {

	ServerSocket serverSocket = null; // 스트림 연결소켓
	Socket socket = null; // 채팅을 실질적으로 하는 소켓
	BufferedReader reader = null; // 받는것

	public Soneone() {
		try {
			serverSocket = new ServerSocket(10000); // 10000=포트번호

			System.out.println("클라로부터 접속대기중.");
			socket = serverSocket.accept();
			System.out.println("요청완료.");

			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String line = null;

			while ((line = reader.readLine()) != null) {
				System.out.println("클라이언트 : " + line);
			}

			reader.close();
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Soneone();
	}

}
