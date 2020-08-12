package Java0529;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2다시1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		///////////////////////////////////////////////////////////
		// 학점 관리 프로그램 생성
		// 사용자로부터 학점('A','B','C','D','F')5개의 종류를 입력 가능하다
		// 5과목의 학점을 입력 ArrayList에 저장
		// => A-4.0,B-3.0,C-2.0,D-1.0,F-0.0
		// => 이때 패스 기준 : 15점 이상 패스 ,14~7점 보충수업, 6~0 재수강
		// ex) >> A B B C F (입력)
		// >> 학점의 총합 : 00/20.0 점 , 패스/보충수업/재수강

		ArrayList<String> 학점 = new ArrayList<String>();

		double 점수;

		double sum = 0;

		for (int i = 0; i < 5; i++) {
			String str = scan.nextLine();
			학점.add(str);

			switch (str) {
			case "A":
				System.out.println("A이군요");
				sum += 4.0;
				break;
			case "B":
				sum += 3.0;
				System.out.println("B이군요");

				break;
			case "C":
				System.out.println("C이군요");
				sum += 2.0;
				break;

			default:
				break;
			}
			System.out.println(학점);

		}
		System.out.println(sum + "/20");
		
		if (15 <= sum) {
			System.out.println(sum + "점이므로 패스!");
		}else if(7<=sum) {
			System.out.println("보충수업^^;;;;;;;");
		}
		
	}
}
