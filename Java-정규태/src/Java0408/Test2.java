import java.util.concurrent.CountDownLatch;

public class Test2 {

	public static void main(String[] args) {
		// 제어문의 활용(분기문, 반복문)

		// 1~10 홀수, 짝수의 합을 각각 계산후 출력 (for)
		int sum = 0;

		for (int i = 1; i <= 10; i += 2) {
			sum += i;
			System.out.println(i + " ");
		}
		System.out.println(sum + " = 홀수덧셈");

		sum = 0;
		for (int i = 2; i <= 10; i += 2) {
			sum += i;
			System.out.println(i + " ");
		}
		System.out.println(sum + " = 짝수 덧셈");
		// for안에 if-else 사용

		sum = 0;
		int sum2 = 0;
		for (int i = 0; i <= 10; i++) { // 짝수
			if (i % 2 == 0) {
				sum += i;
			} else {
				sum2 += i;
			}
		}

		System.out.println(sum + " = if문사용 짝수 덧셈");
		// System.out.println(i + "+" + sum2 + "= if문사용 홀수 덧셈");
		System.out.println(sum2 + " = if문사용 홀수 덧셈");
		System.out.println("----------------------------");

		// 이중 for문 (다중 for문)

		for (int h = 3; h <= 5; h++) { // 시침
			for (int m = 0; m <= 59; m++) { // 분침
				System.out.println(h + "시" + m + " 분");
			}
			System.out.println("정각알림 : 집에 가고싶다");
		}
		System.out.println("----------------------------");
		// 구구단

		for (int i = 2; i <= 9; i++) { // 앞단
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) { // 뒷단
				System.out.printf("%d X %d = %d \n", i, j, i * j);
			}
			System.out.println(" ");
		}

		System.out.println("----------------------------");

		// 별 그리기
		// *
		// *
		// *
		// *
		// *

		// 1.

		for (int i = 1; i <= 5; i++) {
			System.out.println("★");
		}

		System.out.println("----------------------------");

		// 2. * * * * *
		for (int i = 1; i <= 5; i++) {
			System.out.printf(" ★ ");
		}

		System.out.println("");
		System.out.println("----------------------------");

		// 3.
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *

		for (int i = 1; i <= 5; i++) {
			System.out.println("");
			for (int j = 1; j <= 5; j++)
				System.out.printf(" ★ ");
		}
		System.out.println("");

		System.out.println("----------------------------");
		for (int i = 1; i <= 5; i++) {
			System.out.printf(" ★  ★  ★  ★  ★ ");
			System.out.println();
		}
		System.out.println("----------------------------");

		for (int i = 0; i < 5; i++) { // 강사님의 별
			for (int j = 0; j < 4; j++) {
				System.out.printf(" ★ ");
			}
			System.out.println(" ★ ");
		}

		// 4. 
		
        // *
		// * *
		// * * *
		// * * * *
		// * * * * *
		System.out.println("----------------------------");

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.printf(" ★ ");
			}
			System.out.println("");
		}
		System.out.println("----------------------------");

		// 5. 
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
		for (int i = 5; i > 0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.printf(" ★ ");
			}
			System.out.println("");
		}
	
	
	// 6. 
		// * * * * *
	  //     * * * *
//	     	   * * *
//	     		 * *
		//         *
		
		System.out.println("6번 문제");
		for (int i = 5; i > 0; i--) {
			System.out.println("공백 ");
			for (int j = 0; j < i; j++) {
			
				System.out.printf(" ★ "); 	
			}
			
			System.out.println(" ");
		}
	
		// 
		// 숙제........
		// -----------------------------------------------------------
		/*
		 * 안해도 됨 (추가 문제)
		 * 
		 1
		 2 3
		 4 5 6
		 7 8 9 1 0
		 11 12 13 14 15
		 
		 1 2 3 4 5
		 6 7 8 9
		10 11 12
		 13 14
		 15
		 */
		System.out.println("-----------------------------------");
		int time = 10000;
		for (int i=10; i>=0; i--) {
		  for (long j=0; j < 10000000000000L; j++); 
		  
			  // System.out.println("로딩...");
			System.out.println(i);
		} 
		System.out.println("시작");
		}
		
	}


