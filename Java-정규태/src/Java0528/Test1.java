package Java0528;

import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		// 제네릭타입 + 레퍼런스 형변환
		/* 상속이 전제된다. (관계있는 객체들은 융통성을 가지고 사용할 수 있다.) */
		
		Vector<String> vs = new Vector<String>();
		vs.add("Apple");
		vs.add("Orange");
		vs.add(0, "ㅋ");
		
		
		// vo = vs; (x)
		/* 기본적으로 String -> Object(업캐스팅 가능) 
		 * 제네릭 타입 String->Object(업캐스팅 불가능)
		 * 기존의 관계가 형변환이 가능하더라도, 제네릭타입으로 사용될경우
 		   형변환이 불가능해진다.
		 * 
		 * 와일드 카드 : 일반적으로 불가능한 형변환을 예외적으로 허용
		 * < ? > : 모든 타입의 객체를 사용
		 * <? super 타입> : 명시된 상위 클래스 형태를 사용할 수 있다.
		 * <? extends Object> : Object 클래스의 하위 클래스 형태를 사용할 수 있다.
		 * (일반적이지 않은 상황에 사용)
		 * 
		 * */ 
		Vector<? extends Object> vo; // 와일드 카드를 적용한 제네릭 타입
		// -> Object 클래스의 하위 클래스타입은 형변환 가능 하다
		vo = vs; // 와일드 카드 사용시 예외적으로 업캐스팅 가능
		
		for (Object o:vo) {
			System.out.println(o);	
		}
	
	}

}
