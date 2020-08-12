package Java0428;

class StaticTest {
	// 스태틱변수, 정적변수 -> 사용시 클래스이름.변수명 
	
	private static int a = 100;
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		StaticTest.a = a;
		// this.a = a; // x
	}
	
	int b = 200;

}

public class Test1 {

	public static void main(String[] args) {

		/*
		 * static : 객체 생성없이 사용할 수 있다. -> 메모리(heap) 에 없어도 사용가능하다.(클래스영역 메모리에 저장)
		 * -> 데이터를 공유하기 위해서
		 */
		
		// * 클래스 생성시에 static 붙은변수는 같이 생성됨 (미리 생성) 
		// -> 컴파일시 static변수를 미리 저장해서 사용 
		
		
		// 정보 a, b를 출력
		System.out.println("a : " + StaticTest.getA()); // 클래스 영역에 메모리가 올라감, 사용준비상태
		System.out.println("b : " + StaticTest.getA());
		
		StaticTest s =  new StaticTest();
		System.out.println("s.a : " + StaticTest.getA());
		System.out.println("s.a : " + s.b);
		StaticTest s1 =  new StaticTest();
		// StaticTest StaticTest.a = 500;
		// s1.getA = 500;
		s1.b=600;
		
		// System.out.println("s.a : " + s1.getA()); // X
		System.out.println("s.a : " + StaticTest.getA()); // O -> 객체생성없이 그냥 statictest가져다 쓰면됨
		System.out.println("s.a : " + s1.b);
		StaticTest s2 =  new StaticTest();
		System.out.println("s.a : " + s2.getA());
		System.out.println("s.a : " + s1.b);
		
		}

}
