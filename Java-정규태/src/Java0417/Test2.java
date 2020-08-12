package Java0417;

import java.util.Scanner;

public class Test2 {

	public static void Hello() {
		System.out.println("안녕하세요 홍길동 입니다");

		String test = "테스트";
	}

	public static void inputNumber() {

		// Scanner scan = new Scanner(System.in);
		// int input = scan.nextInt();
		//
		// // System.out.println("값을 입력해주세요 : ");
		// scan.nextInt();

	}

	public static void ckNumber1(int number) {

		if (number >= 0)
			System.out.println("양수네요");
		else
			System.out.println("음수네요");
	}

	public static void ckNumber2(int number) {
		if (number % 2 == 0) {
			System.out.println("짝수네요");
		} else {
			System.out.println("음수네요");
		}
	}

	public static void sumNumber(int number) {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.println("1부터" + number + "까지의 합 : " + sum);
	}

	public static void absNumber(int number) {

		// if (number > 0) {
		// System.out.println("|" + number +"|+" + number );
		// }else {
		// System.out.println("|" + number +"|+" + (-number) );
		// }
		if (number < 0)
			number = -number;
		System.out.println("|" + number + "|" + number);

	}

	public static double APlusB(double a, double b) {
		return a + b;
	}

	public static void Myinfo(String a, int b, String c) {
		System.out.println("---------------");
		System.out.println("학생이름 : " + a + " \n" + b + "번강의실     \n주소 : " + c + " ");
	}

	public static int sumSubject(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("합 : " + sum);
		return sum;
	}

	public static double avgSubject(double a, double b, double c) {
		double sum = a + b + c;
		System.out.println("평균 : " + sum /3);
		 return sum /3;
	//	return sumSubject(a,b,c) / 3.0;
	}

	public static void main(String[] args) {
		/*
		 * "안녕하세요" 홍길동 입니다 출력하는 메서드를 생성 public static 같이 사용 리턴 타입 x, 전달인자 x ->
		 * 메서드 사용 출력
		 *
		 * 
		 */

		Hello();
		System.out.println("--------------------------------------------------");
		// public static, 리턴타입 x, 정수형 타입의 데이터 1개를 필요로 하는 메서드,
		// inputNumber() -> 전달한 숫자 출력 해주는 메서드 "입력값 : 00"
		System.out.println();
		/*
		 * ckNumber1() : 전달받은 값이 양수/음수 판별, ckNumber2() : 전달받은 값이 홀수 /짝수 판별
		 */
		ckNumber1(30);
		ckNumber2(50);

		// public static, 리턴타입 x, 정수형 타입의 데이터 1개를 필요로 하는 메서드,
		/*
		 * sumNumber() => 1~전달한 숫자까지의 합을 출력
		 */
		sumNumber(10);

		/* absNumber() -> 해당입력받은 숫자의 절대값을 출력 */

		absNumber(10);

		// public static, 리턴 : 연산의 결과, 실수형 데이터2개를 입력해서
		// 2개의 변수 합을 출력하는 메서드 APlusB()

		double a = 10.8;
		double b = 11.1;

		double test = APlusB(a, b);
		System.out.println("입력받은 값" + a + "과" + b);
		System.out.println("결과물 : " + test);

		System.out.println("또는 " + APlusB(10.8, 8.1));

		// public static, 리턴x, 전달인자 3개 필요
		// Myinfo(), 사용자의 이름, 강의장 번호, 자신의 위치
		//
		Myinfo("학생", 23, "192.168.6.4");

		// public static, 리턴 : 각각 연산의 결과를 리턴,
		// 전달인자 3개,
		// sumSubject() -> 과목점수 3개의 합을 리턴 하는 메서드 생성
		// avgSubject() -> 과목점수 3개의 평균을 리턴하는 메서드 생성
		// -> 호출(출력)

		sumSubject(10, 10, 10);
		avgSubject(10, 20, 30);
		

	}

}
