package Java0623중첩클래스;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;

class FrameEx2 extends Frame {
	
	// 패널 : 여러개의 컴포넌트를 그룹별로 묶어서
	// 사용하는 컨테이너 / 컴포넌트
	
	Panel p1,p2;
	
	public FrameEx2() {
		super("Frame v1.2");
		
		
		// 보더레이아웃 적용
		setLayout(new BorderLayout());
		
		
		// 패널 객체 생성
		p1 = new Panel();
		p2 = new Panel();
		// 북 - 버튼1
		p1.add(new Button("btn01"));
		p1.add(new Button("btn01-1"));
		p1.setBackground(Color.CYAN);
		
		p2.add(new Button("btn01"));
		p2.add(new Button("btn01-1"));
		
		p2.setBackground(Color.YELLOW);
		// 프레임에 추가
		add(p1, BorderLayout.NORTH);
		
	// -> 패널 객체를 생성
		
	/*	// 북 - 버튼1
		add(new Button("NorthButton"), "North"); 
		// 센터 - 버튼1
		add(new Button("CenterButton"), "Center"); 
		// 남 - 버튼1
		add(new Button("SouthButton"), "South"); 
		
*/
		setSize(400, 200);
		setVisible(true);

		// 종료 버튼 처리
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 프레임창 닫기
				dispose();
				// 프로세스 종료 (작업관리자->작업끝내기)
				System.exit(0);
			}
		});

	}
}


public class Test3 {

	public static void main(String[] args) {

		new FrameEx2();


	}

}
