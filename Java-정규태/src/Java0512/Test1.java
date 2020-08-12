package Java0512;

/* HandPhone - 모델명(model), 전화번호 (tel) 
 * -> 해당 객체를 생성시 모델명, 전화번호를 초기화 가능
 * -> 휴대폰 정보를 출력하는 동작 
 * 
 * DicaPhone - 모델명(model), 전화번호(tel), 화소 (pixel)
 * -> 해당 객체 생성시, 모델명, 전화번호, 화소를 초기화 가능하다.
 * -> 디카폰의 정보를 출력하는 동작
 * */

class HandPhone{
	protected String model;
	protected int  tel;
	HandPhone() {}
	HandPhone(String model, int tel) {
		this.model = model;
		this.tel = tel;
		
	}
	public void Print() {

		System.out.printf("모델 = %s \n전화번호 = %d \n", model, tel);
	}
	
}
class DicaPhone extends HandPhone {
	protected int pixel;
	DicaPhone() {}
	DicaPhone(String model, int tel, int pixel) 
	{
		super();
		this.pixel = pixel;
		this.model = model;
		this.tel = tel;

	}
	public void Print() {
		System.out.println("디카폰");
		System.out.printf("모델 = %s \n전화번호 = %d \n", model, tel);
		System.out.printf("픽셀 : %d만 화소\n ", pixel);
	
	}
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
}
class Parent{
	public void pprn() {
		System.out.println("pprn()");
	}
}
class Child extends Parent{
	public void pprn() {
		System.out.println("pprn(오버라이딩)");
	}
	public void cprn() {
		System.out.println("cprn()");
	}
	
}
public class Test1 {

	public static void main(String[] args) {
		/*
		클래스간의 관계가 is -a 관계일때 상속한다
		-> 객체 상호환계를 표현방법으로 체크한다.
		is -a 관계를 확인하는 연산자 : instanceof
		
		레퍼런스 변수 instanceof 클래스 타입 -> T/F
		args instanceof type
		*/

		HandPhone k  =  new HandPhone();
		k.model = "삼송";
		k.tel = 1234;
		k.Print();
		System.out.println("-----------------------------------------");
		HandPhone a = new HandPhone();
		a.tel=5678;
		a.model="화웨이";
		a.Print();
		System.out.println("-----------------------------------------");
		
		DicaPhone b = new DicaPhone();
		
		b.model = "앱등";
		b.tel = 1234;
		b.pixel = 800;
		b.Print();
		
		DicaPhone c = new DicaPhone("LG",12341234,1500);
		c.Print();
		
		if(c instanceof DicaPhone) {
			// c가 dicaphone타입인가? 
			System.out.println("c객체는 dicaphone이당");
		}
		
		if(c instanceof HandPhone) {
			// c가 dicaphone타입인가? 
			System.out.println("c객체는 HandPhone이당");
			System.out.println("그래서 HandPhone으로 형변환 가능 (업케스팅) ");
			System.out.println("HandPhone의 기능을 모두 사용가능하다 ");
		}
		
		System.out.println("-------------------------------------------------");
		/* hp객체가 DicaPhone객체인가?
		 * O = C 객체는 dicaphone입니다
		 * X = C객체는 dicaphone이 아닙니다(형변환 불가능)
		 * 
		 */
		
		if(c instanceof DicaPhone) {
			System.out.println("c 객체는 dicaphone입니당 "); // 상속되었을때
		}else {
			System.out.println("hp객체는 dicaphone이 아닙니덩 (형변환 불가능)"); // 상속이 아닐때
		}
		
		System.out.println("-------------------------------------------------");
		
		Parent p = new Parent();
		
		p.pprn();
		
		Child eg = new Child();
		eg.cprn();
		eg.pprn();
		
		System.out.println("-------------------------------------------------");
		
		// 업캐스팅 
		Parent p1 = eg;
		p1.pprn();
		// -> 오버라이딩 메서드 호출
		// -> 업 캐스팅 이후에도 상관없이 항상 오버라이딩된 메서드만 사용
		// 오버라이딩이 우선순위가 높음
		//
		// -> (부모의 메서드는 은닉된다) (중요한 개념)
		//p1.cprn(); // -> 업캐스팅시 상속받은 부분만 사용가능
		
		
	}

}
