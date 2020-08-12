import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 분기문 if -> 하나의 조건이 만족할 때 실행할 수 있는 코드

		// // if - else 문
		// if () {
		//
		// }else{
		//
		// }

		// 정수형타입의 변수 생성후 1234이라고 하는 리터럴값을 저장
		// 변수의 값이 홀수 / 짝수 판별
		int a = 1000000000;
		int num = 3;
		if (a % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		if (num % 2 != 0) {
			System.out.println("홀수");
		}

		if (num % 2 == 0) {
			System.out.println("짝수");
		}

		// 절대값 계산
		// 10 -> 10, -10 ->

		int jul = 5;

		if (jul > 0) {
			System.out.println("양수" + jul);
		} else {
			System.out.println("음수 " + (jul * -1));

		}
		System.out.printf("-----------------------------");
		// if (jul > 0) System.out.println("양수" + jul); else
		// System.out.println("음수 " + (jul * -1));
		// if (num < 0) {
		// System.out.println("num : " + (-num));
		// }
		if (jul < 0) {
			jul = -jul;
		}
		System.out.println("jul : " + jul);
		System.out.println("jul : " + jul);

		System.out.println("삼항연산자-----------------");
		System.out.println(jul < 0 ? "양" + -jul : "음수 : " + jul);

		// if-else if()문
		// if() {
		//
		//
		// }
		// else {
		//
		// }

		// 변수의 값이 정수인가를 판단하시오
		// 양의 정수, 음의정수,0)
		System.out.println("--------------------------");
		int good = 1;
		if (good > 0) {
			System.out.println("양수" + good);
		} else if (good < 0) {
			System.out.println("음수 " + good);
		} else if (num == 0) {
			System.out.println(" 0?");
		}

		// * 여러개의 조건문을 처리할때는 항상 else구문과 함께사용해서 처리하는 것이 안전한 데이터처리 방법이다. (권장)
		// 점수를 저장하는 변수 score생성
		// 점수 입력

		// 90~100 -> A
		// 80~89 -> B
		// 70~79 -> C
		// 60->69 ->D
		// F

		// score = Integer.parseInt(args[0]) ;

		// 생성
		Scanner scan = new Scanner(System.in);

		// 키보드 입력(데이터 입력)
		while (true) {
			System.out.println("학교이름을 입력하세요 : ");
			String input = scan.nextLine();

			System.out.println("점수를 입력하세요 : ");
			int score = scan.nextInt();

			if (score >= 90) {
				System.out.println("AAAAAAAAAAAAA학점");
			} else if (score >= 80) {
				System.out.println("BBBBBBBBBBBBB학점");
			} else if (score >= 70) {
				System.out.println("CCCCCCCCCCCCC학점");
			} else {
				System.out.println("학교 왜 다니세요?\n\n ");
			}

			System.out.println(input + "학교를 나오셨군요!?");

			// 키보드값 입력하기 (스캐너)
		}

	}
}
