package Java0703;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class FrameEx4 extends JFrame implements ActionListener {
	
	
	String[] txt = {"+2", "-1", "%4" };
	JLabel la;
	JButton[] btn = new JButton[3];
	public FrameEx4() {
		// setLayout(new FlowLayout() );
		
		// 문제 (1~60) 
		int num = (int)(Math.random() * 60 + 1);
		
		
		JPanel p = new JPanel();
		la = new JLabel("숫자가 표시 됩니다");
		la.setText(num + " ");
		la.setFont(new Font("Gothic", Font.BOLD, 25));
		
		
		p.add(la);
		this.add(p); // flowlayout안쓰고 가운데 정렬하기
		
		// 버튼 생성 -> 프레임 추가
		
		JPanel p2 = new JPanel();
		
		for (int i=0; i<3; i++) {
			btn[i] = new JButton(txt[i]);
			p2.add(btn[i]);
			this.add(p2, BorderLayout.SOUTH);
			btn[i].addActionListener(this); // 버튼에 리스너 연결
			
			
		}
		
		
		
		this.addKeyListener(new KeyAdapter()

		{

			
			@Override
			public void keyPressed(KeyEvent e) {
				// F1증가, F2 감소 (키를 눌렀을때)
				System.out.println("keypress");
				if (e.getKeyCode() == KeyEvent.VK_F1) {
					setSize(getWidth() + 10, getHeight() + 10);
				}
				if (e.getKeyCode() == KeyEvent.VK_F2) {
					setSize(getWidth() - 10, getHeight() - 10);
				}

				
				switch (e.getKeyCode()) {
				case  KeyEvent.VK_F3:
					setSize(getWidth() + 1000, getHeight() + 1000);
					break;
				case KeyEvent.VK_F4:
					setSize(getWidth() - 1000, getHeight() - 1000);
				default:
					break;
				}
				
				
				
			}
		

		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 클릭시 이벤트 처리
		System.out.println("클릭");
		
 
		int n = Integer.parseInt(la.getText()); // 문제의 값을 가져오기
		System.out.println(n);
		// 버튼 구분 (+2, -1, %4)
		
		switch(e.getActionCommand() ) { // 버튼위에 라벨의 값을 가져오기
		case "+2" :
			n += 2;
			break;

		case " -1 ":
			n --;
			break;

		case "%4 ":
			n %= 4;
			break;
		}
		System.out.println("n : " + n);
		la.setText(n + " ");

	}
	
}

public class Test4_망함 {

	public static void main(String[] args) {
		new FrameEx4();

	}

}
