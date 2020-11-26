package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {

	public LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel textLabel = new JLabel("����մϴ�");

		ImageIcon beauty = new ImageIcon("images/heart.png"); //�̹����ε�
		JLabel imageLabel = new JLabel(beauty);
		
		ImageIcon normalIcon =new ImageIcon("images/pressedicon.gif"); //�̹����ε�
		JLabel label = new JLabel("���������� ��ȭ�ϼ���",normalIcon,SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize (400,600);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new LabelEx();
	}

}