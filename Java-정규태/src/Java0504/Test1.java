package Java0504;

import java.util.Set;

class Point2D {
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
class Point3D extends Point2D { // 2d로부터 상속

	private int z;
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
}

public class Test1 {

	public static void main(String[] args) {

		
		/*
		 * 상속 : 서브클래스가 슈퍼클래스를 상속해서 사용하는 것 
		 * -> 기존의 코드 (슈퍼클래스)를 활용해서 서브클래스를 생성
		 * -> 소스코드의 재활용 
		 *  
		 *  (10, 20)의 좌표를 표현하시오
		 */

		Point2D p2 = new Point2D();
		p2.setX(10);
		p2.setY(20);
		
		System.out.println(p2.getX() + "," + p2.getY() );
		
		Point3D p3 = new Point3D();
		p3.setX(10);
		p3.setY(10); // 부모의 메서드를 사용
		p3.setZ(10);
		
		System.out.println(p3.getX() + "," + p3.getY() + "," + p3.getZ() );
	}

}
