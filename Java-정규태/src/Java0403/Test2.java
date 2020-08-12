import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner test = new Scanner(System.in);
		// switch ~ case 문
		// 정수식 : 정수형변수, 값, 문자형(char),문자열(한글/영어)

		// 각 케이스에서 break문을 만나면 종료된다.
		// 1) 만약에 해당 케이스에 break문이 없을 경우
		// 2)다음 break문을 찾을때 까지 모든 코드를 실행시킨다. (해당 케이스가 아니어도 실행됨)
		// 3) default문 / 마지막 케이스를 만나면 종료

		// while (true) {
		//
		// System.out.println("입력하세요 : ");
		// int input = test.nextInt();
		// if (input != 0) {
		// switch (input) {
		// case 10:
		// System.out.println("10!을 입력하셨네요");
		// break;
		// case 9:
		// System.out.println("9!을 입력하셨네요");
		// break;
		// case 8:
		// System.out.println("8을 입력하셨네요");
		// break;
		//
		// default: // else 같은놈
		// System.out.println("해당사항 없음");
		// break;
		// }
		//
		//
		// } else {
		// System.out.println(input + "을 입력하셨네요 종료합니다");
		// break;
		// }
		// }
		int num = 10;
		char ch = 'g';
		switch (ch) {
		case 'a':
			System.out.println("A");
		case 'b':
			System.out.println("B");
			break;
		case 'g':
			System.out.println("C");

		case 'e':
			System.out.println("d");
			break;

		default:
			break;
		}
		System.out.println("--------------------------------------------");
		String value = "미국";

		switch (value) {
		case "한국":
			System.out.println("한국");
			break;
		case "미국":
			System.out.println("미국");
			break;
		case "일본":
			System.out.println("일본");
			break;

		default:
			break;
		}

		System.out.println("-------------------------------");

		// 키보드 입력 해서 점수를 입력 받아서
		// 학생의 학점을 출력하는 프로그래램 생성
		System.out.println("점수를 입력하세요");
		int input = test.nextInt();
		if (0 <= input && input <= 100)

			switch (input / 10) {

			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
			case 5:
				System.out.println("F");
				break;

			default:
				System.out.println("에러");
				break;

			}
		else {
			System.out.println("0에서 100을 입력하세요 ^^;");
		}
	}

}
