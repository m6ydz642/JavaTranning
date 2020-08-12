package Java0625_프레임;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 버튼리스너 (클릭시 이벤트 처리)
class ButtonListener implements ActionListener {

	Frame frm = null;
	public ButtonListener () {
		
	}
	
public ButtonListener (Frame f) {
		this.frm = f;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 발생시 처리할 동작
		System.out.println("버튼 클릭!!!");
		// getActionCommand -> 이벤트 발생한 객체의 텍스트 정보를 가져옴
		System.out.println(e.getActionCommand());
		System.out.println("ActionListener_actionPerformed() 실행");
		// 버튼의 종류에 따라서 출력하는 메세지를 변경
		// RED-"빨간색 버튼 클릭!!!", BLUE-"파랑색 버튼 클릭!!!"

		if (e.getActionCommand().equals("red")) {
			System.out.println("빨간색 버튼 클릭");

			frm.setBackground(Color.red);
			
		} else if (e.getActionCommand().equals("blue")) {
			System.out.println("블루 버튼 클릭");
			frm.setBackground(Color.blue);
		} else {
			System.out.println("...");
		}

	}

}

class FrameEx1 extends Frame {
	Button redBtn, blueBtn, back;

	public FrameEx1() {
		super("이벤트 처리");

		// 레이아웃 변경
		setLayout(new FlowLayout());
		// setLayout(new GridLayout(1, 2)); // 그리드 잠시 주석
		this.setBackground(Color.DARK_GRAY);
		
		// 버튼 객체 2개 생성
		redBtn = new Button("red");
		blueBtn = new Button("blue");
		// 버튼 리스너에 프레임 정보를 전달
		/*ButtonListener handler = new ButtonListener();
		 * handler.frm = this; // 프레임 정보
		 * */

		ButtonListener handler = new ButtonListener(this);
		
		
		redBtn.addActionListener(handler);
		blueBtn.addActionListener(handler);

		// 프레임에 추가
		this.add(redBtn, BorderLayout.EAST);
		add(blueBtn, BorderLayout.WEST);

		setSize(400, 300);
		setVisible(true);

		addWindowFocusListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); // 프레임창 종료함수
				System.exit(0); // 프로세스 종료
				super.windowClosing(e);
			}
		});

	}

}

public class Test1 {

	public static void main(String[] args) {
		new FrameEx1();
		// GUI환경에서는 화면을 구현하는 부분, 이벤트를 처리하는 부분이 완전 분리
		// 이벤트(event) : 프로그램과 사용자 사이에서 발생하는 일
		// => 키보드,마우스를 사용해서 해당 프로그램에 특정 요구/동작을 발생
		// 이벤트 리스너 (event listener) : 이벤트 발생을 기다리다가 이벤트가 발생해서
		// 이벤트 소스 객체가 전달되면 적당한 처리를 하는 객체
		// 이벤트 소스 (event source) : 이벤트가 발생한 컴포넌트(버튼,스크롤바..)

	}

}
