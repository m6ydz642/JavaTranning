package Java0703;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class FrameEx1 extends JFrame {

	JLabel la;

	public FrameEx1() {
		setTitle("스윙 연습하기");
		setLayout(new FlowLayout());
		la = new JLabel("Enter키 입력시 배경색 변경");
		this.add(la);

		// 프레임에 이벤트 -> 키 이벤트 처리
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("이벤트 동작");
			
					int r = (int) (Math.random() * 256);
					int g = (int) (Math.random() * 256);
					int b = (int) (Math.random() * 256);

					// System.out.println(r + " " + g + " " + b);
					if (e.getKeyChar() == '\n') {
						// System.out.println("엔터 동작");
						System.out.println(e.getKeyChar() + "키 동작"); // 안나오넹
						la.setText(r + " " + g + " " + b);
						getContentPane().setBackground(new Color(r, g, b));
						// getContentPane - 직접접근
				}
					if (e.getKeyChar() == 'q') {
						JOptionPane.showMessageDialog(getContentPane(), "종료합니다"); // 직접접근
														// 원래는 this 인데 this 가 가르키는곳이 익명클래스 라서
					System.exit(0);
					}
			}	
			// Swing에서는 컨테이너(프레임) 위에 ContentPane객체를 사용해서
			// 해당 컴포넌트를 추가
			// * 익명클래스 내부에서 해당 프레임에 접근 this(사용x)
			// => getContentPane() 사용해서 접근
			

		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}

}

public class Test1 {

	public static void main(String[] args) {
		new FrameEx1();

	}

}
