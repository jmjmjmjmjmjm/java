package ch13;

public class 쓰레드03 {

	static int sum = 0;

	static class NewThread implements Runnable {

		@Override
		public void run() {
			System.out.println("새로운 스레드 시작");
			for (int i = 1; i < 11; i++) {
				sum = sum + 10;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("새로운 스레드 끝");
		}

	}

	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		Thread t1 = new Thread(new NewThread()); // 타겟
		t1.start();
		
		try {
			t1.join(); //t1이 끝날때까지 대기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sum);
		System.out.println("메인 스레드 종료");
	}

}
