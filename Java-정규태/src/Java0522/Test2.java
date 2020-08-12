package Java0522;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		/* 컬렉션 클래스 (p499~)
		 * -> 자료구조를 사용하기 위해서 구현한 클래스
		 * -> 요소라고 하는 데이터를 가변 인자의 저장소에 담을 수 있는 객체
		 * -> 객체를 저장하기 위해서 사용했던 고정길이 배열의 단점을 보완 (가변길이 배열)
		 * -> 한번에 다양한 형태의 데이터(객체)를 저장 가능
		 * -> 입력, 출력(검색), 삭제, 수정 간편 (CRUD)
		 * 제네릭 타입 + 컬렉션 클래스 (jdk 5이후)
		 * 
		 * // 모든 컬렉션 객체는 java.util 패키지에 포함되어있다.
		// => 사용시 java.util 패키지 import 반드시 해야한다.
		 * 
		 * 
		 * Collection 인터페이스를 상속 : 배열처럼 데이터를 여러개 저장가능
		//         객체의 타입과 상관없이 저장가능, 필요에따라서 저장공간이 자동증가
		// Set 계열 : 순서가 없는 집합. 중복을 허용 X		
		// List 계열 : 순서가 있는 집합. 중복을 허용 O
		 *
		 * set인터페이스
		 * -> 구현한 클래스 hashset생성
		 * 컬렉션클래스<E>제거하면 모든타입을 Object로 저장가능
		 * 
		 * */
		
		// HashSet set = new HashSet<>();
		Set set = new HashSet<>();
		
		
		set.add("하나"); // 오브젝트 타입인데 스트링형태로 업캐스팅된거
		set.add(2); // 오토박싱
		// int -> integer->object 오토박싱 + 업캐스팅
		
		set.add(3.1234);
		set.add("넷");
		System.out.println("요소의 개수 : " + set.size());

		System.out.println(set);
		System.out.println(set.toString());
		
		// List 계열 : ArrayList, vector, stack, linkedlist
		
		List arr = new ArrayList();
		
		System.out.println("요소의 개수 : " + arr.size());
		arr.add("하나"); // String -> Object 업캐스팅
		arr.add(2); // int -> Integer -> Object  오토박싱 + 업캐스팅
		arr.add(3.1234);
		arr.add("넷");
		arr.add("five");
		arr.add(6);
		arr.add(6);

		for (int i=0; i<arr.size(); i++) {
			System.out.println(i + " "+ arr.get(i)); // set방식 안됨
		}
		
		// Iterator 인터페이스 
		// -> 반복자 : 해당 컬렉션에서 현재위치, 다음 위치로 이동후 변경동작
		
		// 디자인패턴 : Iterator 패턴
		// 컬렉션의 종류와 상관없이 동일한 형태의 접근을 할 수 있다(이게 포인트)
		
		Iterator elements = set.iterator(); // 이형태로 바꾸면 반복할 준비가 됨
		
		
		while(elements.hasNext()) { // hasnext를 쓰면 사용가능 -> 불리언 타입 데이터 리턴, 요소가 있을 경우에만 true리턴
			System.out.println(elements.next());
		}
		
		Iterator elements2 = arr.iterator(); // arr자리에는 모든 컬렉션이 들어갈 수 있음
		
		while(elements2.hasNext()) { // hasnext를 쓰면 사용가능 -> 불리언 타입 데이터 리턴, 요소가 있을 경우에만 true리턴
			System.out.println(elements.next());
		}
		
		/* Enumberation 인터페이스 : Vector, HashMap(Table) 
		 * -> 반복처리 할 수 있도록 만들어 놓은 인터페이스 
		 * */
		System.out.println("--------------------------------------------------------");
		
		
		// Vector 클래스 
		 Vector vec = new Vector();
		// List vec = new Vector();
		
		// 클라이언트처리는 arraylist형태가 좋음
		 
	}

}


