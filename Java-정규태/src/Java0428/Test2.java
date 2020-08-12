package Java0428;

class Var{
	int iv; // 인스턴스 변수
	static int cv; // 클래스 변수, 스태틱 변수 (정적변수) 
	// * 멤버변수 = 인스턴스변수 + 클래스 변수
	
	public void method() {
		int lv; // 지역변수
	}
	
}
/*
 
 * 인스턴스 변수 : 객체 생성 후 사용할 수 있는 변수 (클래스가 메모리에 올라갈때(heap))
 각각의 메모리 공간을 사용. 클래스 영역에 선언해서 사용한다. 
 * 클래스 : 클래스 생성시 만들어지는 변수(클래스가 메모리에 올라갈 때(클래스 영역)) 
 클래스 생성시 만들어지는 공간에 서로 공유해서 사용. 클래스 영역에 선언해서 사용
 * 지역변수 : 클래스 이외의 영역에 저장 (메서드, 생성자) (메서드 호출시 - 변수 선언발생)
 메서드 사용 끝나면 사라짐.
 
*/

class MemberCall { // 멤버 : 변수 + 메서드
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
	// static int cv2 = iv; (x) static이 만들어지는 시점에 iv가 메모리에 없어서 사용불가 (static이 먼저 만들어짐
	// static int cv2 = new MemberCall().iv; static이 이미 만들어졌는데 또 객체를 생성해서 넣는거라서 사용 ㄴㄴ 
	// -> 가능하나, 사용하면 안됨.
	
	
	// 인스턴스 메서드, 클래스 메서드 (static)
	
	
	public static void Method01() { // 클래스 메서드 (static이 있어서)
		MemberCall t1 = new MemberCall();
		// System.out.println("인스턴스 변수 : " + iv); (x)		-> 만들어지는 시점에 없어서
		System.out.println("인스턴스 변수 : " + cv);
		
	}
	
	public  void Method02() { //인스턴스 메서드 (static 없음 )
		// System.out.println("인스턴스 변수 : " + iv); (x)		
		System.out.println("인스턴스 변수 : " + iv); // 객체 생성될때 변수가 만들어져서 사용가능
		System.out.println("클래스 변수 : " + cv); 
		
	}
	
	public  static void Method03() { //인스턴스 메서드
		
	Method01();
	// Method02(); // 객체생성이후에 만들어져서 static 상태로 호출안됨
		
	}
	
	public  void Method04() { //인스턴스 메서드
		
	Method01();
	Method02(); 
		
	}
	// static은 static 끼리 사용가능
	
	/*
	  만약 객체 생성시 클래스 멤버를 인스턴스멤버가 참조 / 호출할 경우 
	  클래스 설계를 잘못했는지 확인해본다.  
	 
	 * static 
	 1. 클래스 설계(생성시), 멤버 변수중 모든 인스턴스가 공통적으로 사용해야하는 값은
	 static 만들어서 사용한다. (객체를 각각 만들지 말고)
	 2. static 붙어있는 멤버는 객체생성없이 사용가능
	 -> 클래스 생성시 이미 메모리에 (클래스영역) 올라가 있기 때문
	 3. static 붙어있는 메서드는 인스턴스 변수를 사용할 수 없음
	 -> 인스턴스 메서드에 클래스 변수의 값을 사용가능
	 4. 메서드 구현시 인스턴스 변수 호출이 없을 경우 static 메서드로 변경할 것을 권유
	 (처리속도가 증가)
	 
	 
	 클래스 영역도 제한된 메모리 영역이기 때문에 효율적으로 배분해서 사용해야함
	 
	  
	 */
	
	
	 

}

public class Test2 {

	public static void main(String[] args) {
	// System.out.println(MemberCall.cv2);

	}

}
