import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 반복문 종류
		// for(일반, 확장), while, do-while

		for (int i = 1; i <= 10; i++) {

			System.out.println(i++);
			// i++;
		}
		System.out.println("홀수");

		for (int i = 2; i <= 10; i += 2) {

			System.out.println(i);

		}
		System.out.println("짝수");

		// 10부터 1까지 가로 출력

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// 구구단 2단
		/*
		 * <2단> 2 * 2 = 2 2 * 2 = 4 ... 2 * 9 = 18
		 */

		Scanner scan = new Scanner(System.in);

		int dan = 2;
		// int dan = scan.nextInt();

		// for (int i = 1; i <= 9; i++) {
		// // for (int j = 1; j <= 9; j++) {
		// System.out.printf("%d * %d = %d \n", dan ,i , i * dan);
		//
		// //}
		// }

		System.out.println("--------------------------------------------");

		// // 반복문 사용 누적연산
		// // 1~10까지의 합을 출력하시오
		// int sum=0;
		// for (int i=1; i<=10; i++) {
		// sum += i;
		// System.out.printf(" %d + %d = %d \n",i,sum, i+sum);
		// }
		// System.out.println("합 :" + sum);
		System.out.println("--------------------------------------------");

		// 팩토리얼
		// 5! => 5 * 4 * 3 * 2 * 1
		// 10! -> 10*...... * 1

		System.out.println("팩토리얼을 입력하세요 : ");
		int input = scan.nextInt();
		;
		int sum = 1;

		// for (int i=input; i>=1; i--) {
		// sum = input * i;
		// input * input-1 + sum;

		for (int i=1; i<=input; i++) {
			sum *= i;
		}
		System.out.println(sum);

	}

}
