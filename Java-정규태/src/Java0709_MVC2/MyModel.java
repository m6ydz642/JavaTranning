package Java0709_MVC2;

import javax.swing.table.AbstractTableModel;

// Model 역할
// 1. AbstractTableModel 타입의 서브클래스로 생성 

public class MyModel extends AbstractTableModel{

	// 2. 테이블에 저장될 데이터 2차원 배열로 생성 
	
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
	
	// 열의 이름을 저장하는 배열
	String[] colName={"이름", "전화번호", "e-mail"};
	
	
	// 3. 모델 객체에 필요한 동작을 구현
	
	@Override
	public int getRowCount() {
		// 표현할 행의 수
		return data.length;
	}

	@Override
	public int getColumnCount() {
		// 표현할 열의 수
		return data[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// 특정 위치에 있는 객체를 리턴
		return data[rowIndex][columnIndex];
	}

	
	// 열의 이름을 사용
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return colName[column];
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return columnIndex != 0? true:false; // 열의 개수가 0이 아니면 수정가능 0이면 데이터가없으니까 수정 불가
	}

	// 테이블 내용 수정 하기 
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) { // 수정해주는 메서드
		// TODO Auto-generated method stub
		data[rowIndex][columnIndex] = aValue; // aValue -> 테이블에서 수정한 값
	}
	
	// 셀 수정 처리 
	
	
	
	
}
