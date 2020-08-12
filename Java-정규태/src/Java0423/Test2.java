package Java0423;

import java.util.Scanner;

import com.itwill.Hello;
/*import java.lang.String;
 * import java.lang.*;
 * -> 생략가능 : java.lang 패키지에 있는 모든 클래스는 
 * import 구문 추가 없이 사용 가능
 * */


/*
 * import문은 프로그램의 최상단에위치
외부의 클래스를 가져와서 사용할 수 있도록 해준다.
자신의 클래스에 없는 정보(클래스)

*/

class Student {

	private String name;
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	private int room;

	// public void StudentList (){
	// System.out.println("학생 이름 : " + name + "전화번호 : " + phone + "강의실 번호 : " +
	// room);
	// }
}

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 학생정보를 저장하는 객체 이름, 전화번호, 강의실(외부 직접 접근 불가 -> setter/getter)
		 * 
		 * 홍길동, 010-1234-5678, 6 박학생, 010-1234-5678, 7
		 */

		Student hong = new Student();

		hong.setName("길동이");
		hong.setPhone("01012341234");
		hong.setRoom(6);

		System.out.println("학생이름 : " + hong.getName());
		System.out.println("폰번호 : " + hong.getPhone());
		System.out.println("강의실 번호 : " + hong.getRoom());

		Student park = new Student();

		System.out.println();

		park.setName("박학생");
		park.setPhone("01012341234");
		park.setRoom(2);
		System.out.println("학생이름 : " + park.getName());
		System.out.println("폰번호 : " + park.getPhone());
		System.out.println("강의실 번호 : " + park.getRoom());

		// 패키지 : 클래스 그룹(묶음)
		// -> 동일한 이름의 클래스를 사용해서 발생하는 문제를 예방
		// -> 패키지는 중복이 불가능
		// 패키지명 
		// [회사 도메인 주소.패키지명.클래스명] 
		
		// 부산 - A(01012341234)클래스, 부산(01056781234) - A클래스
		// 회사 정보 (도메인 : 인터넷주소)

		// www.itwillbs.co.kr -> 패키지
		// co.kr.itwillbs.class6.abc.java
		
		// www.itwillbs.co.kr.class6.(홍길동.java)
		// www.naver.com.class6.(홍길동.java)
		
		// naver.com.class6.(홍길동.java)
		// -> 
		// com.naver.class6.(홍길동.java)
		Test t = new Test();
		t.prn();
		
		
		Hello h = new Hello();
		
		h.Hello();
		
		Scanner scan = new Scanner(System.in);
		
		
	}

}
