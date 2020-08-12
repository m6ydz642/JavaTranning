package Java0528;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Circle{}




public class Test2 {

	public static void main(String[] args) {
		
		// O , X
		
	/*			 컬렉션들은 배열과 다르게 객체(참조형타입)만 삽입 가능하다 - O
				 컬렉션중에 List 계열, Vector<V>, ArrayList<E>,
				 Stack<S>,LinkedList<L>등이 있다  - O
				 모든 컬렉션 객체들은 제네릭 타입으로 지정되어있다 - O
				 컬렉션은 배열처럼 요소를 저장하는 공간이 고정되어있다 - X (가변길이 배열)
				 제네릭은 클래스,인터페이스,메서드를 특정타입에 종속되지 않도록하는 방법(기술) O 
				 제네릭은 기본기능으로 자바에서만 사용되는 기술이다 - X (C++,C#)
				 Vector<V>   V => 제네릭 타입( 타입 매개변수 )
				 제네릭 타입은 기본형 데이터를 사용할수 있다 - X  (Wrapper 클래스사용)
	*/
				
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		
		System.out.println("size = " + v.size());
		// v.add(3.124); (x)
		// v.add(100); (O)
		System.out.println("용량 : " + v.capacity());
		
		Vector<String> a = new Vector<String>();
		HashMap <Integer, Double>  test = new  HashMap <Integer, Double>();
		a.add("흠");
		System.out.println("-------------------");
		ArrayList<Circle> arr = new ArrayList<Circle> (); // 자주 보게될 형태
		
		
		// 실수형 데이터를 저장하는 ArrayList 생성
		// 임의의 값 5개 저장
		
		ArrayList<Double> 리스트 = new ArrayList<Double> ();

		리스트.add(3.14);
		리스트.add(3.785412);
		리스트.add(4.785412);
		리스트.add(5.785412);
		리스트.add(6.785412);
		
		for (Double d: 리스트) {
			System.out.println(d);	
		}
		System.out.println("-------------------");
		
		for (int i=0; i<리스트.size(); i++) {
			System.out.println(리스트.get(i));
		}
		System.out.println("-------------------");
		
		Iterator<Double> 이터 =  리스트.iterator();
		
		while (이터.hasNext()) { 
			System.out.println(이터.next());
		}
		System.out.println("-------------------");
		
		
	
		try {
			Vector<String> 구체화 = new Vector<String>();
			구체화.add("good");
			구체화.add("bad");
			
			System.out.println(구체화);
			System.out.println("사이즈 : " + 구체화.size());
			
			구체화.remove(0);
			System.out.println(구체화);
			 System.out.println("사이즈 : " + 구체화.size());
			
			구체화.add(0, "itwill");
			System.out.println(구체화.elementAt(0));
			System.out.println(구체화.elementAt(1));
			System.out.println("사이즈 : " + 구체화.size());
			
			구체화.add(2, "Itwill"); //예외 발생 
			// 2번을 건너뛰고 3번이나 4번으로 가면 중간에 공백이 생기는데 메모리에 그렇게 안넣어줌
			System.out.println(구체화);
			
		} catch (Exception e) {
			System.out.println("무슨오류야?");
		}
		
		  // 개인정보 검색 프로그램 
		HashMap <String, Integer>  개인정보 = new  HashMap <String, Integer>();
		Scanner 개인정보입력 = new Scanner(System.in);
		
	
		
		
		개인정보.put("김학생",18);
		while (true) {
			System.out.println("이름을 입력해주세요 : (이름)");
			String name = 개인정보입력.nextLine();
			

			if (개인정보.get(name) != null) { // null (값이 안맞는경우)

				System.out.println("입력한 이름에 대한 나이와 이름" + 개인정보.get(name)); // 개인정보.get(scan.next()); // 도가능
			} else {
				System.out.println("그딴 학생은 없습니다 다시 하세요");
				System.out.println("");
			}
		}
	}

}


