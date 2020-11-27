package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Sdaonda {

	ServerSocket serverSocket;
	Vector<SocketThread> vc;

	public Sdaonda() {
		try {
			serverSocket = new ServerSocket(20000);
			vc = new Vector<>();

			while (true) {
				System.out.println("요청대기");
				Socket socket = serverSocket.accept();
				System.out.println("요청 받음.");
				SocketThread st = new SocketThread(socket);
				st.start();
				vc.add(st);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class SocketThread extends Thread {
		Socket socket;
		String id;
		BufferedReader reader;
		PrintWriter writer;

		public SocketThread(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream(), true);
				String line = null;
				while ((line = reader.readLine()) != null) {
					System.out.println("from client :" + line);
					for (SocketThread socketThread:vc) {
						socketThread.writer.println(line);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		new Sdaonda();
	}

}
