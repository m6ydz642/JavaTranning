package Java0521;

class A{
	private int a,b;
	public void set(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class B extends A {
	protected int c,d;
	
}
class C extends B {
	public int e,f;
}

class D extends B{
	
}

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}


class Circle extends Shape{ // 상속 
	public void draw() {
		System.out.println("Circle");
	}
	
	public void paint() {
		// 1.shape출력
		super.draw(); // 은닉되어있는거 호출
		System.out.println("페인트");
		// 2. circle 출력
		this.draw();// 자기자신꺼 호출
	}
}

class TestA{
	
	private int x,y;
	public TestA() { }
	protected void setX (int x) {
		this.x = x;
		this.y=y;
	}
}


class TestB extends TestA {
	private int w;
	
	public TestB() { /* super(); // 가 생략되어있는것 */ } 
	// 서브클래스가 생성될때 기본적으로 부모의 생성자를 호출하게 되어있다
	
	
	
	protected void setXY(int a, int b, int c) {
		setX(a + b);
	//	y = b;
		w = c;		
	}
}


abstract class ABSShape { }

class Rect extends ABSShape{ }

/* ABSShape a; (o)
 * ABSShape a = new ABSShape(); (x)
 * ABSShape a = new Rect (O) // 업캐스팅이기 때문에 사용 가능
 */

/*전화번호를 저장하는 Phone 객체
 * 사용자의 이름, 전화번호를 저장하는 SamsungPhone 객체
 * -> 객체 생성시 (이름, 전화번호 정보를 초기화)
 * -> show() -> 개인정보(이름, 전화번호 출력) * 모든 핸드폰은 필수적으로 있어야 하는 기능
 * */
// 다음 시간에 컬렉션 하기러함

class Phone{
	protected String name;
	protected int number;
	
	public void show() {	
}

	
}
class SamsungPhone extends Phone {
	public void show() {
		
	}
}

public class Test3 {

	public static void main(String[] args) {
		A a = new A(); // 1
/*		a.a =10; (x)
		a.b = 10; (x)
		같은 객체라도 접근 지정자에 따른 범위가 지정되어있음
*/
		a.set(10, 20);
		
		B b = new B(); // 2
		
		// b.a = 10; (x) // private 라서 안되 
		b.c = 10; // 상속관계에 있을땐 사용할 수 있음
		b.d = 20;
		b.set(10,20); // 부모 메서드 호출
		
		C c = new C();
		// c.a=10; (x)
		// c.a=10; (x)
		c.c = 10;
		c.d = 20;
		c.set(10, 20);
		
		/*
		 * O X
		 * 1. 슈퍼클래스의 private 멤버는 서브클래스에서 바로 접근이 불가능 하다 O
		 * 2. 슈퍼클래스의 protected 멤버는 같은 패키지에 있는 서브클래스만 접근 가능하다. O
		 * 3. 슈퍼클래스의 public 멤버는 모든 클래스에서 접근이 가능하다. O
		 * 4. 메서드 오버라이딩의 경우 상속을 했을때만 사용가능하다. 
		 * 5. 메서드 오버라이딩은 서브클래스의 메서드를 재 정의해서 사용하는 것 X
		 * 6. 메서드 오버라이딩시 메서드 이름, 전달인자 타입, 개수, 리턴 타입,  모두 같아야 한다. O
		 * 7. 
		 */
		
		TestA aa = new TestA();
		TestB bb = new TestB();
		aa = new TestA();
		aa =bb; // 업캐스팅
		// bb = aa; // 다운캐스팅이지만(testA)를 명시하지않았기 때문에 컴파일 에러 (근데 명시해도 안됨) (x)
		
		System.out.println("--------------------------------------------------------");
		
		A ac = new C();
		
		System.out.println(ac instanceof A); // 상속관계가 있나? -> true
		System.out.println(ac instanceof B); // c객체 위에 있는 부모가 b라서 가능
		System.out.println(ac instanceof C); // 자기자신이라 가능
		System.out.println(ac instanceof D); // 관계가 없어서 false, c랑 d는 관계가 없음 (B랑 C의 관계가 있는거임)
		
		System.out.println("--------------------------------------------------------");
		System.out.println(new D() instanceof A); // D위에 B, B위에 A가 있어서 관계가 있음 (true)
		System.out.println(new D() instanceof B); // 
		// System.out.println(new D() instanceof C); //  D는 C랑 관계가 없음
		
		System.out.println(new B() instanceof C); // 관계가 없음, B객체가 C를 상속하고 있냐

		System.out.println("--------------------------------------------------------");		
		////////////////////////////////////////////////////////////////////////
		Shape shape = new Shape();
		shape.draw();
		////////////////////////////////////////////////////////////////////////
		Circle circle = new Circle();
		circle.draw();
		Shape ss = new Circle(); // 부모타입의 객체에 자식이 들어가있음 (업캐스팅) 
								// 부모의 메서드가 은닉됨
		ss.draw();
		// ss.paint(); // 업캐스팅하면 상속받은 부분만 쓸 수 있어서 그냥은 못씀
		Circle cs = (Circle)ss; // 다운캐스팅
		cs.paint();
		
		////////////////////////////////////////////////////////////////////////
		
		System.out.println("--------------------------------------------------------");		
		Circle sh = new Circle();
		sh.paint();
		sh.draw();
		System.out.println("--------------------------------------------------------");	
		
	}

}
