package Java0508;

import com.itwill.Two.SubClassA;

/* 일반 좌표(x,y), 컬러좌표(x,y,color)   
 * 파란색(10, 10) 좌표 생성 -> 출력 
 * 
 * */

class Normal {
	 int x, y;
	public Normal () { 
		this.x = 0;
		this.y = 0;
	}
	public Normal (int x, int y) { 
		this.x = x;
		this.y = y;
	}
	public void print () {
		System.out.println("일반좌표 : " + x + ", " +  y);
	}
	
class ColorPoint extends Normal { // 컬러좌표
	String color;

	public ColorPoint() { 
		this.color = "컬러기본값";
	}
	public ColorPoint(int x, int y, String color) {
		super(x,y); // 생성자중 인수있는 생성자 가져옴
//		super.x = x;
//		super.y = y;
		
		this.color = color;
	}
	@Override
	public void print() {
	System.out.println("색상 : " + color);
		super.print(); // 부모 클래스의 print포인터
	}
	
//	public void print () {
//		System.out.println("컬러좌표 : " + x + ", " +  y + " = " + color);
//	}


}

class Point3D extends Normal {
	private int z;
	public Point3D () {
		x  = 0;
		y  = 0;
		z  = 0;
	}
	public Point3D (int x, int y, int z) {
		super(x,y);
		this.z= z;
	}
	@Override
	public void print() {
		System.out.printf("3D : %d,%d,%d 값 ", super.x , super.y ,z ); // x, y는 부모에게서 받아옴
	}

	
}


}

class SuperClass {
	public SuperClass () { } // 습관적으로 만드는 것을 추천
	/* -> 생성자가 없을 경우 자동으로 컴파일러가 
	 기본생성자를 생성한다. (오버로딩된 생성자가 없을 경우)
	 -> 가능하면 클래스 설계시 기본 생성자는 사용유무와 상관없이 그냥 생성 추천
	  
	*/
	public SuperClass (int a) {
		
	}
}
class SubClass extends SuperClass {
	public SubClass() {
		// super(); // 자동으로 호출됨
		super(10); // 인수있는 생성자를 호출하거나 기본 생성자를 만들거나 둘중에 하나
		// -> 레퍼런스를 사용해서 슈퍼클래스의 생성자를 명시적 호출
	}
	public SubClass(int a ) { 
		// super(); // 자동으로 호출됨
		// super();
		super(20);
		// -> 
	}
}



public class Test2 {
	public static void main(String[] args) {

		Normal a = new Normal(10, 10);
		a.print();
		Normal b = new Normal(20, 30);
		b.print();
		//  ColorPoint c = new ColorPoint(40, 20, "검정");
		
//		Point3D c = new Point3D(10,20,30); // 왜 안되노 ㅡ,ㅡ
//		c.print();

	}
	
	
}
