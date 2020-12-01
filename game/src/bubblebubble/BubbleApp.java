package bubblebubble;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleApp extends JFrame implements Initable {

	private BubbleApp bubbleApp = this; // 컨텍스트 저장

	private static final String TAG = "BubbleApp"; // 태그
	private JLabel la_background;
	private Player player;

	public BubbleApp() {
		init();
		setting();
		batch();
		listener();

	}

	public static void main(String[] args) {
		new BubbleApp();
	}

	public void init() {
		la_background = new JLabel(new ImageIcon("images/bg.png"));
		player = new Player();
	}

	public void setting() {
		setTitle("버블버블");
		setSize(1000, 639);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		setContentPane(la_background);
	}

	public void batch() {
		add(player);
	}

	public void listener() {
		addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					player.moveRight();
				}
				if (e.getKeyCode()==KeyEvent.VK_LEFT) {
					player.moveLeft();
				}
				if (e.getKeyCode()==KeyEvent.VK_UP){
					player.moveJump();
				}
				if (e.getKeyCode()==KeyEvent.VK_DOWN){
					player.moveDown();
				}
					
				}

			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					player.isRight = false;
				}
				if (e.getKeyCode()==KeyEvent.VK_LEFT) {
					player.isLeft=false;
				}

			}

		});

	}
}
