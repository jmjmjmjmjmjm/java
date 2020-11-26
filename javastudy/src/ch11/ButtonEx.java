package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame {
	
	public ButtonEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon normalIcon = new ImageIcon("images/normalicon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressdIcon = new ImageIcon("images/pressedIcon.gif");

		JButton btn = new JButton("call~", normalIcon);
		btn.setPressedIcon(pressdIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);
		
		setSize(300,250);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ButtonEx();
	}

}
