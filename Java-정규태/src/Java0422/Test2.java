package Java0422;

// 학생 객체를 생성하고자 한다. 
// 이름, 나이 정보를 저장하고 있다. -> 맴버 변수 (명사) : 해당 데이터를 저장할 수 있는 타입 사용
// 공부하기, 놀기 동작을 할 수 있음 -> 맴버 메서드 (함수) (동사) :

class Student { // 학생 클래스

	String name;
	int age;

	public void study() {
		System.out.println("공부중");

	}

	public void play() {
		System.out.println("노는중");

	}

}

// 자동차 클래스 -> 자동차 객체

class Car { // 자동차 클래스

	int good = 10;
	String wow = "wow";

	public class test {

	}
}

public class Test2 {

	public static void main(String[] args) {

		/*
		 * 클래스 : 객체를 만들기 위해서 생성한 틀 (코드) 객체(인스턴스) : 모든 대상 (프로그래밍에 사용할 객체)
		 */

		// * 클래스는 대부분 선언후 인스턴스화 해서 사용해야 함(메모리에 올리는 작업) 해서 사용해야함
		// -> 객체 생성은 main()메서드에서 실행

		Car bus = new Car(); // 자동차 객체 생성
		// Car : Car타입 (사용자 정의 타입)
		// bus : 변수
		// bus : Car 타입의 변수 (참조변수, 래퍼런스)
		// new : 연산자 (인스턴스화- 메모리에 올리는 작업)
		// Car() : 객체

		// 학생 객체 생성

		System.out.println(bus.good);
		System.out.println(bus.wow);

		Student kim = new Student();

		System.out.println(kim.name = "홍길동");
		System.out.println(kim.age = 10);
		kim.study();
		kim.play();

		// 학생 2 객체 생성
		// 동일한 형태의 객채는 추가 클래스 생성 없이 사용 가능
		Student jung = new Student();
		// 작업순서(1번) Student jung(3번) = new(2번) Student();
		System.out.println(jung.name = "정학생");
		System.out.println(jung.age = 20);

		Student s1 = new Student();

		// 메모리 관리
		// -> 자바에서는 메모리 관리 해주는 가비지 컬렉터(컬렉션) 존재한다.
		// 자바에서는 메모리 생성 / 해제를 개발자가 직접할 필요가 없음
		// 알아서 해줌

		// -> 개발의 편의성 제공함
		// (단점)
		// 메모리 회수시점을 알 수 없음. (가비지 컬렉터가 알아서 판단하고 처리)

		// * 가비지(garbage) : 쓰레기값
		// -> 참조하는 레퍼런스가 없는 객체 or 배열
		// Car c = new Car();
		// new Car(); // 참조할게 없는 쓰레기값

		/*-> 자바는 실시간 처리 프로그램에 부적합하다.
		 * 
		 * 
		 * 
		*/
		System.gc(); // 가비지 컬렉터 작동 요청
	}

}
