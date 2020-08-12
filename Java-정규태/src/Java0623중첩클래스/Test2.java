package Java0623중첩클래스;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx extends Frame {
	
	public FrameEx() {
		// 프레임 제목
		super("Test v 1.0");
		//setTitle(title);
		
		// 레이아웃 변경 
		//setLayout(new FlowLayout());
		// -> 컴포넌트를 물이 흐르는 것 처럼 가로로 배치 방법
		// -> (왼쪽 -> 오른쪽, 위 -> 아래)
		
		// Frame 컨테이너의 기본 레이아웃은 보더 레이아웃이다.
		//setLayout(new BorderLayout());
		// -> 동, 서, 남, 북, 센터위치값을 가지고 지정 (위치값이 없을경우 센터)
		
		 setLayout(new GridLayout(1,5));
		// -> GridLayout (행, 열) -> 표의 모습을 처리
		 
		
		
		
		
		
		// 버튼 생성후 나중에 다시 속성을 변경가능 
		Button btn1 = new Button("Button 01");
		this.add(btn1);
		
		Button btn2 = new Button("Button 02");
		add(btn2);
		
//		add(new Button("Button03")); // 버튼의 정보가 필요없는 경우, 사실 이렇게 하믄 안됨
//		add(new Button("Button04"));
//		add(new Button("Button05"));
//		add(new Button("Button06"));
//		add(new Button("Button07"));
//		add(new Button("Button08"));
		
		
		add(new Button("Button03"), "North"); 
		add(new Button("Button04"), BorderLayout.WEST);
		add(new Button("Button05"));
		add("East", new Button("Button06"));
		add(BorderLayout.SOUTH, new Button("Button07"));
		
		System.out.println("this내용 -> " + this + " 가 가르키는것");
		
		// 프레임 크기
		setSize(400,200);
		// 화면 표시
		setVisible(true);
		
		// 종료 버튼 처리
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				// 프레임창 닫기
				dispose();
				// 프로세스 종료 (작업관리자-> 작업끝내기)
				System.exit(0);
			}
			
		});
		
	} //  Frame 클래스
}
public class Test2 {

	public static void main(String[] args) {

		// 자바 GUI => AWT(Abstract Window Toolkit)
		// => OS마다 표현되는 모습이 조금 다름
		// 컴포넌트 : AWT에서 사용되는 요소
		// 컨테이너 : 컴포넌트를 담는 공간(장소)
		// java.awt 패키지를 추가
		

		// Frame f = new Frame("ㅋㅋ");
		
//		System.out.println(f.getTitle());
//		f.setVisible(true);
//		f.setSize(400,200);
		
		new FrameEx();
		
		
	}

}
