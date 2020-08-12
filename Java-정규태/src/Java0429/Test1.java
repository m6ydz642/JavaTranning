package Java0429;

import java.util.Scanner;


class Student {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() { } // 기본생성자

}

class Phone{
	private String name;
	private int phone;

	public Phone() { } // 기본생성자

	public Phone(String name, int number) {
		this.name = name;
		this.phone = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {		
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public void address() {
		System.out.println("전화번호 : " + name + " - " + phone);
	}

}
public class Test1 {

	public static void main(String[] args) {

		/*
		 * 학생 객체 2개 생성 학생의 이름을 저장할 수 있는 객체 객체 생성시 초기화 가능 
		 * 이름 정보는 외부에서 직접 접근이 불가능, set/get() 해당 정보를 출력/수정
		 * 
		 */

		Student Jimi = new Student("지미");
		System.out.println(Jimi.getName());

			
		// 이름(name),전화번호(tel)을 필드로 가지고 있는 클래스 Phone
		// 정보를 외부 접근시 불가능
		// 객체 생성을 통해서 정보 초기화, 수정, 확인 (이름, 전화번호 동시에 출력)
		// 스캐너 입력을 통해서 정보 저장 사용
		Scanner scan = new Scanner(System.in);
		
		Phone s = new Phone ("ㅇㅇ", 234);
		s.address();
		
		System.out.println();
		
		System.out.println("입력할 횟수를 입력하세요");
		int cnt = scan.nextInt();
		
		for (int i=0; i<cnt; i++) {
		System.out.println("사용자 정보를 입력하세요 : ");
		
		String inputName = scan.nextLine();
		int inputTel = scan.nextInt();
		
		
		Phone test = new Phone (inputName, inputTel);
		test.address();
		}
	}

}
