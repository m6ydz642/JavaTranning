package Java0519;

public class Test3 {

	public static void main(String[] args) {

/*예외처리 
예외 : 일반적이지 않은 상황. 프로그램이 실행되는 동안의 예기치 못한 에러 

=> 프로그래머가 예상하지 못한 상황  -> 프로그램이 종료된다.
자바에서는 예외들을 객체로 처리  
*/
		

		int a = 10, b1 = 0, b2 = 2, c = 10;
		System.out.println("A : " + a);
		System.out.println("C : " + c);
		
		c = a / b2;
		System.out.println("C : " + c);
		c = a / b1;
		System.out.println("C : " + c);

		System.out.println("여기까지 도착시 정상 종료됨 c : " + c);
	}

}
