package chat;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.sound.sampled.Line;

public class ChatServer {

	private static final String TAG = "ChatServer";
	private ServerSocket serverSocket;
	private Vector<Clientinfo> vc; // ����� Ŭ���̾�Ʈ Ŭ������ ������ ��� �÷���

	public ChatServer() {

		try {
			vc = new Vector<>();
			serverSocket = new ServerSocket(10000);
			System.out.println(TAG + "Ŭ���̾�Ʈ ��������...");

			// ���ξ������ǿ���
			while (true) {
				Socket socket = serverSocket.accept();
				Clientinfo clientinfo = new Clientinfo(socket);
				clientinfo.start();
				vc.add(clientinfo);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	class Clientinfo extends Thread {
		Socket socket;
		BufferedReader reader;
		PrintWriter writer; // BufferedWriter�� �ٸ����� �������� �Լ�������

		public Clientinfo(Socket socket) {
			this.socket = socket;
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream(), true);
				System.out.println("�����");
			} catch (Exception e) {
				System.out.println("���� ���� ����" + e.getMessage());
			}
		}

		@Override // Ŭ���̾�Ʈ�κ��� ���� �޽����� ��� Ŭ���̾�Ʈ���� ������
		public void run() {
			try {

				FileWriter fout = new FileWriter("d:\\test\\chat.txt");
				String id = null;
				id = reader.readLine();

				String input = null;
				while ((input = reader.readLine()) != null) {
					fout.write(input);
					for (Clientinfo clientinfo : vc) {
						clientinfo.writer.println(id + " : " + input);

					}

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		new ChatServer();

	}

}
