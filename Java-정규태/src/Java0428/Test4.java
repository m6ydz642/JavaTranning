package Java0428;

/* MyMath 객체 생성
 * long 타입의 인스턴스 변수 2개를 가지고 있음.
 * 인스턴스 메서드 4개를 사용해서 사칙연산을 리턴 ( + - * / )
 * 객체의 변수값을 사용해서 계산
 * 100, 200의 사칙연산값을 출력
 * 
 * 
 * MyMath클래스에 
 * 클래스 메서드 4개를 오버로딩을 사용해서 생성
 * 전달인자 2개를 전달받아서, 사칙연산후 결과 리턴
 * 
 * 
 */

class MyMath {
	long a, b; // 인스턴스 변수

	public MyMath() {
	} // 기본생성자

	public MyMath(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public long Add() {
		return a + b;

	}

	public static long Add(int a, int b) {

		return a + b;
	}

	public long Sub() {
		return a - b;
	}

	public static long Sub(int a, int b) {

		return a - b;
	}

	public long Mul() {
		return a * b;
	}

	public static long Mul(int a, int b) {

		return a * b;
	}

	public long Div() {
		return a / b;
	}

	public static long Div(int a, int b) {
		return a / b;
	}

}

public class Test4 {

	public static void main(String[] args) {
		// MyMath 객체 생성시 데이터 100, 200값으로 초기화

		// good.a=100;
		// good.b=200;
		//
		// System.out.println("더하기 :" + (good.a + good.b));
		// System.out.println("나누기 : " + (good.a / good.b));
		// System.out.println("곱하기" + (good.a * good.b));
		// System.out.println("빼기" + (good.a - good.b));

		// MyMath good = new MyMath();
		// good.a = 100; // 이방법도 되고
		// good.b = 200;

		MyMath good = new MyMath(100, 200); // 이 방법도 됨

		System.out.println(good.Add());
		System.out.println(good.Div());
		System.out.println(good.Mul());
		System.out.println(good.Sub());

		System.out.println("");
		

		System.out.println(MyMath.Add(100,200));
		System.out.println(MyMath.Div(100,200));
		System.out.println(MyMath.Mul(100,200));
		System.out.println(MyMath.Sub(100,200));

		
	}

}
