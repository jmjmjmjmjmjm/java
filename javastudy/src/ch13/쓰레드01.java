package ch13;

class Another implements Runnable { // Runnable 타입이 되어야함.
	
	// 실행단위 코드블록 = 스택(스레드)
	public void run() {
		System.out.println("새로운 스레드 실행됨");
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("new :" + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("새로운 스레드 종료.");

	}
}

public class 쓰레드01 {

	public static void main(String[] args) {
		System.out.println("메인 스레드 실행됨");

		// 새로운 스레드 실행
		// 1.스레드 객체생성
		// 2. 타겟 설정
		// 3. 실행
		
		Thread t1 = new Thread(new Another());
		t1.start(); //독립적인스레드실행

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("main :" + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main 스레드 종료.");

	}

}
