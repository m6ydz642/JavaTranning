package Java0409;


public class Test1 {

	public static void main(String[] args) {
		// 조건식 만들기 (연습 문제)
		/*
		 * 1) int형 변수x가 10보다 크고, 20보다 작을때 true ------> if (x > 10 && x < 20) //
		 * 레알 참 트루
		 * 
		 * 2) char형 변수 ch가 'x' 또는 'X'일때 True ------> if (ch == 'x' || ch=='X')
		 * 
		 * 3) char형 변수 ch가 영문자일때 true(대문자) ------> if (ch <= 65 && ch <= 90) //
		 * 대문자만 4) int형 변수 y가 400으로 나누어 떨어지거나 또는 4로 나눠떨어지고, 100으로 나누어 떨어지지 않을때
		 * true가 되는 조건식 ------> if(y % 400 == 0 && y % 4 == 0 && y % 100 != 0)
		 * 
		 * 5) boolean형 변수 powerOn가 false 일때 true가 되는 조건식 ------> if (powerOn ==
		 * false) 또는 !powerOn
		 * 
		 * (다른 문제) 1부터 20까지 정수 중에서 2의 배수 또는 3의 배수가 아닌 수의 총 합을 계산하시오.
		 * 
		 *
		 */

		int i, sum = 0, j;
		for (i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}

			System.out.println(sum + "= 나온수 ");

		}

		System.out.println(sum + "= 합??? ");

		/*
		 * 두 개의 주사위를 던져서, 눈의 합이 6이 되는 경우의 수를 계산 1 + 5 = 6
		 */
		System.out.println("----------------------------------");
		int number = 0;
		int cnt = 0;
		for (i = 1; i <= 6; i++) { // 주사위 한개

			for (j = 1; j <= 6; j++) // 다른 주사위
			{
				if (i + j == 6) {
					System.out.printf("%d + %d = %d \n", i, j, i + j);
					cnt++;
				}

			}

		}
		System.out.println("주사위 경우의 수 : " + cnt);
		System.out.println("----------------------------------");

		// 방정식 2x + 4y = 10을 만족하는 모든 해를 구하시오
		// 단 x,y는 정수 (0 <=x<=10, 0<=y=10)
		int x, y;
		cnt = 0;
		for (x = 0; x <= 10; x++) {
			for (y = 0; y <= 10; y++) {
				if (2 * x + 4 * y == 10) {
					// System.out.println("수" + x + "x" + y + "y");
					System.out.printf("x=%d y=%d \n", x, y);

				}
			}

		}
		System.out.println("----------------------------------");

		/*
		 * 피보나치 수열 : 1번, 2번 자리는 항상 1, 그 다음부터는 바로 앞에 2개의 합을 저장
		 * 
		 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		 * 
		 * 10번째 까지의 피보나치 수열을 출력
		 * 
		 */
		sum = 0;

		// 버블소트같은?????????????????ㅜ
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;

		// for (i = 1; i <= 10; i++) {
		//
		// if (i == 1) {
		//
		// System.out.print(num1 + " ");
		// } else if (i == 2) {
		// System.out.print(num2 + " ");
		// } else { // 3번자리 이상
		// num3 = num1 + num2;
		//
		// System.out.print(num3 + " ");
		//
		// num1 = num2;
		// num2 = num3;
		//
		// }
		//
		// }

		/////////////// 반복문을 작게 사용하는 피보나치 수열
		num1 = 1; // 재사용
		num2 = 1;
		num3 = 0;

		System.out.printf(num1 + " " + num2 + " ");
		for (i = 1; i <= 8; i++) {
			{
				num3 = num1 + num2;

				System.out.print(num3 + " ");

				num1 = num2;
				num2 = num3;

			}

		}

		System.out.println("----------------------------------");
		for (i = 0; i <= 10; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(" ★ ");
			}
			System.out.println();
		}

		//////// 위의 소스코드 while문으로 변경
		System.out.println("----------------------------------");

		i = 1;

		while (i <= 10) {
			j = 0;
			while (j <= i) {
				System.out.print(" ★ ");
				j++;
			}

			System.out.println();
			i++;
		}
		System.out.println("----------------------------------");

		/*
		 * 다음 계산의 결과를 출력하시오 1 +(1+2)+(1+2+3)+(1+2+3+4)+.......+(1+2+3....+10)
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		sum = 0;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= i; j++) {
				System.out.printf("%d + ", j);
				sum += j;
			}

			System.out.println("");

		}
		System.out.println("합 " + sum);
		System.out.println("----------------------------------");
		/*
		 * 1 + (-2) + 3 + (-4) + 5 + ....... 이 연산을 처리해서 결과가 100되는 시점을 출력
		 * 
		 */
		
		sum = 0;
		for (i = 0; ; i += 2) {
		
			
			System.out.printf("(%d) + ", -i);
			System.out.printf("%d +  ", i + 1); 
			
		
		
			
		System.out.println("\n");
		sum += i; // 양수, 음수 덧셈용
	
		System.out.printf("합 : %d", sum); // 마지막에  2 증가 더해서 삭제 
//		if (sum >= 100 ) {
//			System.out.println("강종");
//			break;
//		}
	} // 메인 마지막

}

} // 클래스 마지막
