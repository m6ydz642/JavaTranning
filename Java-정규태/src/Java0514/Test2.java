package Java0514;

abstract class Shape {
	public abstract void draw(String color);
	
}

class Circle extends Shape { // 원
	public void draw(String color) {
		
		System.out.println(color + "색 원을 그린다");
	}
//	public void draw(String color) {
//		System.out.println(color + "색 원을 그린다");
//	}

	
	}


class Tria  extends Shape{ // 삼각형
	public void draw(String color) {
		System.out.println(color + "색 삼각형을 그린다");
	}
}

class Rect  extends Shape { // 사각형
	public void draw(String color) {
		System.out.println(color + "색 사각형을 그린다.");
	}
}


public class Test2 {

	public static void poly(Shape ref) {
		ref.draw("알 수 없는 ref");
		
	}
	
	
	public static void main(String[] args) {
		/* 추상클래스 -> 왜 만들까? -> 다형성
		 * 유사한 형태의 클래스 (객체)를 구현할때 공통적으로
		 * 있어야 하는 기능을 부여하기 위해서
		 * */
		Circle c = new Circle();
		Rect r = new Rect();
		Tria t = new Tria();
		
		c.draw("빨간");
		r.draw("노랭이 ");
		t.draw("검정");
		
		System.out.println("------------------------------------------------------------");
		
		/*
		Shape s  = new Shape(); (x)
		-> 추상클래스는 객체를 생성할 수 없음
		*/
		
		// 추상클래스의 레퍼런스는 사용가능하다.
		Shape s;
		s = new Circle(); // 업캐스팅
		s.draw("빨간");
		s = new Rect();
		s.draw("에잇! ");
		s = new Tria();
		s.draw("시발");
		
		/* 동일한 이름의 동작 호출을 통해서 서로 다른 객체 호출
		 * + 필요한 객체가 있을경우 직접 호출해서 사용가능 (배열)
		 * 
		 * */
		System.out.println("------------------------------------------------------------");
		Shape[] b = new Shape[3]; // (O)
		// -> 추상클래스 타입의 배열객체 생성

		
		b[0] = new Circle(); // 업캐스팅
		b[1] = new Rect();
		b[2] = new Tria();
		
		for (int i=0; i<b.length; i++) {
			b[i].draw("검은");
			b[i].draw("빨간");
		}
		
		Circle c1 = new Circle();
		Rect r1 = new Rect();
		Tria t1 = new Tria();
		System.out.println("------------------------------------------------------------");
		poly(c1); // 인자로 전달
		poly(r1);
		poly(t1);
		
		
		/* 추상 클래스
		 * 1) 추상클래스도 클래스이다.
		 * 2) 상속이 가능하다. (extends)
		 * 3) 변수, 상수 사용가능
		 * 4) 일반 메서드, 추상메서드 사용가능
		 * 5) 모든 추상메서드는 메서드 오버라이딩 구현해서 사용해야한다.
		 * 6) 업캐스팅이 가능 (참조변수는 사용가능)
		 * 7) 단일 상속만 가능하다. (부모 클래스가 하나) 
		 * 8)  
		 */
	}

}
