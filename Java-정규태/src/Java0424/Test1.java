package Java0424;

class ProTest {
	/*  속성 고려 X 
	 *  동작
	 *  test() -> 작동
	 *  100회 테스트
	 *  전달인자 0,1,2,3 -> 메서드 호출이 전체 95%
	 *  전달인자 100, 200... -> 메서드 호출이 전체 5%
	 *  
	 *  이때 개발자로서 생각해봤을때 객체의 구현을 하시오
	 * 
	 * */
	public void test(){
		System.out.println("test() 호출");
	}
	
	public void test(int a){
		System.out.println("test(int a) 호출");
	}
	
	public void test(int a,int b){
		System.out.println("test(int a, int b) 호출");
	}
	
	public void test(int a, int b, int c){
		System.out.println("test(int a, int b, int c) 호출");
	}
	
	public void test(int ... num){
		System.out.println("가변인자 호출");
	}
	
}
public class Test1 {

	public static void method(int ... a) { // 가변인자
											// 메모리를 더 많이 먹어서 비효율 (남용 X)
		System.out.println("메서드 실행!");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		/*
		 * 메서드의 전달인자의 개수가 1~50개 필요하다.
		 * 
		 * 가변인자(Varargs) : 메서드의 전달인자가 가변할 수 있도록 처리
		 * java1.8(JDK8) -> JDK 5.0이후 도입된 개념
		 * 가변인자의 활용을 적절하게 섞어서 사용해야함. 
		 * 
		 * (가변인자는 배열을 생성, 초기화 해서 사용하기 때문)
		 *
		 * */
		// method(10);
		Test1 t1 = new Test1();
		t1.method(30);
		t1.method(10);
		t1.method(10,20,30);
		
		ProTest t2 = new ProTest();
		t2.test();
		t2.test(1);
		t2.test(1,2);
		t2.test(1,2,3);
		t2.test(1,2,3,4,5,6,7,8);
		
	}

}
