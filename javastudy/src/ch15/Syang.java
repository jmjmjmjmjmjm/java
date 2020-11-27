package ch15;
//�����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Syang {
	ServerSocket serverSocket = null;
	Socket socket = null;
	BufferedReader reader = null;
	PrintWriter writer = null;

	public Syang() {
		try {
			serverSocket = new ServerSocket(10000);
			System.out.println("Ŭ���̾�Ʈ�κ��� ���� ���.");
			socket = serverSocket.accept();
			System.out.println("��û����.");

			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());

			Thread t1 = new Thread(new WriterThread());
			t1.start();

			String line = null;

			while ((line = reader.readLine()) != null) {
				System.out.println("Ŭ�� : " + line);
			}

			reader.close();
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	class WriterThread extends Thread {

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			while (true) {
				String line = sc.nextLine();
				writer.println(line);
				writer.flush();
			}
		}
	}

	public static void main(String[] args) {
		new Syang();
	}

}
