package Java0522;

import java.awt.Color;
import java.util.Scanner;

interface Addinterface {
public abstract void add (int n);
void add(int n, int m);
}

class SubAdd implements Addinterface {

	@Override
	public void add(int n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int n, int m) {
		// TODO Auto-generated method stub
		
	}
	
}

/* 계산기 객체 
 * +, - 처리하는 객체
 * */
abstract class Calculator {
	protected int a,b;

	abstract public int calc(); 
	
	abstract public void input(int a, int b);

abstract public void run();


}
class Test extends Calculator {

	@Override
	public int calc() {
	
		return a+b;
	}

	@Override
	public void input(int a, int b) {
	
	System.out.println(a + b);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
	
/*	* 계산하는 메서드 선언 (계산결과를 리턴) calc()
	* 사용자부터 정수값 2개를 입력받는 메서드 input()
	* 계산기를 작동하는 메서드 run() -> 입력, 계산, 결과 출력
	* +, -처리하는 객체
	* -> 각각의 동작을 처리할 수 있도록 진행
	* */
	//////////////////////////////////////////////////////////


//abstract class Point {
//	private int a,b;
//	public abstract void move ();
//	
//	
//}
//
//
//
//class PointAdd implements Point {
//	
//}

class Point {
private int x,y=0;

	public Point() { }
	public Point(int x, int y) { this.x=x; this.y=y;}

	public void print() {
		System.out.println(x + " " + y);
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
	public void move(int x, int y) { // 좌표이동
		this.x= x;
		this.y=y;
	}
}

class ColorPoint extends Point{
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ColorPoint () { }
	public ColorPoint (String color) {this.color=color; }
	
	public void print (String color) {
		System.out.println(color + "색 좌표");
	}
	
}



public class Test1 {

	public static void main(String[] args) {

		/* Addinterface 인터페이스 생성 
		 * 정수값 2개의 합을 계산하는 동작
		 * 정수값 1개를 받아서 1~정수값까지 합을 출력 (계산) 동작
		 * 두개의 메서드는 동일한 이름의 형태로 선언 
		 * 
		 * 
		 * 인터페이스 구현 -> 결과확인 
		 * 
		 * */

///////////////////////////////////////////////////
/* 좌표를 표시하는 Point 객체
 * x,y좌표를 저장, 객제 생성시 해당좌표 초기화
 * 직접접근이 불가능 하기 때문에 좌표의 값을 가져오는 메서드가 있음
 * 좌표의 값을 수정하는 메서드 (한번에 2개의 좌표를 받아서 이동) move()
 * 
 * + 색상의 정보를 추가적으로 사용하는 좌표객체를 생성 ColorPoint
 * (10,20) 좌표 확인 / (100, 200) 파란색 좌표 확인 / (1,2) -> (3,5) 좌표 이동
 * 
 * 
 * 
 * */		
		
		Point w = new Point(0,0);
		ColorPoint a = new ColorPoint();
		w.print();
		w.move(10,20);
		w.print();
		a.print("파란");
	}
	
	
	
}
