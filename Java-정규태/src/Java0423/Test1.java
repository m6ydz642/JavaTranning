/*
접근지정자 : 변수, 메서드, 클래스 선언시 해당 동작을 사용할 수 있는 권한을 지정하는 방법
-> 데이터를 은닉시켜서 캡슐화한 데이터로 사용하게 하는 방법 
-> 데이터 보호목적


1) public  :  자신클래스, 같은 패키지, 상위(하위) 클래스, 전체
2) protected  : 자신클래스, 같은 패키지, 상위(하위) 클래스
3) 기본생성자 (default) : 생략 : 자신클래스, 같은 패키지에 있으면 쓸 수 있는 패키지
4) private : 자신클래스 (자기만 쓸 수 있는거)   
* 멤버 = 멤버변수 + 멤버 메서드




*/

package Java0423;

class Access {
	public	        int a;
	protected 		int b;
/*기본접근지정자*/  int c;
	private 	    int d;

}

class Animals {
	private String name;
	private int age;

	// set / get 메서드
	// set() : 정보를 전달받아서 멤버변수를 변경하는 메서드
	// get() : 처리된 결과(멤버변수)를 돌려주는 메서드
	// setXXXX() / getXXXX()
	public void setage(int newage) {
		age = newage;
	}

	public int getage() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Phone {
	String model;
	String color;

	public void phoneshowInfo() {
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
	}
}

public class Test1 {
	public static void hang() {
		System.out.println();
	}

	public static void main(String[] args) {
		/*
		 * 기본형 자료형(Primitive Type) -> 8가지 (boolean, char, byte, short, int,
		 * long, float,double)
		 * 
		 * 참조형 자료형 (Reference Type) -> 8가지를 제외한 모든 타입
		 * 
		 * 참조형 타입의 레퍼런스(참조변수)는 객체의 (위치) 값을 저장
		 * 
		 * 동물 객체 이름, 나이 (속성), 동작은 X . (연산자) 사용해서 개체의 변수, 메서드에 접근
		 */
		Animals dog = new Animals();

		 dog.setName("멍멍이");
		// System.out.println(dog.name = "멍멍이");
		// System.out.println((dog.age = 10) + "살");
		 System.out.println("동물의 이름 : "+ dog.getName());
		dog.setage(3);
		System.out.println("동물의 나이 : " + dog.getage());
		///////////////// 수정
		
		hang();

		Animals rabbit = new Animals();
		System.out.println(rabbit.name = "레빗");
		// System.out.println((rabbit.age = 5) + "살");

		rabbit.setage(5);
		hang();
		// 5살 고양이 객체 생성
		Animals cat = new Animals();
		System.out.println(cat.name = "야옹이");
		// System.out.println((cat.age = 100) + "살");

		cat.setage(100);
		// 동물 객체의 정보(이름, 나이) 알려주는 메서드
		// showInfo
		hang();

		cat.showInfo();

		// 전화기(Phone) 객체 생성
		// 속성 : 모델명, 색상
		// 자신의 모델명, 색상의 정보를 한번에 출력하는 메서드
		hang();

		Phone apple = new Phone();
		apple.model = "아이폰x";
		apple.color = "블랙";
		apple.phoneshowInfo();

		hang();

		Phone galxy = new Phone();
		galxy.model = "갤럭시";
		galxy.color = "하늘색";
		galxy.phoneshowInfo();

	}

}
