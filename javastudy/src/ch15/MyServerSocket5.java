package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

import protocol.Chat;

public class MyServerSocket5 {

	private ServerSocket serverSocket;
	Vector<SocketThread> vc; // 대기열 큐

	public MyServerSocket5() {
		try {
			serverSocket = new ServerSocket(10000);
			vc = new Vector<>();

			while (true) {
				System.out.println("요청 대기중 ...");
				Socket socket = serverSocket.accept();
				// 1. 새로운 소켓 생성
				// 2. 새로운 쓰레드 생성
				// 3. 새로운 쓰레드한테 socket 변수 넘기기
				// 4. 새로운 쓰레드 자체를 vc에 담기
				System.out.println("요청 받음 ...");
				SocketThread st = new SocketThread(socket);
				st.start();
				vc.add(st);
			}

		} catch (Exception e) {
			System.out.println("서버 연결 오류");
			e.printStackTrace(); // 오류봣을때 찾는거 위에서부터 보는오류
		}

	}

	class SocketThread extends Thread {

		private Socket socket;
		private String id;
		private BufferedReader reader;
		private PrintWriter writer;

		public SocketThread(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream());

				String input = null;
				while ((input = reader.readLine()) != null) {
					// 전체 메시지 보내기
					routing(input);

				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		}

		private void routing(String input) {
			
			
			String gubun[] = input.split(":");
			if (gubun[0].equals(Chat.ALL)) {
				for (int i = 0; i < vc.size(); i++) {
					if (vc.get(i) != this) {
						vc.get(i).writer.println(id + "-->" + gubun[1]);
						vc.get(i).writer.flush();
					}
				}

			} else if (gubun[0].equals(Chat.MSG)) {
				String tempId = gubun[1];
				String tempMsg = gubun[2];

				for (int i = 0; i < vc.size(); i++) {
					if (vc.get(i).id.equals(tempId)) {
						vc.get(i).writer.println(id + "-->" + tempMsg);
						vc.get(i).writer.flush();
					}
				}

			}else if (gubun[0].equals(Chat.ID)) {
				String tempId = gubun[0];
				for (int i = 0; i < vc.size(); i++) {
					if (vc.get(i).id.equals(tempId)) {
						vc.get(i).writer.println(tempId + "-->" + gubun[1]);
						vc.get(i).writer.flush();
					}
				}
			}

		}

	}

	public static void main(String[] args) {
		new MyServerSocket5();

	}

}
