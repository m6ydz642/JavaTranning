
package Java0702;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class FrameEx1 extends JFrame {

	JButton btn1, btn2, btn3, btn4;

	JCheckBox ck1, ck2, ck3;
	
	
	public FrameEx1() {
		super("스윙테스트");

		setLayout(new FlowLayout());
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼2");
		btn3 = new JButton("버튼3");
		btn4 = new JButton("버튼4");
		

		
		// 프레임에 추가
		add(btn1);
		add(btn2);
		add(btn3);
		
		
		// 이벤트 처리(익명클래스)
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 1번 클릭");

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 2번 클릭");

			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 3번 클릭");

			}
		});

		// 창 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// -> 윈도우창 강제 종료
		// setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		// -> 윈도우창 종료시 모든 자원을 반납
		// setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		// -> 윈도우창 종료시 아무일도 하지 않음
		// setDefaultCloseOperation(HIDE_ON_CLOSE);
		// -> 윈도우창 종료시 윈도우 숨기기

		setSize(300, 200);
		setVisible(true);

	}

}

public class Test1 {

	public static void main(String[] args) {

		// Swing (스윙) : 자바에서 제공하는 GUI 도구
		// -> OS 종속적이지 않음. AWT보다 조금더 다양한 형태의 기능 제공
		// -> AWT 클래스에서 J 추가해서 사용

		// JDK4.0 : JFrame을 사용하기 위해서 ContentPane을 사용해야함.

		// JFC(Java Foundation Class) : AWT,Swing,자바2D,Accessility,드래그엔 드롭

		new FrameEx1();

	}

}
