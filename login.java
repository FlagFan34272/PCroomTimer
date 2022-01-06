package day2;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class SwingLogin extends JFrame{
	private JPanel loginPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 1));
	private JLabel idLabel = new JLabel("아이디 "); 
	private JLabel pwLabel = new JLabel("비밀번호 ");
	private JTextField idText = new JTextField();
	private JPasswordField pwText = new JPasswordField();
	private JButton loginBtn = new JButton("로그인");
	private JButton idpwSearchBtn = new JButton("아이디/비밀번호 찾기");
	private JLabel menuBar = new JLabel(new ImageIcon(SwingLogin.class.getResource("../images/menuBar.jpg")));

	

	public SwingLogin() {
		super("로그인 창!");
		setUndecorated(true);
		
      int length = 100;

		
		this.setContentPane(loginPanel);
		loginPanel.add(menuBar);
		loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
		loginPanel.add(idLabel);
		loginPanel.add(idText);
		loginPanel.add(pwLabel);
		loginPanel.add(pwText);
		loginPanel.add(loginBtn);
		loginPanel.add(Box.createVerticalStrut(20));
		loginPanel.add(idpwSearchBtn);
		loginPanel.add(Box.createVerticalStrut(50));
		
		
		//라벨 가운데 정렬
		idLabel.setHorizontalAlignment(NORMAL);
		pwLabel.setHorizontalAlignment(NORMAL);
		
		
		

		
		
		
		
		//현재 프레임 창 가운데 정렬 setSize를 먼저 해주어야 정상적으로 프레임이 가운데 정렬이 됨!
		setSize(2050,1100);
		this.setLocationRelativeTo(null);		
		
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		
		
		//로그인 버튼을 눌렀을때
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//아이디 비번 확인 테스트 코드~
				String id = idText.getText().trim();
				String pw = pwText.getText().trim();
				
				if(id.length()==0 || pw.length()==0) {
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 입력 하셔야 됩니다.", "아이디나 비번을 입력!", JOptionPane.DEFAULT_OPTION);
					return;
				}
				
				if(id.equals("oswosw0812") && pw.equals("oswosw11_0812")) {
					JOptionPane.showMessageDialog(null, "로그인 성공, 사용시간 카운팅 시작!", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
					System.exit(0);
				}
				
				JOptionPane.showMessageDialog(null, "로그인 실패", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
				
			}
		});
		
		//아이디 비밀번호 찾기 버튼을 눌렀을때
		idpwSearchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "ID:oswosw0812, PW:oswosw11_0812", "아이디/비밀번호 찾기", JOptionPane.DEFAULT_OPTION);
			}
		});
		
	}
	

	public static void main(String[] args) {
		new SwingLogin();

	}
}

