package Java0422;

public class Test1 {

	public static boolean inNumber(String s) {
		// String str = "12a45";
		char ch = ' ';
		boolean isNumber = true; // 뭔 용도인지를 모르겠다
		if (s == null | s.length() == 0) {
			System.out.println("공백이 있습니다!");
			return false;
		}

		for (int i = 0; i <= 4; i++) {

			if (s.charAt(i) <= 'Z') {
				ch = s.charAt(i);

				System.out.print(s.charAt(i));
				System.out.println("<<--- 내용 ");
			} else {
				System.out.print(s.charAt(i) + " <---- 문자가 포함되어있는데욥? 으~~딜 사기를 \n"); // 문자가
																					// 포함되어있다면
				isNumber = false;
				// ch = str.charAt(i);
				System.out.println("-----------------------------------------");
				System.out.print(s.charAt(i) + "<--- 가 문자인걸 들켰습니다\n"); // 문자가
																		// 포함되어있다면
			}

		}

		// System.out.println("str은 " + isNumber + "입니다");
		return isNumber;
	}

	public static int max(int[] array) {

		System.out.println("입력된 인자 ");
		return 0;
	}

	
	
	public static int[] shuffle(int ballarr[]) {
		
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
		
		return ballarr;
	}
	public static void main(String[] args) {
		/*
		 * 메서드 명 : isNumber public static 전달인자 : String, 리턴 : boolean
		 * 
		 * // 문자열의 값이 숭자인지 아닌지 판별하는 메서드 12345 - O (true) 123a4 - x (false)
		 * 
		 * 문자열이 null이거나, 빈문자열 ("")이면 false 값 리턴
		 * 
		 */
		System.out.println("값은 : " + inNumber("12a45"));

		System.out.println("-----------------------------------------");

		/*
		 * 메서드 명 : max public static 전달인자 int[], 리턴 : int
		 * 
		 * 5개 이상의 int타입의 값을 가진 배열중에서 가장 큰 값을 찾아서 출력 메서드
		 * 
		 * 만약에 배열이 null이거나, 배열의 크기가 0일때 에러코드의 의미로 -999999리턴
		 * 
		 * 
		 * -> 사용해서 출력
		 *
		 */

		////////////////////////////////////////////////////////////////
		/*
		 * 메서드 명 shuffle public static 전달인자 : int, 리턴 int[] 해당 배열을 전달 받아서 랜덤하게
		 * 배열의 요소를 정렬후 리턴
		 * 배열이 null이거나, 배열의 크기가 0일때 입력받은 배열을 그대로 리턴
		 * 
		 */
		int ballarr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int test[]={1,2,3,4,5};
		System.out.println(shuffle(ballarr));
	
		
	}
}