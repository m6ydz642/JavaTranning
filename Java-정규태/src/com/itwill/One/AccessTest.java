package com.itwill.One;

public class AccessTest {
	private 	int a=10;
/* 생략	*/		int b=20;
	private 	int c=30;
	public		int d=40;
	
	public void print() {
		System.out.println("AccessTest_print() 호출");
		System.out.println("a : " + getA());
		System.out.println("b : " + getB());
		System.out.println("c : " + getC()); // 상속관계 (public) 
		System.out.println("d : " + d); // 모든 클래스 O 
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public String getD() {
		// TODO Auto-generated method stub
		return null;
	}
}
