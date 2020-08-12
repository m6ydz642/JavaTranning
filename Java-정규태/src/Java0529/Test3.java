package Java0529;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		try {
			
		
		// 해쉬 맵에 데이터를 저장 (해쉬이름, 인구수)
		// => 5개  키보드 입력( 스캐너 사용 )
		// KOR, 5000
		// CHI, 10000
		// USA, 3000
		// SWI, 200
		// FRA, 2500
		// 인구수가 가장 많은 해쉬의 이름과 인구수를 출력
		HashMap<String, Integer> 해쉬 = new HashMap<String, Integer>();
		
		int max = 0;
		String name ="";
		for (int i = 0; i < 5; i++) {
			String nara = scan.nextLine();
			 
			
			System.out.println("해쉬이름을 입력하세요");
		
			해쉬.put(scan.next(),scan.nextInt());

			// 인구수가 가장 많은 해쉬의 이름과 인구수를 출력
		
		
			  
		}  // for
		Set<String> names = 해쉬.keySet(); // 중복허용안되고 순서 X 
	
	 System.out.println(names);
	 // 해쉬 맵에 있는 키값만 Set타입의 형태로 리턴 해주는 메서드
	 System.out.println(해쉬.keySet()); // 위와 결과 동일
	 Iterator<String> it = names.iterator();
	 
	 System.out.println("-----------------------------------");
		while (it.hasNext()) {
			// System.out.println(it.next()); // names 값이 하나씩 사용
			System.out.println(해쉬.get(it.next())); // 인구수 출력
			
			String maxName = it.next();
			
			int 인구수 = 해쉬.get(maxName); 
			System.out.println(인구수); // 인구수 
			
			if(max < 인구수) {
				max = 인구수;
				name = maxName;
			}
			
		}
		
		System.out.println("인구수가 존나 많은 나라 " + name + max + "명");
		} catch (Exception e) {
		System.out.println("무슨 오류일까?");
		}
	}




}
