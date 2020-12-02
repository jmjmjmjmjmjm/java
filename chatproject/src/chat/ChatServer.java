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
	private Vector<Clientinfo> vc; // 연결된 클라이언트 클래스에 소켓을 담는 컬렉션

	public ChatServer() {

		try {
			vc = new Vector<>();
			serverSocket = new ServerSocket(10000);
			System.out.println(TAG + "클라이언트 연결대기중...");

			// 메인쓰레드의역할
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
		PrintWriter writer; // BufferedWriter와 다른점은 내려쓰기 함수를지원

		public Clientinfo(Socket socket) {
			this.socket = socket;
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream(), true);
				System.out.println("연결됨");
			} catch (Exception e) {
				System.out.println("서버 연결 실패" + e.getMessage());
			}
		}

		@Override // 클라이언트로부터 받은 메시지를 모든 클라이언트에게 재전송
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
