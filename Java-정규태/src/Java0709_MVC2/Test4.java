package Java0709_MVC2;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class FrameEx4 extends JFrame{
	public FrameEx4() {
		
		// 데이터
		// 1. 테이블에 저장될 데이터를 2차원 배열 저장, DB에 연결안하고 여기서 데이터할꺼라서 배열씀
		Object[][] data ={
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},
				{"홍길동", "010-1234-2431","user01@naver.com"},				
				{"홍길동", "010-1234-2431","user01@naver.com"}	
		};
		
		
		// 2. 열의 이름을 저장할 배열
		String[] colName={"이름", "전화번호", "e-mail"};
		
		// M역할
			
		
		/*******************************************************************/
		// 화면		V역할
		// 3. JTable 생성
		JTable table = new JTable(data, colName);
		
		// 4. 화면에 추가 (테이블에 JScrollPane추가 -> 프레임 추가)
		 add(new JScrollPane(table));
		// add(table);
		/*******************************************************************/
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
	} // 생성자
} // 클래스 
public class Test4 {

	public static void main(String[] args) {
		new FrameEx4();
		// Model2 개발 방식 (MVC 패턴)
		
				// Model1 -> Model2 변경
				// => 개발영역의 분리
				// Model : 비지니스로직(처리) - JAVA/DB
				// View : 처리화면 - html/jsp
				// Controller : 프로그램 제어 - Servlet
				
				// * JAVA GUI  -> JTable (MVC 패턴 사용)

	}

}
