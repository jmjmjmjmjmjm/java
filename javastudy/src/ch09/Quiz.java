package ch09;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz extends JFrame {

	public void Quiz() {
		setTitle("�ǽ�");
		setSize(200, 800);

		Container n = getContentPane();
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		

		
		n.add(btn1, MyLayout.WEST.getValue());
		n.add(btn2, Batch.CENTER);
		n.add(btn3, Batch.NORTH);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Quiz();

	}

}