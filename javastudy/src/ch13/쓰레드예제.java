package ch13;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ch09.Batch;

class Swing01 extends JFrame {

	public Swing01() {
		setSize(300, 400);
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JLabel la = new JLabel();
		
		f.add(p, Batch.CENTER);
		p.add(la);
		
		int num = 0;
		while (true) {
			num++;
			la.setText(Integer.toString(num));
			setVisible(true);
		}

	}

}

public class 쓰레드예제 extends Thread {
	@Override
	public void run() {
		new Swing01();
	}

	public static void main(String[] args) {
		Thread t1 = new 쓰레드예제();
		t1.start();

	}
}
