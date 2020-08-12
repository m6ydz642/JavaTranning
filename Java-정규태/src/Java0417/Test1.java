package Java0417;

public class Test1 {

	public static void hello_itwill() { // 메서드 선언
	
		/*
		 * void : 메서드의 리턴값이 없음 ->특정 작업의 처리 동작만 구현함.
		 */
	
		System.out.println("Hello Itwill");
		System.out.println("Hello Java");
	}
	
	

	public static void hello_name(String name) { // 타입 매개 변수
		System.out.println("Hello" + name);
	}

	// 특정 결과를 리턴(돌려주는) 하는 메서드
	public static String hello () {
		
		return "Hello"; // 해당 메서드의 목적 (리턴후 동작은 없음), 리턴문을 만나면 종료됨
	}
	
	public static String rtnName (String name) {
//홍길동 + : 님 안녕하세요"		
	
		System.out.println(name + "님 안녕하세요 (print문)");
		String result = name + "님 안녕하세요 (result문)";
		return result;		
	}
	
	public static int wow () {
		
		return 0;
	}
	public static void main(String[] args) {
		/*
		메서드 : (함수) 특정 동작을 하기 위해서 한번에 여러개 구현하기 위한 방법
		객체지향 -> 메서드, 절차지향 : 함수
		
		 main 메서드 : 프로그램을 실행시키는 메서드
		 -> 모듈화 프로그래밍
		
		[접근지정자] [리턴타입] [메서드명] (전달인자1,... )  // 메서드 머리
		{
		실행동작;
		변수 선언;				// 메서드 몸통
		return 값;
		}
		
		 
		*/
		// 메서드 호출 (사용)
		hello_itwill();
		hello_name(" ㅎㅎ"); // String 인자가 있는 메소드
		hello_name(" wow");
		System.out.println("-----------------------------------");
		String str = hello();
		System.out.println(str);
		System.out.println(hello() );
		rtnName("앙기모띠");
		System.out.println(rtnName("reuslt"));
	}

}
