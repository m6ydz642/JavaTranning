package Java0528;

import java.util.Vector;

class Point {
	private int x, y;
	public Point() { }
	
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return x + ", " + y;
	}	
		
	}

public class Test4 {

	public static void main(String[] args) {

		// Point클래스 -> 생성
		
		// Vector 생성: (x,y) 좌표를 저장하는 클래스 Point를 저장하는 객체 
		
		// 좌표 3개 입력  (2,3) , (-5,20), (30,-8)
		// => 모든 요소의 정보 출력 (좌표 형태로 정보 출력)
		
		// 1번 인덱스에 들어있는 좌표 삭제 
		
	
		// 1번 인덱스에 좌표값 입력(100,200)
		// => 모든 요소의 정보 출력 (좌표 형태로 정보 출력)
		Vector<Point> 포인트 = new Vector<Point>();

		포인트.add(new Point (2,3));
		포인트.add(new Point (-5,20));
		포인트.add(new Point (30,8));
		
	    포인트.remove(1);	
//		Point p1 = new Point(2,3);
//		p1.setX(2);
//		p1.setY(3);
		System.out.println(포인트.toString());
		
		포인트.add(1, new Point(100,200));
		System.out.println(포인트);
		
		포인트.clear();
		System.out.println(포인트);
			
		
	}

	

}
