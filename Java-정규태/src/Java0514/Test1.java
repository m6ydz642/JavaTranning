package Java0514;

abstract class ABSClass {
	abstract void method1();

	void method2() {
		System.out.println("ABSClass_메소드2 호출");
	}
	// 오버라이딩 됐을때 부모의 메서드는 은닉됨
}
abstract class MiddleClass extends ABSClass{
	/*  추상클래스도 클래스이기 때문에 상속이 가능함
	 	-> 객체생성을 할 수 없기 때문에 추상메서드 호출이 불가능, 그래서 추상메서드를
		오버라이딩 하지 않아도 됨 -> 서브클래스가 모두 오버라이딩 해서 사용 
		
	*/
	
	public abstract void Method3();
	
	public void method1() {
		System.out.println("MiddleClass_Method1() 호출");
	}
}

class SUBMidClass extends MiddleClass{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}

	@Override
	public void Method3() {
		// TODO Auto-generated method stub
		
	}
	
}

class SUBClass extends ABSClass{

	@Override
	void method1() {
		System.out.println("SUBClass_메소드1 호출");

	}

	void method2() {
		super.method2(); // 강제로 호출?
		System.out.println("SUBClass_메소드2 호출");
	}
	
}
public class Test1 {

	public static void main(String[] args) {
		SUBClass a = new SUBClass();
		a.method1();
		a.method2();
		
	}

}
