package Java0429;

class Parent {
	public void pprn() {
		System.out.println("Parent_pprn호출");
	}

}

class Child extends Parent {

	public void cprn() {
		System.out.println("Child_cprn()호출");
	}
}

public class Test3 {

	public static void main(String[] args) {

/* 상속? : 자식이 부모가 가지고 있는 재산, 권력을 물려받는 것
-> 자바 상속 : 클래스간의 관계를 새롭게 지정
-> 특정 클래스(자식)는 다른 클래스가(부모) 가지고 있는 모든 멤버변수/메서드를 사용할 수 있는 것
 	* 부모클래스 (슈퍼클래스, 상위클래스) (같은 개념)
	* 자식클래스 (서브클래스, 하위클래스)

	* 상속 계층도
 
			생물
		 	/
		 동물 
  	    /    \
	   새	 강아지
			/      \ 
		  포메    시츄

 아래쪽으로 이동 : 특수화 (부모의 속성 + 개별 속성), 속성이 많다.
 위쪽으로 이동 : 일반화 (공통속성만 저장), 속성이 간단.
  
 상속 : 이미 정의된 속성(멤버)을 사용해서 새로운 객체를 생성하는 것
 상속은 부모클래스가 존재해야함.
 
 - 상속시 서브클래스는 부모클래스의 성격(특징)을 닮은 클래스로 구현.

   
 class 클래스명 extends(확장) 부모클래스명 {
 
 }
  
 */
		
		Parent a = new Parent();
		// a.cprn(); // 자식껄 못쓰네? (호출 안됨) 자식껄 안가지고 있어서 못씀
		a.pprn();

		System.out.println("------------------------------------------------");
		Child b = new Child();
		b.pprn();
		b.cprn(); // 상속 관계의 부모클래스 호출
		
		/* 상속은 왜 필요하나?
		 * -> 코드의 중복을 줄여서 객체지향 프로그래밍을 하기 위해서
		 * 
		 */
		
	}

}
