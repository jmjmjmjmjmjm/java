//package ch10;
//
//import java.awt.BorderLayout;
//import java.awt.Container;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JTextField;
//
//public class LoginScreen extends JFrame {
//	
//	private LoginScreen loginScreen = this; //Context = 컨텍스트=스토커
//	private JTextField tfUsername;
//	private JButton btnLogin;
//
//	public LoginScreen() {
//		tfUsername = new JTextField("");
//		btnLogin = new JButton("로그인");
//
//		setTitle("LOGIN");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(400, 500);
//
//		Container c = getContentPane();
//		c.add(tfUsername, BorderLayout.CENTER);
//		c.add(btnLogin, BorderLayout.SOUTH);
//
//		initListener();
//
//		setVisible(true);
//	}
//
//	private void initListener() {
//		btnLogin.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String username = tfUsername.getText();
//				if(username.equals("ssar")) {
//					
//					new HomeScreen();
//					loginScreen.setVisible(false);
//				}else {
//					System.out.println("로그인 실패 : 아이디를 다시 입력하세요.");
//				}
//			}
//		});
//	}
//
//}