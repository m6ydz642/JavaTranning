package Java0508;

class AA {
//	public AA() {
//		System.out.println("생성자 AA");
//	}
	public AA(int a) {
		System.out.println("생성자 AA (int)");
	}

}

class BB extends AA {
//	public BB() {
//		
//		System.out.println("생성자 BB");
//		System.out.println("부모의 디폴트 생성자가 없을경우 에러 발생");
//		System.out.println("부모의 디폴트 생성자를 지정하거나 생성자가 하나도 없으면 가능");
//	}
	public BB(int a) {
		super(a);
		System.out.println("생성자 BB (int)");
	}
}

class A {
	public A() {

		System.out.println("생성자 A");
	}
}

class B extends A {
	public B() {

		System.out.println("생성자 B");

	}
}

class C extends B { // 부모의 부모관계가 생김 (손자됐네)
	public C() {

		System.out.println("생성자 C");

	}
}

class Parent {
	public Parent() {
		System.out.println("슈퍼클래스 : Parent() 기본생성자 ");
	}
}

class Child extends Parent {
	public Child() {
		super(); // 부모의 생성자 호출 // 상속하면 자동적으로 이 코드가 생략되어있음
		System.out.println("서브클래스 : Child() 기본생성자");
	}
}

public class Test1 {

	public static void main(String[] args) {

		/*
		 * 상속관계에서의 생성자 -> 생성자는 상속이 가능한가? -> 불가능
		 * 
		 * 생성자는 상속이 불가능하다. (상속되지 않는 유일한 멤버메서드) 슈퍼클래스의 생성자를 호출하지 않아도 자동으로 호출 된다.
		 * (서브클래스의 생성자가 자동으로 슈퍼클래스의 생성자를 호출)
		 * 
		 */

		/*
		 * 서브클래스는 상속하기 위해서 부모 객체가 필요하다 서브클래스 객체(인스턴스) 생성시 슈퍼클래스의 생성자 호출 슈퍼클래스
		 * 생성자 먼저 실행후, 서브클래스 생성자 실행.
		 * 
		 * 
		 */

		new Parent();//// 생성자 호출
		System.out.println("-----------------------------------------------");
		// 객체생성 = 생성자호출과 같음

		// 서브클래스 생성자 호출 (슈퍼클래스도 같이 호출됨)
		new Child();
		System.out.println("-----------------------------------------------");
		/*
		 * A B C 상속관계 new A()
		 */
		new A();
		System.out.println("-----------------------------------------------");
		new B();
		System.out.println("-----------------------------------------------");
		new C();
		System.out.println("-----------------------------------------------");
		/*
		 * -> 서브클래스가 생성되기 위해서 상위클래스의 모든 객체가 생성되야 한다. (부모클래스의 생성자를 자동으로 호출)
		 */
		
		System.out.println("-----------------------------------------------");
	//	new BB();
		
		System.out.println("-----------------------------------------------");
		new BB(10);
		/* 서브클래스의 어떠한 생성자도 슈퍼클래스의 디폴트 생성자를 호출한다.  */
		
		// super(a,b,c,..)사용해서 부모의 오버로딩된 생성자 호출이 가능
		

	}

}
