package Java0423;

class TestMath {
	/*
	 * 속성 x 동작3개 절대값을 계산 동작 (int, double,long 처리가능) -> abs() 메서드 오버로딩 해서 사용 ->객체
	 * 생성후 결과 테스트
	 */

	public static int abs(int num) {
		if (num < 0) {
			num = -num;
		} else {
		}

		return num;
	}

	public static double abs(double num) {
		if (num < 0) {
			num = -num;
		}

		return num;
	}

	public static long abs(long num) {
		if (num < 0) {
			num = -num;
		}

		return num;
	}
}
	
	
	/* TestMath2 객체를 생성해서 메서드 오버로딩을 사용 
	 * 속성 X, 동작 3개
	 * 전달받은 인자의 정보를 출력하는 메서드
	 * int 1개, int 2개, int 3개를 처리하는 메서드 생성
	 * 객체 생성후 호출
	 *  
	 */
class TestMath2 {

	public static void test(int a) {
		System.out.println(a);

	}

	public static void test(int a, int b) {
		System.out.println(a + b);

	}

	public static void test(int a, int b, int c) {
		System.out.println(a + b + c);

	}
}
//public static int test (int a, int b){
//			
//			return 0;
//		}
//public static int test (int a, int b, int c){
//	
//	return 0;
//}
	
	
//	public static int test(int test2) {
//
//		return test2 + test2;
//	}
//}


public class Test3 {

	public static void main(String[] args) {

		/*
		 * 객체지향 언어 다형성 : 동일한 형태의 동작으로 다양한 결과를 만들어 내는 형태 -> 이름이 동일한 메서드로 다양한 결과를
		 * 만들어내는것
		 * 
		 * -> 상속, 오버로딩, 추상메서드, 추상클래스, 인터페이스 모두 필요함
		 * 
		 * 그림을 그린다. -> draw(), paint(), print()......... -> draw(모양)
		 * 
		 * 메서드 오버로딩 : 동일한 이름의 메서드를 여러번 정의해서 사용하는 것 (재정의) 컴파일러가 메서드를 구분하는 기준(요소)
		 * : 메서드 시그니처(signature) 1. 메서드명(이름) 2. 전달인자 타입 3. 전달인자의 개수 4 -> 메서드
		 * 오버로딩 동일한 이름의 메서드를 재정의 해서 사용하는 것 
		 * 1) 전달인자의 타입이 다른경우 
		 * 2) 전달일자의 개수가 다른 경우
		 * 
		 * 동일한 이름의 메서드를 여러개 생성함 (필요에 따라서)
		 * 전달인자의 타입을 다르게 하거나, 전달인자의 개수를 변경해서 선언
		 * 
		 * 
		 * 
		 */
		System.out.println();

		TestMath test = new TestMath();
		// 전달인자의 타입을 변경해서 오버로딩

		System.out.println(test.abs(-100));
		System.out.println(test.abs(-1000L));
		// System.out.println(test.test(200)); // 전달인자 테스트

		System.out.println();

		TestMath2.test(10);
		TestMath2.test(20);
		/* 
		 * int add(int a, int b) {return a+b;}
		 * int add(int x, int y) {return x+y;}
		 * -> 전달인자의 이름이 다른경우 -> 오버로딩 X
		 * 
		 * int add(int x, int y) {return x+y;}
		 * public add(int x, int y) {return x+y;}
		 * -> 접근지정자가 달라도 상관 없음 -> 오버로딩 X 
		 * 
		 * int add(int x, int y) {return x+y;}
		 * long add(int a, int b) {return (long)(a+b); }
		 * -> 리턴타입도 달라도 상관없음 -> 오버로딩 X
		 * 
		 * long add(int a, long b) {return a+b;}
		 * long add(long a, int b) {return a+b;}
		 * -> 오버로딩 O
		 * add(100,200); // 둘중에 뭘 부를지 몰라서 에러남 
		 * x-> add(100L, 200);  
		 * 
		 */

	}

}
