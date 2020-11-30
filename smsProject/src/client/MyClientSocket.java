package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket {

	private Socket socket;
	public MyClientSocket() {
		try {
			socket = new Socket("localhost",10000);
			//Ű����κ����Է¹޾Ƽ�
			Scanner sc = new Scanner(System.in);
			
			//��Ĺ�� ���۴��(����)
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String input = sc.nextLine();
				//������ ����
				bw.write(input+ "\n");
				bw.flush();
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		new MyClientSocket();

	}

}
