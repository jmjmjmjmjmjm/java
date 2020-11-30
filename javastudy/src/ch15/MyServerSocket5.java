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
	Vector<SocketThread> vc; // ��⿭ ť

	public MyServerSocket5() {
		try {
			serverSocket = new ServerSocket(10000);
			vc = new Vector<>();

			while (true) {
				System.out.println("��û ����� ...");
				Socket socket = serverSocket.accept();
				// 1. ���ο� ���� ����
				// 2. ���ο� ������ ����
				// 3. ���ο� ���������� socket ���� �ѱ��
				// 4. ���ο� ������ ��ü�� vc�� ���
				System.out.println("��û ���� ...");
				SocketThread st = new SocketThread(socket);
				st.start();
				vc.add(st);
			}

		} catch (Exception e) {
			System.out.println("���� ���� ����");
			e.printStackTrace(); // �����f���� ã�°� ���������� ���¿���
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
					// ��ü �޽��� ������
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
