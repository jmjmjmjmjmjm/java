//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.Vector;
//
//import com.google.gson.Gson;
//
//import protocol.Chat;
//import protocol.RequestDto;
//
//public class MyServerSocket5 {
//	
//	private ServerSocket serverSocket;
//	Vector<SocketThread> vc; // 대기열(큐)
//	
//	public MyServerSocket5() {
//		try {
//			serverSocket = new ServerSocket(10000);
//			vc = new Vector<>();
//		
//			while(true) {
//				System.out.println("요청 대기중 ...");
//				Socket socket = serverSocket.accept();
//				// 1. 새로운 소켓 생성 socket
//				// 2. 새로운 스레드 생성
//				// 3. 새로운 스레드한테 socket 변수 넘기기
//				// 4. 새로운 스레드 자체를 vc에 담기
//				System.out.println("요청 받음 ...");
//				SocketThread st = new SocketThread(socket);
//				st.start();
//				vc.add(st);
//			}
//		} catch (Exception e) {
//			System.out.println("서버 연결 오류");
//			e.printStackTrace();
//		}
//	}
//	
//	class SocketThread extends Thread {
//		
//		private Socket socket;
//		private String id;
//		private BufferedReader reader;
//		private PrintWriter writer;
//		
//		public SocketThread(Socket socket) {
//			this.socket = socket;
//		}
//
//		@Override
//		public void run() {
//			try {
//				reader = 
//						new BufferedReader(new InputStreamReader(socket.getInputStream()));
//				writer = new PrintWriter(socket.getOutputStream());
//				
//				String input = null;
//				while((input = reader.readLine()) != null) {
//					// Routing (라우팅 하기)
//					Gson gson = new Gson();
//					RequestDto dto = gson.fromJson(input, RequestDto.class);
//					routing(dto); 
//				}
//						
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//		private void routing(RequestDto dto) {
//			if(id == null) {
//				if(dto.getGubun().equals("ID")) { // ID:ssar1
//					// 변수에 ID 저장
//					id = dto.getMsg();
//					writer.println("당신의 아이디는 "+id+"입니다.");
//					writer.flush();
//				}else {
//					writer.println("아이디를 먼저 입력하세요!");
//					writer.flush();
//					return;
//				}
//			}
//			
//			if(dto.getGubun().equals(Chat.ALL)) { // 전체채팅 ALL:안녕
//				for (int i = 0; i < vc.size(); i++) {
//					if(vc.get(i) != this) {
//						vc.get(i).writer.println(id+"-->"+dto.getMsg());
//						vc.get(i).writer.flush();
//					}
//				}
//			} else if(dto.getGubun().equals(Chat.MSG)) { // MSG:ssar1:안녕
//				String tempId = dto.getId();
//				String tempMsg = dto.getMsg();
//				
//				for (int i = 0; i < vc.size(); i++) {
//					if(vc.get(i).id != null && vc.get(i).id.equals(tempId)) {
//						vc.get(i).writer.println(id+"-->"+tempMsg);
//						vc.get(i).writer.flush();
//					}
//				}
//			} 
//		}
//		
//	} // End of SocketThread
//	
//	public static void main(String[] args) {
//		new MyServerSocket5();
//	}
//}
//
//
