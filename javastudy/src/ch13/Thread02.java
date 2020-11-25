package ch13;

class NewThread extends Thread{
	@Override
	public void run() {
		System.out.println("새로운 스레드");
	}
}


public class Thread02 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread());
		t1.start();
		
		NewThread t2 = new NewThread();
		t2.start();
	}

}
