package 혼자테스트;

public class 래퍼클래스테스트 {

	public static void main(String[] args) {
		// Wrapper 클래스
		// - Boxing : 기본 자료형을 Wrapper 클래스의 객체로 변경하는 과정
		//
		//
		//
		// ex) Integer age = new Integer(30);
		//
		//
		//
		// - Unboxing : 각각의 객체를 기본 자료형으로 변경하여 사용하는 과정
		//
		//
		//
		// ex) int age2 = age.intValue();
		//
		//
		//
		// 출처: https://hyeonstorage.tistory.com/168 [개발이 하고 싶어요]
		/*
		 * 기본형 데이터 타입을 객체로 사용할 수 있도록 하는 클래스 -> 기본형 타입의 본질은 그대로 두고, 인터페이스만 제공해서
		 * 사용하는 것
		 * 
		 * [기본형 -> 참조형] boolean -> Boolean char -> Character byte -> byte short
		 * -> Short int -> integer long -> Long float -> Float double -> Double
		 * 
		 * Character, Integer를 제외한 나머지 타입을 첫글자만 모두 대문자로 변경
		 * 
		 */

		// 정수형타입 객체
		Integer num = new Integer(10);
		System.out.println(num);

		System.out.println("2진수 " + Integer.toBinaryString(num));

		/*
		 * 오토 박싱 & 오토 언박싱 -> 박싱 : 값형태의 데이터(기본형타입)가 Wrapper 클래스 (참조형 타입) 변환하는 것
		 * -> 언박싱 : Wrapper클래스 데이터가 값 형태의 데이터로 변환 -> JDK 6.0이후에는 자동으로 박싱, 언박싱이
		 * 처리된다.
		 * 
		 */
		/*
		 * https://hyeonstorage.tistory.com/168 참고해봐야쥐
		 */

		Integer 옵젝 = 61; // 오토박싱
		Integer ㅎㅎ = new Integer(12);
		int test = ㅎㅎ; // 언박싱
		System.out.println("----------------------------------------------");
		System.out.println("오토박싱 : " + 옵젝);
		System.out.println("언박싱 : " + test);
		/*
		 * AutoBoxing과 AutoUnBoxing 은 단지 기본형 타입과 상응하는 Wrapper class에만 일어난다. 다른
		 * 경우에 대입을 시도하면 컴파일 에러가 발생한다.
		 * 
		 * 출처: https://hyeonstorage.tistory.com/168 [개발이 하고 싶어요]
		 */
		System.out.println("----------------------------------------------");
		int num1 = 1000;
		int sum = num + num1;

		System.out.println("출력" + sum);

		System.out.println("----------------------------------------------");
		int n1 = 100;
		int n2;

		// Integer (10) = 10;
		Integer N1;
		Integer N2 = new Integer("300");

		N1 = n1; // 오토 박싱
		n2 = N2; // 오토 언박싱
		/////////////////////
		// N1 = new Integer(n1); // 박싱
		/////////////////////
		n2 = N2.intValue(); // 언박싱
		////////////////////

		char[] data = { 'A', 'a', '4', ' ' };

		for (int i = 0; i < data.length; i++) {
			if (Character.isUpperCase(data[i])) {

				System.out.println(data[i] + "값은 대문자 입니다");
			}

			// 소문자
			else if (Character.isLowerCase(data[i])) {
				System.out.println(data[i] + "값은 소문자 입니다");

			}

			else if (Character.isDigit(data[i])) {
				System.out.println(data[i] + "값은 숫자 입니다");
			}

			else if (Character.isSpaceChar(data[i])) {
				System.out.println(data[i] + "값은 공백 입니다");

			}

			// session.setAttribute("age");

		} // for

	}

}
