package Java0504;
class Parent {
	public void pprn() {
		System.out.println("Parent_pprn() 함수 호출");
	}
	public void pprn(int a) {
		System.out.println("Parent_pprn(a) 함수 호출");
	}
}

class Child extends Parent{
//	public void pprn() { 
//		super.pprn(); // 부모클래스의 pprn호출
//		System.out.println("Child_pprn() 함수 호출 (오버라이딩)"); // 오버라이딩
//	}
	
// ↑ 오버라이딩 수동으로 작성한것
	@Override // (어노테이션) : 특수한 기능을 가지고 있는 값 (키워드)
// -> 해당메서드가 오버라이딩된 메서드 라는 것을 알려줌 (생략가능)
	
	public void pprn(int a) {
		System.out.println("자동완성 오버라이딩"); // 오버라이딩
		super.pprn(a);
	}
	public void cprn() {
		System.out.println("Child_pprn() 호출");
	}
}



class DateY{
	protected int y = 2020;
	protected int m = 5;
	protected int d = 4;
}
class DateMD extends DateY{
	// 은닉변수, Shadow변수
	protected int m = 12;
	protected int d = 31;
	
	public void today(){
		
		System.out.println(y + "/" + super.m + "/" + d);
	}
}

public class Test3 {

	public static void main(String[] args) {
		/* 메서드 오버라이딩 
		 * 서브클래스에서 슈퍼클래스와 동일한 이름의 메서드를
		 * 다시 정의해서 사용하는 방법 (기존의 메서드는 사용하지 않고, 오버라이딩된 메서드만 사용)
		 * ※ 오버라이딩은 상속이 있어야 사용 가능 (오버로딩, 오버라이딩차이는 상속차이)
		 * -> 슈퍼클래스의 메서드는 은닉되고, 서브클래스의 메서드가 호출
		 * 
		 * 1) 메서드 명
		 * 2) 전달인자의 타입 
		 * 3) 전달인자의 개수
		 * 4) 리턴타입도 같아야 함
		 * 5) 접근지정자(*서브클래스의 메서드는 슈퍼클래스의 메서드 접근지정자보다 좁아질 수 없음)
		 * -> 위 5가지 항목이 같을 경우에만 사용 
		 * 
		 * 
		 * 오버로딩, 오버라이딩
		 * -> 둘다 동일한 이름의 메서드를 사용하는 것 (다형성)
		 * 
		 * 오버로딩 : 메서드의 형태를 다르게 해서 여러번 사용
		 * 오버라이딩 : (상속) 완전히 동일한 메서드를 다시 재정의해서 사용
		 * 
		 * 
		 * 오버라이딩된 메서드를 사용할 때 은닉되어있는 슈퍼클래스의 메서드 호출시 레퍼런드 super을 사용
		 * 
		 * 
		 *  
		 * */
		
		System.out.println("---------------------------------------");
		Parent p = new Parent();
		p.pprn();
		System.out.println("---------------------------------------");
		// p.cprn(); (x)
		Child c = new Child();
		c.cprn();
		c.pprn();
		c.pprn(2);
		
		DateMD md = new DateMD();
		md.today();
		
	}

}

