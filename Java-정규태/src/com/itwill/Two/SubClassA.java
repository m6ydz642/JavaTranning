package com.itwill.Two;

import com.itwill.One.AccessTest;

class  SubOne extends AccessTest {

	public void prn() {
		System.out.println("Subone_prn() 메서드 호출");
	//	System.out.println("a: " + a);
		// System.out.println("b: " + b); // 같은 클래스, 같은 패키지가 아니라서 못씀 
		System.out.println("c: " + getC());
		System.out.println("d: " + d);
		
	}
}

public class SubClassA {

	public static void main(String[] args) {

//		System.out.println("a: " + a);
//		System.out.println("b: " + b); 
//		System.out.println("c: " + c);
//		System.out.println("d: " + d);

		// -> 모두 사용 x 
		
		AccessTest at = new AccessTest();
		
		at.print();
		System.out.println("main() 호출");
		System.out.println("a : " + at.getA());
		System.out.println("b : " + at.getB());
		System.out.println("c : " + at.getC());
		System.out.println("d : " + at.d); // d는 퍼블릭이라 객체를 통해 직접 접근 가능 
		
		SubOne so = new SubOne();
		so.prn(); 
		so.print(); // AccessTest객체의 메서드
		
	}

}
