package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Soneone {

	ServerSocket serverSocket = null; // ��Ʈ�� �������
	Socket socket = null; // ä���� ���������� �ϴ� ����
	BufferedReader reader = null; // �޴°�

	public Soneone() {
		try {
			serverSocket = new ServerSocket(10000); // 10000=��Ʈ��ȣ

			System.out.println("Ŭ��κ��� ���Ӵ����.");
			socket = serverSocket.accept();
			System.out.println("��û�Ϸ�.");

			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String line = null;

			while ((line = reader.readLine()) != null) {
				System.out.println("Ŭ���̾�Ʈ : " + line);
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
