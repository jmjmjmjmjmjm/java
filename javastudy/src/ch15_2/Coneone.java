package ch15_2;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Coneone {

	Socket socket = null;
	PrintWriter writer = null;

	public Coneone() {
		try {
			socket = new Socket("localhost", 10000);

			writer = new PrintWriter(socket.getOutputStream());

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

	public static void main(String[] args) {
		new Coneone();
	}

}
