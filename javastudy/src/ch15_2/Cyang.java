package ch15_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cyang {

	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;

	public Cyang() {
		try {
			socket = new Socket("localhost", 10000);

			writer = new PrintWriter(socket.getOutputStream());
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			Thread t1 = new Thread(new ReaderThread());
			t1.start();

			Scanner sc = new Scanner(System.in);

			while (true) {
				String line = sc.nextLine();
				writer.println(line);
				writer.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	class ReaderThread implements Runnable {
		@Override
		public void run() {
			String line = null;
			try {
				while ((line = reader.readLine()) != null) {
					System.out.println("¼­¹ö : " + line);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		new Cyang();
	}

}
