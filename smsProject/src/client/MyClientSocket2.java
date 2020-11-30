package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket2 {

	private Socket socket;
	private Scanner sc;
	private BufferedWriter writer;
	private BufferedReader reader;

	public MyClientSocket2() {
		try {
			socket = new Socket("localhost", 10000);
			// 키보드로부터입력받아서
			sc = new Scanner(System.in);

			// 소캣에 버퍼담기(쓰기)
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			new Thread(new Runnable() {

				@Override
				public void run() {
					String input = null;
					try {
						while ((input = reader.readLine()) != null) {
							System.out.println("서버로부터온 메시지 : " + input);
						}
					} catch (Exception e) {
						// TODO: handle exception
					}

				}
			}).start();

			// 메인쓰레드는 키보드로부터 입력을 받은뒤 클라이언트 소켓에 전송
			while (true) {
				String input = sc.nextLine();
				// 서버에 전송
				writer.write(input + "\n");
				writer.flush();

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MyClientSocket2();

	}

}
