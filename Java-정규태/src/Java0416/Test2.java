package Java0416;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test2 {

	public static void main(String[] args) {

		int[] stars = { 1, 6, 7, 8, 5, 3, 4, 6, 2, 8 };

		// 1 *
		// 6 ******
		// ...
		// 8 ********
		char result = '*';
		// 배열 갯수 만큼 별 출력
		for (int i = 0; i < stars.length; i++) {
			System.out.println(stars[i]);
			for (int j = 0; j < stars.length; j++) {

				if (stars[i] > j) {
					System.out.print(result + " ");
				}
			}
			System.out.println(" = result ");

		}
		// 1~9 사이의 숫자중에서 숫자를 하나씩 뽑아서
		// 3자리 숫자를 만들려 한다. (단, 각 자리의 숫자는 중복이 없음)

		// 358 (o) 332(x) 313(x)
		// -> 1~9중에서 중복되지 않는 3자리 숫자를 출력하시오.

		for (int i = 0; i <= 10; i++) {
			int number1 = (int) (Math.random() * 9);
			int number2 = (int) (Math.random() * 9);
			int number3 = (int) (Math.random() * 9);

			System.out.printf("랜덤 숫자 뽑기 = ");

			System.out.print(number1);
			System.out.print(number2);
			System.out.print(number3);
			System.out.println();

			if (number1 == number2) {
				System.out.printf("같은 수로 나온수 ");
				System.out.print(number1);
				System.out.println(" 이 중복이 네요?");
			} else if (number2 == number3) {
				System.out.printf("같은 수로 나온수 ");
				System.out.print(number2);
				System.out.println(" 이 중복이 네요?");

			} else if (number1 == number3) {
				System.out.printf("같은 수로 나온수 ");
				System.out.print(number3);
				System.out.println(" 이 중복이 네요?");

			}

		}
		// 1부터 9까지의 숫자가 랜덤하게 정렬된 수를 3개 뽑는다.
		// ->

		int ballarr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// 위치 교환 -> 임시변수를 사용한 스왑
		System.out.println("스왑띠 = " + ballarr[0]);
		System.out.println("정렬전 배열-------------------------- ");
		for (int i = 0; i < ballarr.length; i++) {

			System.out.print(ballarr[i] + " ");
		}
		int swap[] = { 0 };
		int tmp;

		tmp = ballarr[1];
		ballarr[1] = ballarr[0];
		ballarr[0] = tmp;

		for (int i = 0; i < ballarr.length; i++) { // 배열 끝까지
			// 배열의 모든 요소를 랜덤하게 정렬
			int r = (int) (Math.random() * ballarr.length);

			tmp = ballarr[i];
			ballarr[i] = ballarr[r];
			ballarr[r] = tmp;

			System.out.println("i= " + i + " " + "random = " + ballarr[r]);

		}

		System.out.println("정렬후 배열-------------------------- ");
		for (int i = 0; i < ballarr.length; i++) {

			System.out.print(ballarr[i] + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("배열내용 랜덤으로 꺼내오기");
		for (int i=0; i<3; i++) {
			System.out.printf(ballarr[i] + " ");
		}
		
	}

}
