package Java0529;



class MyGeneric<W> {
	public MyGeneric () { }
	private W 변수;
	// * 변수 x의 값을 리턴하는 public 메서드 take() 생성
	
		// * 매개변수를 하나 가지고있는 compare()메서드 생성 (public)
		//   매개변수와 멤버변수가 같으면 true,다르면 false 리턴
		
		// * 해당 클래스를 String 타입으로 구체화 해서 사용 
	
	public MyGeneric(W 변수) {
		this.변수 = 변수;
	}
	public W get변수() {
		return 변수;
	}

	public void set변수(W 변수) {
		this.변수 = 변수;
	}


////////////////////////////////////////////////
	public W take() {
		
		return 변수;
	}
////////////////////////////////////////////////
	public boolean compare(W 변수) {
		if (this.변수.equals(변수)) return true;
		else return false;
	}
////////////////////////////////////////////////


	
}

public class Test1 {

	public static void main(String[] args) {

		MyGeneric<String> a = new MyGeneric<String>("Hello");
		
		// 제네릭타입이 지정된 클래스를 선언
		// MyGeneric / W 타입으로 구체화 
		// 속성을 저장하는 변수 x (외부 접근 불가능)
		// 오버로딩된 생성자 선언 
		
		System.out.println(a.take());
		System.out.println(a.compare("hello"));
		}

	

}
